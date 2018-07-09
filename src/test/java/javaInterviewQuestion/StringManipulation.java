package javaInterviewQuestion;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "love to learn core java by l";
		String str1 = "Love to learn core java by l";
		
		System.out.println(str.length());
		System.out.println(str.charAt(8));
		System.out.println(str.indexOf('l'));
		System.out.println(str.indexOf('l', str.indexOf('l')+1));
		System.out.println(str.indexOf('l', str.indexOf('l')+9));
		
		System.out.println(str.indexOf("core"));
		System.out.println(str.indexOf("no"));
		
		//String comparison:
		System.out.println(str.equalsIgnoreCase(str1));
		
		//SubString:
		System.out.println(str.substring(0, 9));
		
		//trim:
		String s = "    Hello world  ";
		System.out.println(s.trim());
		
		//Replace:
		System.out.println(s.replace("Hello world", "HelloWorld"));
		
		//split:
		String test = "Hello_world_Test_Selenium";
		String testval[] = test.split("_");
		for(int i=0; i<testval.length; i++) {
			System.out.println(testval[i]);
		}
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
	}

}
