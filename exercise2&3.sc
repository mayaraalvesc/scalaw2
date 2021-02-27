//Exercise #2
//            Part 1
//Create list from 1 to 45
val x: List[Int] = List.range(1, 46)
println(x) //verify list
//Numbers divisible by 4
println(x.filter(_ % 4 == 0)) //just to verify numbers
//Sum of numbers div by 4
(x.filter(_ % 4 == 0)).sum
//            Part 2
// Sum of the squares of the numbers divisible by 3 and less than 20
//Numbers div by 3 and less than 20
val nums: List [Int] = x.filter(_ <20).filter(_ % 3 == 0)
//defining square function
def square (y: Int): Int = {
y * y
}
//applying square and sum
(nums.map(y =>(square(y)))).sum

//Exercise #3
//Creating max function
def max (a: Int, b:Int): Unit = {
  if (a > b)
    println(a)
  else
    println(b)
}
//Creating get_max function to call max
def get_max (i: Int, j: Int): Unit = {
  max(i,j)
}
//Print get_max with inputs
println(get_max(3,8))
