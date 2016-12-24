import java.util.Scanner;

public class InteractRunner {
	
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
	 		Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Select operation (add (+), sub (-), mult (*), div (/) :)");
				String operation = reader.next();
			 	System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				switch (operation.toLowerCase()) {
				  case "+": 
				    calc.add(Double.valueOf(first), Double.valueOf(second));
				    break;
				  case "-": 
				    calc.sub(Double.valueOf(first), Double.valueOf(second));
				    break;
				  case "*": 
				    calc.mult(Double.valueOf(first), Double.valueOf(second));
				    break;
				  case "/": 
				    if (second.equals("0")) {
				      	System.out.println("Division by zero!");
				    } else {
				    	calc.div(Double.valueOf(first), Double.valueOf(second));
				    }
				    break;
				  default:
				    
				    break;
				}
				
				System.out.println("Result: " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit: yes/no ");
				exit = reader.next();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}