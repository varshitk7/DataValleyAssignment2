import java.util.*;
public class swap
{
  public static void main (String[] args)
  {
	int a = 200, b = 300;
	  System.out.println ("Before swapping, a = " + a + " b = " + b);
	  a = a ^ b;
	  b = a ^ b;
	  a = a ^ b;

	  System.out.println ("After swapping using xor, a = " + a + " b = " + b);
	  
  }
}
