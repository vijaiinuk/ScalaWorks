import scala.annotation.tailrec

def fib(n: Int): Int = {
  if(n == 0 || n == 1) n
  else fib(n-2) + fib(n-1)
}

fib(1)
fib(5)


def fibTailRec(n: Int): Int = {

  @tailrec
  def loop(n: Int, prev: Int, curr: Int): Int = {
    if(n == 0) prev
    else loop(n -1, curr, prev + curr)
  }

  loop(n, 0, 1)
}

fibTailRec(1)
fibTailRec(5)