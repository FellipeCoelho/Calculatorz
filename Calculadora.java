import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
		double n1, n2;
		int option;
		double sum, subtracion, multiplication, division;
		Scanner inner = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		n1 = inner.nextDouble();
		System.out.println("Enter the second number");
		n2 = inner.nextDouble();
		
		System.out.println("######  Choose your math operation");
		System.out.println("[1] - SUM");
		System.out.println("[2] - SUBTRACION");
		System.out.println("[3] - MULTIPLICATION");
		System.out.println("[4] - DIVISION");
	    System.out.println(">>>>>> Enter with an option");
	    option = inner.nextInt();
	    
	    switch(option) {
	        case 1:
	            sum = n1+n2;
	            System.out.println(sum);
	            break;
	            
            case 2:
	            subtracion = n1-n2;
	            System.out.println(subtracion);
	            break;
	            
	        case 3:
	            multiplication = n1*n2;
	            System.out.println(multiplication);
	            break;
	            
	        case 4:
	            if(n2 == 0){
	                System.out.println("Divisão impossível.");
	            }
	            else {
	            division = n1/n2;
	            System.out.println(division);
	            }
	            break;
	        
            default:
                System.out.println("INVALID OPERATION NUMBER.");
	    }
	   
	    
		
	}
}