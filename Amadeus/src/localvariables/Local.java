package localvariables;

public class Local {
public static int x=1;
private static int y=5;
public  void method()
{
	final int x=500;
    int y=1000;
	System.out.println(x);
	y=y+5;
	System.out.println(y);
	
}
public static void method2()
{
	int x=564;
	int y=698;
	System.out.println(x);
	System.out.println(y);
}
public static void main(String[] args) {
	System.out.println(x);
	System.out.println(y);
	x=x+10000;
	System.out.println(x);
	Local l=new Local();
	l.method();
	method2();
	}

}
