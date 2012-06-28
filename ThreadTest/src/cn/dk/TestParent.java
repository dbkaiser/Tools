package cn.dk;
class Parent{
	static int x = 3;
	static{
		System.out.println("Parent initial");
	}
}

class Child extends Parent{
	static int y = 4;
	static{
		System.out.println("Child initial");
	}
}

public class TestParent {
	static{
		System.out.println("Test initial");
	}
	
	public static void main(String[] args) {
		System.out.println(Child.y);
		ClassLoader.getSystemClassLoader();
	}
}
