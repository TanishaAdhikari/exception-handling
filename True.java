package exceptionhandling;

public class True {
	

	    
	    public void amIGood(int guessNumber) throws ArithmeticException, ClassNotFoundException {
	        if (guessNumber == 9) {
	            throw new ArithmeticException("Arithmetic error occurred.");
	        } else {
	            throw new ClassNotFoundException("Class could not be found.");
	        }
	    }

	    public static void main(String[] args) {
	        True trueObject = new True();
	        
	        try {
	            trueObject.amIGood(10);  
	        } catch (ArithmeticException | ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.println("Exception caught here");
	        }
	    }
	}


