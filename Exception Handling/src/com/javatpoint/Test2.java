package com.javatpoint;

public class Test2 {

	public static void main(String[] args) {
		
		try{
			int a[] = new int[5];
			//a[5] = 30;
			//a[-4] = 30;
			//a[4] = 30;
			a[4] = 30/0;
		}catch(ArithmeticException e){
			/*
			 Thrown when an exceptional arithmetic condition has occurred. 
			 For example, an integer "divide by zero" throws an instance of this class. 
			 ArithmeticException objects may be constructed by the virtual machine as if 
			 suppression were disabled and/or the stack trace was not writable.
			 Since:JDK1.0 Author:unascribed

			 */
			System.out.println("Task1 is completed");
		}catch(ArrayIndexOutOfBoundsException e){
			/*
			 Thrown to indicate that an array has been accessed with an illegal index. 
			 The index is either negative or greater than or equal to the size of the array.
			 Since:JDK1.0 Author:unascribed
			 */
			System.out.println("Task2 is completed");
		}catch(Exception e){
			/*
The class Exception and its subclasses are a form of Throwable that indicates conditions 
that a reasonable application might want to catch. 
The class Exception and any subclasses that are not also subclasses of RuntimeException are 
checked exceptions. 
Checked exceptions need to be declared in a method or constructor's throws clause if 
they can be thrown by the execution of the method or constructor and 
propagate outside the method or constructor boundary.

Since:JDK1.0
Author:Frank Yellin
See Also:
java.lang.Error
An Error is a subclass of Throwable that indicates serious problems that a reasonable
application should not try to catch. Most such errors are abnormal conditions. 
The ThreadDeath error, though a "normal" condition, is also a subclass of Error because 
most applications should not try to catch it. 

A method is not required to declare in its throws clause any subclasses of Error that 
might be thrown during the execution of the method but not caught, since these errors are 
abnormal conditions that should never occur. That is, Error and its subclasses are regarded as 
unchecked exceptions for the purposes of compile-time checking of exceptions.

Since:JDK1.0
Author:Frank Yellin
See Also:
java.lang.ThreadDeath
An instance of ThreadDeath is thrown in the victim thread when the (deprecated) 
Thread.stop() method is invoked. 

An application should catch instances of this class only if it must clean up after being 
terminated asynchronously. If ThreadDeath is caught by a method, it is important that 
it be rethrown so that the thread actually dies. 

The top-level error handler does not print out a message if ThreadDeath is never caught. 

The class ThreadDeath is specifically a subclass of Error rather than Exception, even though 
it is a "normal occurrence", because many applications catch all occurrences of Exception 
and then discard the exception.

Since:JDK1.0

			 */
			System.out.println("Common task is completed");
		}
		
		System.out.println("Rest of Code..");
	}
}
