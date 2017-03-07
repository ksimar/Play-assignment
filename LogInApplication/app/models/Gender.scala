package models

sealed abstract class Gender(val genderValue: String)

case object Female extends Gender(genderValue = "female")
case object Male extends Gender(genderValue = "male")