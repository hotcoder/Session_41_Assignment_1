object GCD{
  def gcd(x:Int , y:Int):Any ={
    if(y==0) x else gcd(y,x%y)
  }

  def main(args: Array[String]): Unit = {
    print(gcd(25,15))
  }
}