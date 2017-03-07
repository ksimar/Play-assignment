package controllers

import play.api.mvc.{Controller, Action}

class SignUpController extends Controller {

  def signUp = Action {
    Ok(views.html.signUp())
  }

}
