// Creating list from 1 to 9
 val mylist1: List[Int] = List.range(1, 10)
 println(mylist1) //print to check list
// creating new list removing even numbers
  val mylist2 = mylist1.filter(_ % 2 != 0)
println(mylist2) //print to check results

// Creating cube fuction
def cube(x: Int): Int = {
    x * x * x
}

//printing results in separate lines
mylist2.map(x => println(cube(x)))
