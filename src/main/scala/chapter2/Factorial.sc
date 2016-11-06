
def factorial(n : Int): Int = {

  if(n < 0) throw new IllegalArgumentException("negative numbers not allowed")
  if(n == 0 || n == 1) n
  else n * factorial(n - 1)

}

factorial(2)
factorial(10)
//factorial(-1)

def factorialTailRec(n: Int): Double = {

  def loop(n: Int, acc: Int): Double = {
    println("n: "+n+" acc: "+acc)
    if(n <= 0) acc
    else loop(n-1, acc*n)

  }

  loop(n, 1)
}

factorialTailRec(2)
factorialTailRec(10)