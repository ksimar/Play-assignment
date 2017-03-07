package models

case class Person(name: Name, credentials: Credentials, mobileNumber: String, gender: Gender, age: Int, hobbies: Option[List[String]])
