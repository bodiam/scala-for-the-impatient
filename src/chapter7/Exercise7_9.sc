/**
 * @author Erik Pragt
 */


import java.lang.System._

object ReadPassword extends App {
  private val password = console().readPassword("Password:")

  if(new String(password) != "secret") {
    err.println("Oops, wrong password")
  } else {
    println(s"Hello ${getProperty("user.name")}")
  }
}
