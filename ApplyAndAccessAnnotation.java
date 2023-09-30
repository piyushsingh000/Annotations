package LearnAnnotation;
import java.lang.annotation.RetentionPolicy;
import java.util.*;
import java.lang.reflect.*; 
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;


//Creating Annotation..

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
	int value();
	
}
//Applying Annotation..
class Hello{
	@MyAnnotation(value = 10)
	public void say() {
		System.out.println("Hello Piyush");
	}
}

//Accessing Annotation..


public class ApplyAndAccessAnnotation {
	public static void main(String args[]) throws Exception {
		Hello h = new Hello();
		Method m = h.getClass().getMethod("Hello Bolo ");
		
		MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
		System.out.println(manno);
	}
}