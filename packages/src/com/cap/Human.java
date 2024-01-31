package com.cap;

class Human {
	
	private int mascularStrength = 40;
	protected int height = 2;
	
	public void setMascularStrength() {
		mascularStrength++;
	}
	
	public int getMascularStrength() {
		return mascularStrength;
	}

}



//class Human {
//	
//	private int mascularStrength = 40;
//	
//
////	public void gyming() {
////
////		mascularStrength++;
////	}
//	
//	public void setMascularStrength() {
//		mascularStrength++;
//	}
//	
//	public int getMascularStrength() {
//		return mascularStrength;
//	}
//
//}

//you can have many classes in a single file but you can have utmost 1 class as public...

//public class Hum {// this is illegal since class name and the file name must be same if the class
//					// is declared public
//
//	void display() {
//
//		System.out.println("Hello....");
//	}
//
//}

//class Hum {//here class name can be different from the file name only and only if the class is declared
//			//default
//	
//	void display() {
//		
//		System.out.println("Hello....");
//	}
//
//}
