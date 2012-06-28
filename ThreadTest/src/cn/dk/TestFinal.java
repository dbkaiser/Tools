package cn.dk;

import java.util.Random;

class Test {
	public static final int x = 6 /3;
	public static final int y = new Random().nextInt(100);
	
	static{
		System.out.println("initial block");
	}
}

public class TestFinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Test.x);
		System.out.println(Test.y);
	}

}
