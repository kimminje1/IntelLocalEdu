package four52;

public class EqualBasic1 {
	public static void main(String[] args) {
		String str1 = "문자틀";
		String str2 = "문자틀";
		
		String str3 = new String ("문자틀");
		String str4 = new String ("문자틀");

		// 클래스		
		//주소비교?
		//다르면 다른것
		System.out.println("str1 == str2 결과:" +(str1 == str2));
		System.out.println("str1 == str3 결과:" +(str1 == str3));
		System.out.println("str1 == str4 결과:" +(str1 == str4));
		
		System.out.println("===============================");
		
		System.out.println("str3 == str2 결과:" +(str3 == str2));
		System.out.println("str3 == str4 결과:" +(str3 == str4));
		
		System.out.println("str1.hashCode()");
		System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println("str2.hashCode()");
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str2));
		System.out.println("str3.hashCode()");
		System.out.println(str3.hashCode());
		System.out.println(System.identityHashCode(str3));
		System.out.println("str4.hashCode()");
		System.out.println(str4.hashCode());
		System.out.println(System.identityHashCode(str4));
		//hashcode 논리적으로개념화해서 관리 같은 문자열이다
		//System.identityHashCode 실제주소위치->이게다르면 ==이 다르다 나옴
		//인스턴스 주소는 유일하다
	}
}
