package own.test.java8;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFunctionalInterface mf = ( ) -> 1;
		
		System.out.println(mf.samMethod()); //Learning Functional Interface
		
		MyFunctionalInterface changeImpl = () -> 2;
		
		System.out.println(changeImpl.samMethod());
		
		MyFunctionalInterface2 checkVoid = () -> {			
			System.out.println("This is void method....");	
		};
		
		checkVoid.samMethodInFI2();
		
		
		
		
		
		}
		
		
		

}


