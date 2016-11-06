def findFirst(ss: Array[String], key: String): Int = {

  def loop(n: Int): Int = {
    if(n > ss.length -1) -1
    else if(ss(n) == key) n
    else loop(n+1)
  }

  loop(0)
}

findFirst(Array("test", "scala", "java"), "")

def findFirstPoly[T](ss: Array[T], p: T => Boolean): Int = {
  def loop(n: Int): Int = {
    if(n > ss.length - 1) -1
    else if(p(ss(n))) n
    else loop(n+1)
  }
  loop(0)
}

findFirstPoly(Array("test", "scala", "java"), (s: String) => s == "java")
findFirstPoly(Array(1,2,3,4), (i: Int) => i == 4)


def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
  def loop(n: Int): Boolean = {
    if(n >= (as.length - 1)) true
    else if(!ordered(as(n), as(n+1))) false
    else loop(n+1)
  }
  loop(0)
}

isSorted(Array(0,1,2,4,6,3), (x:Int, y:Int) => x <= y)
isSorted(Array(0,1,2,3, 4,6), (x:Int, y:Int) => x <= y)
isSorted(Array("orange", "apple", "pear"), (x: String, y: String) => x.compareTo(y) < 0)
isSorted(Array("apple", "orange" , "pear"), (x: String, y: String) => x.compareTo(y) < 0)