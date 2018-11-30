package Assignment5b.mypack;

import java.io.*;
import Assignment5b.pack.A;
import Assignment5b.pack.*;
//import packa.*;
//import packc.*;


class Main extends C
{
public void display()
{
	System.out.println("display() from Main()");
}
   public static void main(String args[])
    {

        A a = new A();
       a.display();
/*
       C c = new C();   //when you are making an object of class C 
       c.display();     //this won't call the inherited version of display()
       
       Note: protected members can only be accessed by inherited subclasses in another package
*/
	//corrected way to call the inherited version of display()
	Main m = new Main();
	m.display();//this will call the display() of C class
    }
}
