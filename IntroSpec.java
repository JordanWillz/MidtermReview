package MidtermPackage;

import javax.lang.model.type.NullType;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.lang.reflect.*;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class IntroSpec {


    public static void main(String[] args)
    {
        String className = args[0];
        String fieldName = args[1];
        
        IntroSpec.inspectField(className, fieldName);
    }

    public static void inspectField(String className, String fieldName) {

        try{
            Class classObject = Class.forName(className);
            Object instanceObj = classObject.getDeclaredConstructor(String.class, int.class).newInstance("Test String", 3);
            
            Field[] fields = classObject.getDeclaredFields();
            Method[] methods = classObject.getDeclaredMethods();
            Constructor[] constructors = classObject.getDeclaredConstructors();
            Class superClass = classObject.getSuperclass();  
            Class[] interfaces = classObject.getInterfaces();
            String modifiers = Modifier.toString(classObject.getModifiers());
            
            Object arrayObj = Array.newInstance(Integer.class, 10);
            Object multiDimArrayObj = Array.newInstance(String.class,10, 10);
            
            Array.set(arrayObj, 0, 10);
            Object nestedArrayObj = Array.get(multiDimArrayObj, 0);
            Array.set(nestedArrayObj, 0, "Test Array");
            
            Field f = classObject.getDeclaredField("str");
            f.setAccessible(true);         
            Object fieldObj = f.get(classObject);
            f.getType();
            
            f.set(classObject, (String) "Test Set");
            
            
            System.out.println(f.get(classObject).toString());
           
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}

