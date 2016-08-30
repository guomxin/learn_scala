object sc {

  List.range(1, 5)                                //> res0: List[Int] = List(1, 2, 3, 4)
  List.range(1, 5) flatMap (
    i => List.range(1, i) map ((i, _)))           //> res1: List[(Int, Int)] = List((2,1), (3,1), (3,2), (4,1), (4,2), (4,3))
  (List(10, 20), List(3, 4, 5)).zipped            //> res2: scala.runtime.Tuple2Zipped[Int,List[Int],Int,List[Int]] = scala.runtim
                                                  //| e.Tuple2Zipped@ab06043
}