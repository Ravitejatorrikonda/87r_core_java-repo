package _03_03_26;

public class Example1 {
	
	
	/**
	 * get method
	 * 
	 * public returntype getName(){
	 * return Variables
	 * }
	 * 
	 * 
	 * set method
	 * 
	 * public void setName(Parameters....){
	 * variableName = parameterName;
	 * }
	 * 
	 *
	 */
	
	public String name;
	public String branch;
	
	public void setName(String names) {
		name=names;
		
	}
	public void setBranch(String bran) {
		
		branch=bran;
	}
	
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}
	
	
	

	
	public static void main(String[] args) {
		
		
		Example1 obj=new Example1();
		obj.setName("Aswija");
		obj.setBranch("ECE");
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getBranch());
		
		
		
	}

}
