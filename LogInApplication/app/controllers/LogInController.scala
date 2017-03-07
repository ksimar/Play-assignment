package controllers

import play.api.mvc.{Controller, Action}

class LogInController extends Controller {

  def logIn = Action {
    Ok(views.html.logIn())
  }

}
