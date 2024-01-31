

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) throws Exception {
		
			
				ageCheck();
			
	}	
	
	static public void ageCheck() throws Exception {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the age!!!");
			
			int age = sc.nextInt();
			
			if( age > 30 ) {
				System.out.println("You are not allowed...");
				
				throw new Below30AllowedException();
			}
			else {
				System.out.println("Welcome...");
			}
	}
	
}


//
//import java.util.Scanner;
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//			try {
//				ageCheck();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//			}
//	}	
//	
//	static public void ageCheck() throws Exception {
//		
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the age!!!");
//			
//			int age = sc.nextInt();
//			
//			if( age > 30 ) {
//				System.out.println("You are not allowed...");
//				
//				throw new Below30AllowedException();
//			}
//			else {
//				System.out.println("Welcome...");
//			}
//	}
//	
//}


//import java.util.Scanner;
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//			ageCheck();
//	}	
//	
//	static public void ageCheck() {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the age!!!");
//			
//			int age = sc.nextInt();
//			
//			if( age > 30 ) {
//				System.out.println("You are not allowed...");
//				
//				throw new Below30AllowedException();
//			}
//			else {
//				System.out.println("Welcome...");
//			}
//		}
//			catch (Exception e) {
//				// TODO: handle exception
//			}
//	}
//	
//}



