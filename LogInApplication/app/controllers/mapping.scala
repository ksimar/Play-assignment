/*
package controllers

import play.api.mvc.Form._
import play.api.mvc.Form.data._


class Mapping {

  val personData: Form[Person] = Form(
    mapping(
       "Name" -> mapping(
         "fName" -> nonemptyText,
         "lName" -> nonEmptyText,
         "mName" -> Optional(text)
       )(Name.apply)(Name.unapply),
      "Credentials" -> mapping(
        "userName" -> nonEmptyText,
        "password" -> nonemptyText
      )(Credentials.apply)(Credentials.unapply),
      "mobileNumber" ->  text verifying pattern("""[0-9.+]+""".r, error="A valid phone number is required"),
      "gender" -> mapping(
        "genderValue" -> text
      )(Gender.apply)(Gender.unapply),
      "age" -> number,
      "hobbies" -> optional(list(text))
    )(Person.apply)(Person.unapply)
  )

}
*/
