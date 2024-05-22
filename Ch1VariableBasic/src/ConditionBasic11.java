
public class ConditionBasic11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 삼항연산자, 조건연산자
		
//		조건식 ? 식1: 식2;
//		true이면 식1 실행
//		false이면 식2 실행
// crtl+alt+화살표아래:라인복제
// crtl + d :라인복제
		int rslt = 0;

		rslt = 5 > 0? 10:-10;
		System.out.println(rslt);
		
		rslt = 5 < 0? 10:-10;
		System.out.println(rslt);
		// 중첩가능
		rslt = 5 < 0? 10: 5 < 0? 10:-10;
		System.out.println(rslt);

		
		
	}

}
