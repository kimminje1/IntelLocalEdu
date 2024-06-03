package str.exam;

public class StringEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "2022/07/27"; // 기준
		String changeStr = "";
		String[] originStrarr= originStr.split("/");
		int beforeCharPosition = 0;
		int afterCharPosition = 0;
		String tempYyyyStr = "";
		String tempMmStr = "";
		String tempDdStr = "";
		tempYyyyStr = originStrarr[0];
		tempMmStr	= originStrarr[1];
		tempDdStr  = originStrarr[2];
		changeStr =originStrarr[0]+"년"+originStrarr[1]+"월"+originStrarr[2]+"일";
//		날짜를 아래와 같이 출력하시오 
// 		ex: 출력형태 
//		2022/07/27
//		2022년07월27일 

		
		System.out.println(originStr);
		System.out.println(changeStr);

	}

}
