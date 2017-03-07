package controllers

import com.google.inject.Inject
import play.api.mvc.{Action, Controller}

class SignUpController @Inject() extends Controller {

  def signUp = Action {
    Ok(views.html.signUp())
  }

}
