package cn.dk;

import java.util.Vector;

public class MyClassLoader extends ClassLoader {
	
	private String name;
	private String path;
	private String fileExtend = "class";
	
	@Override
	public Class<?> findClass(String className){
		byte[] data = readClassData(className);
		Vector v = new Vector<Object>();
		return this.defineClass("the name",data, 0, data.length);
		
		
	}
	
	private byte[] readClassData(String name){
		byte[] data ;
		return null;
	}
	
}
