package com.cap;



//import com.unext.Aircraft;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Human human = new Human();
//		System.out.println(human.height);//height is protected in Human class and is in the same package
//									//class and this is why it is legal...
//		
//		
//		Aircraft aircraft = new Aircraft();
//		System.out.println(aircraft.altitude);//accessing the altitude protected variable from different
//							//package since protected says, you can acces me only inside my own package
//							//and if you are from diffefent package then you should use inheritance to access me
//							//by subclass...
//	}
//}



//
//import com.unext.Aircraft;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Aircraft aircraft = new Aircraft();
//
//		//aircraft.fly();//this is illegal since fly method is default and is in diff package...
//		System.out.println(aircraft.altitude);
//	}
//}


//import com.unext.Aircraft;//since Aircraft is in different package and the class Aircraft is default now...
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Aircraft aircraft = new Aircraft();//This is also illegal for the same reason...
//
//	}
//}

//import com.unext.Aircraft;//this import statement must come if 2 classes from 2 different packages are
//						//trying to communicate...
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		Aircraft aircraft = new Aircraft();
//				
//	}
//}

//public class Main {
//	
//	public static void main(String[] args) {
//		
////		Human human = new Human();
////		System.out.println(human.mascularStrength);
////		
////		human.gyming();
////		System.out.println(human.mascularStrength);
////		
////		human.gyming();
////		System.out.println(human.mascularStrength);
////		
////		human.mascularStrength = 200;
////		System.out.println(human.mascularStrength);
//		
//		Human human = new Human();
//		
//		System.out.println(human.getMascularStrength());
//		
//		human.setMascularStrength();
//		System.out.println(human.getMascularStrength());
//				
//	}
//}

//public class Main {
//	
//	public static void main(String[] args) {
//		
//		Human human = new Human();
//		
//		human.display();//since the member trying to access is from different class and is declared 
//						//private and "private" says that you can access me only from my own class...
//		
//		System.out.println(human.i);
//			
//	}
//}

//package com.cap;//If your class is part of a package then you must see the package statement on top
//and that package statement must be the first statement...
//public class Main {//Main is the class name but its fully qualified name is "com.cap.Main"
//	
//	public static void main(String[] args) {
//		
//		System.out.println("Hi...");
//		
//		Human human = new Human();
//		
//		human.display();
//			
//	}
//
//}

//A class can be either public or default but not protected and private...
