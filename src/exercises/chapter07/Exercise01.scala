package exercises.chapter07

/**
 * 1. Write an example program to demonstrate that
 * 			package com.horstmann.impatient
 * 		is not the same as
 * 			package com
 * 			package horstmann
 * 			package impatient
 */
object Exercise01 {
  
}

package com.horstmann {
  object Horst {
    val test: String = "test"
  }
}

package com {
  package horstmann {
    package impatient {
      class A {
        println(Horst.test)
      }
    }
  }
}

package com.horstmann.impatient {
  class B {
//    println(Horst.test) // won't compile
  }
}