package exercises.chapter09

import java.io.File

/**
  * 9. Write a Scala program that counts how many files with .class extension are
  *    in a given directory and its subdirectories.
  */
object Exercise09 extends App {

  val dir = new File("src/exercises/chapter09")
  val allFiles = dir.listFiles
  val subdirectories = allFiles.filter(_.isDirectory)

  // Count class files in this directory
  var numClassFiles = allFiles.filter(_.toString.endsWith(".class")).size
  // Count class files in subdirectories
  for(s <- subdirectories) numClassFiles += s.listFiles.filter(_.toString.endsWith(".class")).size

  assert(numClassFiles == 5)
}
