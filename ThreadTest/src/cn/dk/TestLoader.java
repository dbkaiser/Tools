package cn.dk;

class Load{
	
	// this static block will be run when the class is initialed.
	static {
		System.out.println("Class initial");
	}
	//this block is not static. it will be called when an object is created
	{
		System.out.println("object initial");
	}
}

public class TestLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// The ClassLoader.loadclass is not first time actively initial class. The class file will be loaded into memory;
		// But the JVM will not link and initial the class, therefore the static block will not run.
		// However, when ClassLoader load the class into the memory, it will automatically create a Class object in the Heap Area, which is like
		// a mirror to the Class that loaded. And the reflection will take action from now on.
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		try {
			System.out.println(loader);
			Class clazz = loader.loadClass("cn.dk.Load");
			System.out.println(clazz.getName());
			System.out.println("Then we print next");
			
			clazz = Class.forName("cn.dk.Load");
			System.out.println(clazz.getName());
			System.out.println("now the object");
			Load load = new Load();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
