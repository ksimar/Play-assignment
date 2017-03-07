package controllers

import com.google.inject
import play.api.mvc.{Action, Controller}

class LogInController @inject.Inject() extends Controller {

  def logIn = Action {
    Ok(views.html.logIn())
  }

}
