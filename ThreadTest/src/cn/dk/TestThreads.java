package cn.dk;

import java.util.Random;

/**
 * This class is for testing thread programming abilities
 * @author edogboo
 *
 */
public class TestThreads extends Thread {
	private int id = -1;
	public TestThreads(int id){
		this.id = id;
	}
	public void run(){
//		try{
			for(int i = 0 ;i < 10000; i++){
				System.out.println(id +"is busy!!");
				Thread.yield();
			}
			
//		}catch(InterruptedException e){
//			e.printStackTrace();
//		}
		System.out.println(id + "woke up");
		
	}
	
	/**
	 * this method will test 10 threads run simutaniously together.
	 */
	public static void groupSleep(){
		TestThreads[] tarray = new TestThreads[10];
		for (int i = 1 ; i <= tarray.length; i++){
			tarray[i-1] = new TestThreads(i);
			tarray[i-1].setPriority(i);
			tarray[i-1].start();
		}
		System.out.println("hello");
	}
	
	public static void main(String args[]){
		groupSleep();
	}
}
