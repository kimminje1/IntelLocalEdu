package ch7.inter.exam.chicken;

import ch7.inter.exam.inter.Animal;

public class Chicken implements Animal {

	@Override
	public void eat(String bab) {
		System.out.println("닭이 "+bab+"을 먹어요");
		
	}

	@Override
	public void work(String move) {
		// TODO Auto-generated method stub
		System.out.println("닭이 "+move+" 놀아요");
	}

	@Override
	public void sleep(String zzz) {
		// TODO Auto-generated method stub
		System.out.println("닭이 "+zzz+" 자요");
	}
	
	public void call() {
		System.out.println("꼬꼬");
	}

}
