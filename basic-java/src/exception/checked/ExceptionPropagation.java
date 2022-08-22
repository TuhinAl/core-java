package exception.checked;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();
	}

	 static void method1() {
//		try {
//			int [] a = {10, 23, 22};
//			System.out.println(a[7]);
//			method2();
//		} catch (ArithmeticException e) {
//			System.out.println("start");
//			System.out.println("Arithmatic Exception Occured");
//			System.out.println("end");
//		}
		 method2();

		 throw new ArithmeticException();
	}

	 static void method2() {
//		try {
//			method3();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Index Out Of Bounds Exception");
//		}
		 method3();
		 throw new NullPointerException();
		 
		
	}

	 static void method3() {
		method4();
		
		
	}

	 static void method4() {
		 System.out.println("method4");
		
		
	}
	 
}
