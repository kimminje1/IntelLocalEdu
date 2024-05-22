//class(코드)와 파일명이 동일해야한다
import java.util.Scanner;

public class VarStringBasic2 {
	public static void main(String[] args) {
		//문자열
		String str="abd";
		//문자
		char ch = 'a';//한글자만됨,잘안씀
		
		byte b = 1;
		
		int num = 100;
		/*
		 *c언어- ()함수 자바- ()메서드
		 */
		//concat 합성, 더하다
		//%d같은거안쓰고+num/\t,\n다된다./
		System.out.println("그냥~쓰면되~"+num);
		System.out.println("아\t"+"한글이된다");
		System.out.println(str+"헐 뭐야/?");
		
		System.out.println(""+"");
		//문자열 + any type->문자열+문자열 ->문자열
		//any type + 문자열->문자열+문자열 ->문자열
		  System.out.println(" " + " " + 7); //ln이 라인넘버의줄임말\n이랑동일기능
	      System.out.println(7 + 7 + "");
	      System.out.println("" + 7 + 7);
	      
	      System.out.printf("오 c언어생각나네%d\n",num);
	      System.out.printf("오 c언어생각나네%d",num);
	      
	      System.out.print("아");
	      System.out.print("하");
	      System.out.print("라인넘기는것 없이 출력이네");
	      //syso ln에서 수정하면됨
	      //----------------------------------------
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("놀랐지? 아무글이나 작성해봐");
//	      String input = scan.nextLine();
	      num = scan.nextInt(); 
	      
//	      System.out.println("니가 작성한 글이야:"+input+10);
	      System.out.println("니가 작성한 글이야:"+num+10);
	}
}
