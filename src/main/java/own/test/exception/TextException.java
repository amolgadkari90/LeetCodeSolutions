package own.test.exception;

public class TextException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextException te = new TextException();
		te.equals(null);
		try{
			
			int a = 10;
			int b = 0;
					
			int c = a/b;
			
			
			
			
		} catch(Exception ex) {
			
			System.out.println("Exception");
			
//		}catch(ArithmeticException ex1) {
//			System.out.println("ArithmeticException");
			
		} finally {
			System.out.println("Finally");
		}

	}

}
