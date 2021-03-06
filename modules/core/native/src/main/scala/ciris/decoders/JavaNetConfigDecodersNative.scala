package ciris.decoders

import java.net._

import ciris.ConfigDecoder

trait JavaNetConfigDecoders {
  implicit val inetAddressConfigDecoder: ConfigDecoder[String, InetAddress] =
    ConfigDecoder.catchNonFatal("InetAddress")(InetAddress.getByName)

  implicit val uriConfigDecoder: ConfigDecoder[String, URI] =
    ConfigDecoder.catchNonFatal("URI")(new URI(_))
}
