package exceptionhandling;

public class TrueExceptionDemo {
	

	    public static void main(String[] args) {
	        
	        try {
	            @SuppressWarnings("unused")
				var result = 100 / 0;  
	        } catch (ArithmeticException ex) {
	            System.out.println(ex.getMessage());              
	            System.out.println(ex.getLocalizedMessage());     
	            System.out.println(ex.toString());               

	          
	            for (StackTraceElement element : ex.getStackTrace()) {
	                System.out.println(element);                  
	            }
	        }
	    }
	}


