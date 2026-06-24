package com.Strings;

public class Example2 {

	public static void main(String[] args) {
		
		String [] str= {"flower","flow","floor","float","flex"};
		String prefix="";
		
		String smallest=str[0];//flower
		for (int i = 0; i < str.length; i++) {
			if(str[i].length() < smallest.length()) {
				smallest=str[i];
			}
		}
		//             flow->4
		for(int i=0;i<smallest.length();i++) {
			int count=0;//  array
			for(int j=0;j<str.length;j++) {
				
				if(smallest.charAt(i)==str[j].charAt(i)) {
					count++;
				}
			}
			if(count==str.length) {
				prefix=prefix+smallest.charAt(i);
			}else {
				break;
			}
		}
		System.out.println(prefix);
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String str="ABCDEFGH";
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i+1; j <= str.length(); j++) {
//				//                               1, 2
//				String str2=str.substring(i,j);//   A AB ABC
//				if(str2.length()==4) {
//					System.out.println(str2);
//				}
//				
//			}
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//                String str="Java";
//                str.concat("is awesome");
//                System.out.println(str);
//                
//                StringBuilder str1=new StringBuilder("Java");
//                  str1.append(" is awe some ".trim());
//                  System.out.println(str1);
	}

}
