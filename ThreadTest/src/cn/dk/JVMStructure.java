package cn.dk;

public class JVMStructure {

	private static int m = 22;
	
	public String getUser1() {
		int result = 3+ 4;
		int result2 = 23;
		int result3 = 22; 
		int result4 = 22;
		
		System.out.println(result+result2+result3+result4);
		return user1;
		
	}
	public void setUser1(String user1) {
		this.user1 = user1;
	}
	public String getUser2() {
		return user2;
	}
	public void setUser2(String user2) {
		this.user2 = user2;
	}

	private String user1;
	private String user2;
	
	
	public static void main(String args[]){
		
		try {
			Class jvmClass = Class.forName("cn.dk.JVMStructure");
			ClassLoader c = jvmClass.getClassLoader();
			System.out.println(c);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JVMStructure jv = new JVMStructure();
		jv.setUser1("doug");
		jv.setUser2("hulia");
	}
	
}
