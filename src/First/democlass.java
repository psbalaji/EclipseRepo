package First;

import java.util.Scanner;

public class democlass implements interfacedemo {

	@Override
	public Integer add(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return val1+val2;
	}

	@Override
	public Integer subtract(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return val1-val2;
	}

	@Override
	public Long multiply(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return  (long)val1*val2;
	}

	@Override
	public Integer divide(Integer val1, Integer val2) throws ArithmeticException {
		// TODO Auto-generated method stub
		return val1/val2;
	}
	
	public static void main(String[] arg){
		
		interfacedemo obj=new democlass();
		Integer val1,val2,choice;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter first number");
		val1=input.nextInt();
		
		System.out.println("Enter Second number");
		val2=input.nextInt();
		
		System.out.println("Enter your Selection:\n 1)Addition,\n 2)Subtraction,\n 3)Multiply, \n 4)Divide");
		choice=input.nextInt();
		
		switch(choice){
		
		case 1:
			System.out.println(obj.add(val1, val2));
			break;
			
		case 2:
			System.out.println(obj.subtract(val1, val2));
			break;
			
		case 3:
			System.out.println(obj.multiply(val1, val2));
			break;
			
		case 4:
			try{
				System.out.println(obj.divide(val1, val2));
			}catch(ArithmeticException e){
				System.out.println("Cant divide with zero");
			}
			break;
			
		default:
			System.out.println("Invalid Input");
		}
		input.close();
		
	}
}
