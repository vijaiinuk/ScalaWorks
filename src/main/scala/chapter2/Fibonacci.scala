package chapter2

/**
  * Created by Vijay on 11/6/2016.
  */
object Fibonacci {

  def fib(n: Int): Int = {
    if(n == 0 || n == 1) 1
    else fib(n-2) + fib(n-1)
  }

  def main(args: Array[String]): Unit = {
    print(fib(2))
  }
}