//import java.util.Scanner;
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args){
//		
//			ageCheck();
//	}	
//	
//	static public void ageCheck() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the age!!!");
//		
//		int age = sc.nextInt();
//		
//		if( age > 30 ) {
//			System.out.println("You are not allowed...");
//			
//			throw new Above30NotAllowedException();
//		}
//		else {
//			System.out.println("Welcome...");
//		}
//	}
//	
//}


//import java.util.Scanner;
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args) throws Exception {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the age!!!");
//		
//		int age = sc.nextInt();
//		
//		if( age > 30 ) {
//			System.out.println("You are not allowed...");
//			
//			throw new Above30NotAllowedException();
//		}
//		else {
//			System.out.println("Welcome...");
//		}
//			
//	}	
//	
//	
//	
//}



//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.Scanner;
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args) throws Exception {
//		
//		fileReading();
//		
//			
//	}	
//	
//	static public void fileReading() throws Exception{
//		
//		
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter the file name!!");
//			String filename = sc.next();
//			
//			File file = new File(filename);
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//		
//	}
//	
//}


//import java.io.File;
//import java.io.FileReader;
//import java.util.Scanner;
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		try {
//			fileReading();	
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("inside catch of main...");
//		}
//		
//			
//	}	
//	
//	static public void fileReading() throws Exception{
//		
//		
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter the file name!!");
//			String filename = sc.next();
//			
//			File file = new File(filename);
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//		
//	}
//	
//}

//import java.io.File;
//import java.io.FileReader;
//import java.util.Scanner;
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		fileReading();
//			
//	}	
//	
//	static public void fileReading() {
//		
//		try {
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter the file name!!");
//			String filename = sc.next();
//			
//			File file = new File(filename);
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//		}
//		catch (Exception e) {
//			System.out.println("inside catch...");
//			fileReading();
//		}
//	}
//	
//}


//
//class A {
//	
//	int i = 4;
//	
//	public void display() {
//		System.out.println("The value of i is "+i);
//	}
//}
//
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		A a = new A();
//		System.out.println(a.i);
//		
//		a = null;
//		
//		a.display();
//			
//	}	
//	
//}


//class A {
//	
//	int i = 4;
//	
//	public void display() {
//		System.out.println("The value of i is "+i);
//	}
//}
//
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		A a = new A();
//		System.out.println(a.i);
//		
//		a = null;
//		
//		a.display();
//			
//	}	
//	
//}


//
//import java.util.Scanner;
//
//public class ExceptionHandling {
//	static Scanner sc = new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		
//		ExceptionHandling.divider();
//		ExceptionHandling.findIndex();
//	}
//	
//	static public void divider() {
//		
//		try {
//			int dividend = 10;
//			System.out.println("Enter divider!!");
//			int divider = sc.nextInt();
//			int result = dividend/divider;
//			System.out.println(result);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("inisde Arithmetic");
//			divider();
//		}
//	}
//	
//	static public void findIndex() {
//		
//		try {
//			System.out.println("Enter the name!!");
//			String name = sc.next();
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println("inisde StringIndexOut");
//			findIndex();
//		}
//	}
//}


//import java.util.Scanner;
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//		
//			System.out.println("Enter divider but not 0!!");	
//			
//			int divider = sc.nextInt();
//			
//			int dividend = 4;
//			int result = dividend/divider;
//			
//			System.out.println("The Result is "+result);
//			
//			int[] arr = {3, 5, 1};
//			System.out.println("Enter index of an array!!");
//			int index = sc.nextInt();
//			System.out.println(arr[index]);
//			
//			System.out.println("enter the name!!");
//			String name = sc.next();
//			System.out.println("Enter the index of String!!");
//			int indexString = sc.nextInt();
//			System.out.println(name.charAt(indexString));
//		}
//		
//		catch (ArithmeticException e) {
//			System.out.println("inside ArithmeticException");
//			
//			main(null);
//		}
//		catch (IndexOutOfBoundsException e) {
//			System.out.println("insdie indexout");
//		}
//	}
//}


//
//
//import java.util.Scanner;
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//		
//			System.out.println("Enter divider but not 0!!");	
//			
//			int divider = sc.nextInt();
//			
//			int dividend = 4;
//			int result = dividend/divider;
//			
//			System.out.println("The Result is "+result);
//			
//			int[] arr = {3, 5, 1};
//			System.out.println("Enter index of an array!!");
//			int index = sc.nextInt();
//			System.out.println(arr[index]);
//			
//			System.out.println("enter the name!!");
//			String name = sc.next();
//			System.out.println("Enter the index of String!!");
//			int indexString = sc.nextInt();
//			System.out.println(name.charAt(indexString));
//		}
//		
//		catch (ArithmeticException e) {
//			System.out.println("inside ArithmeticException");
//			
//			main(null);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside ArrayIndexoutOfBoundsException...");
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			// TODO: handle exception
//		}
//	}
//
//}



//import java.util.Scanner;
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//		
//			System.out.println("Enter divider but not 0!!");	
//			
//			int divider = sc.nextInt();
//			
//			int dividend = 4;
//			int result = dividend/divider;
//			
//			System.out.println("The Result is "+result);
//			
//			int[] arr = {3, 5, 1};
//			System.out.println("Enter index of an array!!");
//			int index = sc.nextInt();
//			System.out.println(arr[index]);
//			
//			System.out.println("enter the name!!");
//			String name = sc.next();
//			System.out.println("Enter the index of String!!");
//			int indexString = sc.nextInt();
//			System.out.println(name.charAt(indexString));
//		}
//		catch (Exception e) {
//			System.out.println("Inside just Exception");
//			main(null);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("inside ArithmeticException");
//			
//			main(null);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside ArrayIndexoutOfBoundsException...");
//		}
//	}
//
//}


//import java.util.Scanner;
//
//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//		
//			System.out.println("Enter divider but not 0!!");	
//			
//			int divider = sc.nextInt();
//			
//			int dividend = 4;
//			int result = dividend/divider;
//			
//			System.out.println("The Result is "+result);
//			
//			int[] arr = {3, 5, 1};
//			System.out.println("Enter index of an array!!");
//			int index = sc.nextInt();
//			System.out.println(arr[index]);
//			
//			System.out.println("enter the name!!");
//			String name = sc.next();
//			System.out.println("Enter the index of String!!");
//			int indexString = sc.nextInt();
//			System.out.println(name.charAt(indexString));
//		}
//		catch (ArithmeticException e) {
//			System.out.println("inside ArithmeticException");
//			
//			main(null);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside ArrayIndexoutOfBoundsException...");
//		}
//		catch (Exception e) {
//			System.out.println("Inside just Exception");
//			main(null);
//		}
//	}
//
//}


//public class ExceptionHandling {
//	
//	static int counter = 0;
//	
//	public static void main(String[] args) {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//		
//			if( counter == 0) {
//				System.out.println("Enter divider but not 0!!");	
//			}
//			int divider = sc.nextInt();
//			
//			int dividend = 4;
//			int result = dividend/divider;
//			
//			System.out.println("The Result is "+result);
//		}
//		catch (Exception e) {
//			System.out.println("inside catch block");
//			System.out.println("I have told you not to give 0..");
//			counter++;
//			main(null);
//		}
//		
//	}
//
//}


//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		try {
//			System.out.println("inside try block");
//			int i = 4;
//			int result = i/0;
//			System.out.println(result);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e);
//			System.out.println("inside catch block");
//		}
//		
//	}
//
//}


//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		
//		int[] arr = {2, 4};
//		
//		System.out.println(arr[3]);
//		
//	}
//
//}


//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		
//		int i = 4;
//		
//		System.out.println(i/0);
//		
//	}
//
//}
