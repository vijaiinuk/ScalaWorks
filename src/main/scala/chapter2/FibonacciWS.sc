def fib(n: Int): Int = {
  if(n == 0 || n == 1) 1
  else fib(n-2) + fib(n-1)
}

fib(3)
fib(5)