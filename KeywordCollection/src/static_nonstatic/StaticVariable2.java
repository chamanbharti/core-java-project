package static_nonstatic;

public class StaticVariable2 {
		   static int Var1=77; //Static integer variable
		   String Var2;//non-static string variable

		   public static void main(String args[])
		   {
			  StaticVariable2 ob1 = new StaticVariable2();
			  StaticVariable2 ob2 = new StaticVariable2();
		      ob1.Var1=88;
		      ob1.Var2="I'm Object1";
		      ob2.Var2="I'm Object2";
		      System.out.println("ob1 integer:"+ob1.Var1);
		      System.out.println("ob1 String:"+ob1.Var2);
		      System.out.println("ob2 integer:"+ob2.Var1);
		      System.out.println("ob2 STring:"+ob2.Var2);
		   }
		}