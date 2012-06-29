package cn.dk.thread;

public class ThreadTest extends Thread{
	
	@Override
	public void run(){
		for (int i = 0 ; i< 100; i++){
			System.out.println("heelo " + i);
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new ThreadTest();
		t1.start();
	}
}
