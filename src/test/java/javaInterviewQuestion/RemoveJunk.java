package javaInterviewQuestion;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "!#$!$!$@#!$ Print characters and numerics only 313`31`3";
		
		//Regular expression: 
		s = s.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(s);

	}

}
