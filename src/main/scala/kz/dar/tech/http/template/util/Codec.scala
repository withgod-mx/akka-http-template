package kz.dar.tech.http.template.util

import kz.dar.tech.http.template.model.{Summary, User}

trait Codec {

  implicit val userEncodeDecode: EncoderDecoder[User] = DerivedEncoderDecoder[User]

  implicit val summaryEncodeDecode: EncoderDecoder[Summary] = DerivedEncoderDecoder[Summary]



}
