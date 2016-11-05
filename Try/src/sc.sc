
object sc{
	val msg = "Hello"                         //> msg  : String = Hello
	val l = List(1, 3, 2)                     //> l  : List[Int] = List(1, 3, 2)
	l.foreach(println)                        //> 1
                                                  //| 3
                                                  //| 2
	(1 -> 2) == (1, 2)                        //> res0: Boolean = true
	(1, 2)                                    //> res1: (Int, Int) = (1,2)
	println("""|Welcome to Ultamix 3000.
				|Type "HELP" for help.""".stripMargin)
                                                  //> Welcome to Ultamix 3000.
                                                  //| Type "HELP" for help.
                                                  
   val f = (_:Int) + (_:Int)                      //> f  : (Int, Int) => Int = <function2>
   f(2, 5)                                        //> res2: Int = 7
   def sum(a: Int, b: Int, c: Int) = a + b + c    //> sum: (a: Int, b: Int, c: Int)Int
   val b = sum(1, _:Int, 3)                       //> b  : Int => Int = <function1>
   b(2)                                           //> res3: Int = 6
                         
   println {2}                                    //> 2
 
 def byNameAssert(predicate: => Boolean) =
if (!predicate)
throw new AssertionError                          //> byNameAssert: (predicate: => Boolean)Unit
	 
	 byNameAssert { 5>6}                      //> java.lang.AssertionError
                                                  //| 	at sc$$anonfun$main$1.byNameAssert$1(sc.scala:21)
                                                  //| 	at sc$$anonfun$main$1.apply$mcV$sp(sc.scala:23)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at sc$.main(sc.scala:2)
                                                  //| 	at sc.main(sc.scala)
                         
}