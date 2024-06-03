
public class test {
public static void main(String[] args) {
	
	int mul =2;
	
	while (mul<=9) {
		System.out.println(mul+"단");
		int num = 1;
		
		while (num<=9) {
			System.out.println(mul+"*"+num+"="+(mul*num));
			num++;
		}
		
		mul++;
		if (mul == 10) {
		break;
		}
		
			
		
	}
	
	
}
}
