package own.test.java8;

public class MultiThreadingWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = () ->{
			for(int i = 1; i <=10; i++) {
				System.out.println("Thread " + i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.run();
	}
}
