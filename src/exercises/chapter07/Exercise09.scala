package exercises.chapter07

import java.lang.System

/**
 * 9. Write a program that imports the java.lang.System class, reads the user name
 * 		from the user.name system property, reads a password from the Console object,
 * 		and prints a message to the standard error stream if the password is not
 * 		"secret". Otherwise, print a greeting to the standard output stream. Do not use
 * 		any other imports, and do not use any qualified names (with dots).
 */
object Exercise09 extends App {
  
  val userName = System.getProperties.getProperty("user.name")
  
  if(args.length > 0 && args(0) == "secret") { 
    println("Hello, " + userName)
  } 
  else if(args.length == 0) { 
    println("Please enter password")
  }
  else {
    println("Password is incorrect")
  }
}