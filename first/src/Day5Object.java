




//class Arithmetic {
//
//	int i = 4, j = 5, k = 6, l = 54, m = 12, n = 43, o = 98, p = 76, r = 25;
//
//	public String toString() {
//		
//		return "value of i is"+i+" value of j is "+j+" value of k is "+k+" value of l is "+l;
//	}
//}
//
//public class Day5Object {
//	
//	int i = 4, j = 5, k = 6;
//	
//	public String toString() {
//		return "The values are "+i+" and the value of j is "+j;
//	}
//
//
//	public static void main(String[] args) {
//
//		Arithmetic a1 = new Arithmetic(); a1.k = 400;   a1.l = 10000;
//		Arithmetic a2 = new Arithmetic();
//		
//		//System.out.println("i is "+a1.i+" j is "+a1.i+" k is "+a1.k+" l is "+a1.l);
//		
//		System.out.println(a1.toString());
//		System.out.println(a2);
//		//System.out.println(a1);
//		
//		Day5Object d1 = new Day5Object();
//		System.out.println(d1.toString());
//		
//	}
//
//}



//class Arithmetic extends Object {
//
//	int firstNo = 4, secondNo = 5;
//
//	public boolean equals(Object obj) {
//
//		Arithmetic a2 = (Arithmetic) obj;
//
//		if (firstNo == a2.firstNo && secondNo == a2.secondNo) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//}
//
//public class Day5Object {
//
//
//	public static void main(String[] args) {
//
//		Arithmetic a1 = new Arithmetic(); a1.secondNo = 100;
//		Arithmetic a2 = new Arithmetic();
//
//		boolean status = a1.equals(a2);
//		System.out.println(status);
//	}
//
//}



//class Arithmetic extends Object {
//
//	int firstNo = 4;
//
//	public boolean equals(Object obj) {
//
//		Arithmetic a2 = (Arithmetic) obj;
//
//		if (firstNo == a2.firstNo) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//}
//
//public class Day5Object extends Object {
//
//	int firstNo = 4;
//
//	public static void main(String[] args) {
//
//		Day5Object d1 = new Day5Object();
//		Day5Object d2 = new Day5Object();
//
//		boolean status = d1.equals(d2);
//		System.out.println(status);
//	}
//
//	public boolean equals(Object obj) {
//
//		Day5Object a2 = (Day5Object) obj;
//
//		if (firstNo == a2.firstNo) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//}

//class Arithmetic extends Object {
//	
//	int firstNo = 4;
//	
//	public boolean equals( Object obj ) {
//		
//		Arithmetic a2 = (Arithmetic)obj;
//		
//		if( firstNo ==  a2.firstNo) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}	
//}
//
//
//public class Day5Object {
//	
//	public static void main(String[] args) {
//		
//		Arithmetic a1 = new Arithmetic();
//		Arithmetic a2 = new Arithmetic();     a2.firstNo = 10;
//		
//		//System.out.println( a1 == a2 );//Here it returns true/false based upon their addresses not on the
//							//basis of their content
//		
//		boolean status = a1.equals(a2);
//		
//		System.out.println(status);
//		
//		
//	}
//
//}

//
//class Arithmetic {
//	
//	int firstNo = 4;
//	int secodNo = 5;
//	int result;
//	
////	public void add() {
////		
////		result = firstNo + secodNo;
////	}
//	
////	public void add( Arithmetic arithmetic ) {
////		
////		result = firstNo + arithmetic.secodNo;
////		System.out.println(result);
////	}
//	
//	public void add( Arithmetic arithmetic ) {
//		
//		arithmetic.result = secodNo + arithmetic.firstNo;
//		System.out.println( arithmetic.result );
//		System.out.println( result );
//	}
//}
//
//
//public class Day5Object {
//	
//	public static void main(String[] args) {
//		
//		Arithmetic a1 = new Arithmetic();
//		Arithmetic a2 = new Arithmetic();
//		
//		a1.firstNo = 100;    a1.secodNo = 200;
//		a2.add(a1);
//		//a1.add(a2);
//	}
//
//}
