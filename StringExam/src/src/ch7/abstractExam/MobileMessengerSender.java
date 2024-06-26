package src.ch7.abstractExam;

public class MobileMessengerSender extends ContentSender{
	
	public MobileMessengerSender(String title, String name, String content, String recipient) {
		super(title, name, content, recipient);
	}

	@Override
	void sendMsg(String sendMethod) {
		// TODO Auto-generated method stub
		System.out.println("==================");
		System.out.println("언제 어디서나 쉽고 빠르게!");
		System.out.println("제목: "+title);
		System.out.println("이름: "+name);
		System.out.println("내용: "+content);
		System.out.println("받는사람: "+recipient);
		System.out.println("==================");
	}

	// 아래의 내용이 출력되도록 구현하시오
	/*
	 * 	전세계 어디서나 친구와 1:1 또는 그룹채팅을 무료로!!
		====== ???? ======
		제목 = 짝에게 보낼 제목
		이름 = 자신의 이름
		내용 = 짝에게 전달한 나의 마음
		받는사람 = 짝의 이름 
		====== ???? ======
	 * 
	 * 
	 * 
	 * */

	
}
