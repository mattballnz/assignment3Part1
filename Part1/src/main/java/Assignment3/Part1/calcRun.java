package Assignment3.Part1;

import java.util.Scanner;

public class calcRun implements simpleCalc {

	int a;
	int b;
	simpleCalc interfaceObj;
	
	public calcRun() {
		this.interfaceObj = interfaceObj;
	}

	public void setInterfaceObj(simpleCalc interfaceObj) {
		this.interfaceObj = interfaceObj;
	}

	public double add(int a, int b) {
		double c = a + b;
		return c;
	}

	public double subtract(int a, int b) {
		double c = a - b;
		return c;
	}

	public double multiply(int a, int b) {
		double c = a* b;
		return c;
	}

	public double divide(int a, int b) {
		double c = a / b;
		return c;
	}
	
//	public static void main( String[] args )
//    {
//        calcRun calcObj = new calcRun();
//        Scanner in = new Scanner( System.in );
//        
//        boolean exitCondition = false;
//        while( exitCondition == false ) {
//        	System.out.print( "Enter first number: ");
//        	int tempA = in.nextInt();
//        	
//        	System.out.print( "Enter second number: ");
//        	int tempB = in.nextInt();
//        	
//        	System.out.print( "Enter operator: ");
//        	String operator = in.next();
//        	
//        	switch( operator ) {
//        		case "+" : System.out.println( "Answer is: " + calcObj.add( tempA, tempB ) );
//        		break;
//        		
//        		case "*" : System.out.println( "Answer is: " + calcObj.multiply( tempA, tempB ) );
//        		break;
//        		
//        		case "-" : System.out.println( "Answer is: " + calcObj.subtract( tempA, tempB ) );
//        		break;
//        		
//        		case "/" : System.out.println( "Answer is: " + calcObj.divide( tempA, tempB ) );
//        		break;
//        		
//        		default : System.out.println( "Invalid Operator! + * - /");
//        	}
//        	
//        	System.out.print( "Enter any key to continue, or 0 to exit: " );
//        	int choice = in.nextInt();
//        	
//        	if( choice == 0 ) 
//        		exitCondition = true;
//        }
//        System.out.println( "Exiting..." );
//        in.close();
//    }
}
