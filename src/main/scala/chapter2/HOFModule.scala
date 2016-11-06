package chapter2

import scala.annotation.tailrec

/**
  * Created by Vijay on 11/6/2016.
  */
object HOFModule {

  def fib(n: Int): Int = {

    @tailrec
    def loop(n: Int, prev: Int, curr: Int): Int = {
      if(n == 0) prev
      else loop(n -1, curr, prev + curr)
    }

    loop(n, 0, 1)
  }

  def factorial(n: Int): Int = {

    @tailrec
    def loop(n: Int, acc: Int): Int = {
      if(n <= 0) acc
      else loop(n-1, acc*n)

    }

    loop(n, 1)
  }


  def abs(n: Int): Int = {
    if(n < 0) -n
    else n
  }

  private def formatResult(name: String, n: Int, f:Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }


  def main(args: Array[String]): Unit = {
    println(formatResult("abs", -10, abs))
    println(formatResult("factorial", 10, factorial))
  }

}