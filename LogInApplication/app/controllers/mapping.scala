package controllers

import models.{Credentials, Gender, Name, Person}
import play.api.data._
import play.api.data.Forms._
import play.api.mvc.{Action, Controller}
//import services.


class Mapping extends Controller {

  val personForm: Form[Person] = Form(
    mapping(
       "Name" -> mapping(
         "fName" -> nonEmptyText,
         "lName" -> nonEmptyText,
         "mName" -> optional(text)
       )(Name.apply)(Name.unapply),
      "Credentials" -> mapping(
        "userName" -> nonEmptyText,
        "password" -> nonEmptyText
      )(Credentials.apply)(Credentials.unapply),
      "mobileNumber" ->  text,                     //verifying pattern("""[0-9.+]+""".r, error="A valid phone number is required"),
      "gender" -> text,
      "age" -> number,
      "hobbies" -> optional(list(text))
    )(Person.apply)(Person.unapply)
  )

//  def savePerson = Action {
//    implicit request =>
//      personForm.bindFromRequest.fold(
//        formWithErrors => {
//          Redirect(routes.SignUpController.signUp()).flashing(
//            "error" -> "Something went Wrong Please Try Again Later")
//        },
//        personData => {
//          DatabaseServer.addPerson(personData)
//          Redirect(routes.HomeController.profile()).withSession(
//            "username" -> userData.uname)
//        }
//      )
//  }

}
