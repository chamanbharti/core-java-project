class chaman
{
int cube(final int n)
 {
    n=n+2;//can't be changed as n is final
    n*n*n;
  }

public static void main(String[] args)
 {
  chaman b=new chaman();
  b.cube(5);
  }
}