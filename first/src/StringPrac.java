
//public class StringPrac {
//
//	public static void main(String[] args) {
//
//		int i = 654654656;
//		
//		String str = ""+i;
//		
//		System.out.println(str);
//
//	}
//
//}


//public class StringPrac {
//
//	public static void main(String[] args) {
//
//		int i = 4;
//		int j = 5;
//		
//		//System.out.println("The addition is "+i+j);
//		
//		System.out.println(i+j+" was the addition");
//		
//		System.out.println("The addition is "+(i+j));
//
//	}
//
//}



//public class StringPrac {
//
//	public static void main(String[] args) {
//
//		String str1 = "abcbt5gc54bt5c4b!!#@!#@bvbcefv";
//		
//		int index = str1.indexOf('b');
//		
//		System.out.println(index);
//
//	}
//
//}


//public class StringPrac {
//
//	public static void main(String[] args) {
//
//		String str1 = "abc";
//		
//		char ch = str1.charAt(1);
//		
//		System.out.println(ch);
//
//	}
//
//}


//public class StringPrac {
//
//	public static void main(String[] args) {
//
//		String str1 = "abc";
//		String str2 = "def";
//
//		System.out.println(str2+str1);
//
//	}
//
//}



//public class StringPrac {
//
//	public static void main(String[] args) {
//
//		String str1 = "abc";
//
//		String str2 = str1.concat("def");
//		
//		System.out.println(str1);
//		System.out.println(str2);
//
//	}
//
//}


//public class StringPrac {
//
//	public static void main(String[] args) {
//
//		String str1 = "abc";
//
////		boolean status = str1.startsWith("bc");
////		
////		System.out.println(status);
//
//		boolean status = str1.startsWith("bc", 1);
//
//		System.out.println(status);
//
//	}
//
//}

//public class StringPrac {
//
//	public static void main(String[] args) {
//
//		String str1 = "abc";
//		
//		String str2 = str1.replace('b', 'd');
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		
//		
//	}
//
//}

//public class StringPrac {
//
//	public static void main(String[] args) {
//
//		
//		
//		String str1 = "abc";
//		String str2 = "bcd";
//		String str3 = "abc";
//		
//		System.out.println(str1 == str2);
//
//		System.out.println(str1 == str3);
//		
//		System.out.println(str1.equals(str3));
//		System.out.println(str1.equals(str2));
//	}
//
//}

//public class StringPrac {
//
//	public static void main(String[] args) {
//
//		//String str = "abcd";//Here I am creating String object with String literal but not
//							//with new keyword..
//		
//		String str1 = new String("abc");
//		String str2 = new String("bcd");
//		String str3 = new String("abc");
//		
//		System.out.println(str1 == str2);
//
//		System.out.println(str1 == str3);
//		
//		System.out.println(str1.equals(str3));
//		System.out.println(str1.equals(str2));
//	}
//
//}

//public class StringPrac {
//
//	public static void main(String[] args) {
//
////		char arr[] = { 'M', 'a', 'n', 'a', 'n' };
////		
////		for( int i = 0; i < arr.length; i++ ) {
////			
////			if( arr[i] == 'a') {
////				arr[i] = 'r';
////			}
////		}
////		
////		
////		for( char ch : arr ) {
////			System.out.print(ch);
////		}
//
//		char arr[] = { 'M', 'a', 'n', 'a', 'n' };
//		
//		String str = new String(arr);
//		System.out.println(str);
//		
//		String newStr = str.replace('n', 'p');
//		
//		System.out.println(str);
//		System.out.println(newStr);
//
//	}
//
//}

//public class StringPrac {
//	
//	public static void main(String[] args) {
//		
//		String str = new String("Abc");
//		
//		System.out.println(str);//"str" is a reference variable and when I say "str" in sysout
//							//then it should print us the address of the location but it prints us
//							//the content not the address. The reason is since String class has overridden
//							//the toString method in String class...
//		
//		System.out.println(str.length());
//		
//	}
//
//}

//public class StringPrac {
//	
//	public static void main(String[] args) {
//		
//		String str = new String();
//		
//		System.out.println("The String is "+str.length());
//		
//	}
//
//}
