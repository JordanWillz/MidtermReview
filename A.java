package MidtermPackage;

import java.lang.reflect.Field;

public class A {

    private String str;

    private int B;
    
    private int[] intArray;

    public A(String str) {
        this.str = str;
    }

    public A(String str, int B) {
        this.B = B;
        this.str = "Hello, world!";
        intArray =  new int [12]; 
        updateArray();
   }
    
   public void updateArray()
   {
	   for(int i = 0; i < intArray.length; i++)
	   {
		   intArray[i] = 20;
	   }
   }

}
