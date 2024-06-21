package hk.exam.five;

public class SilenceDisplayTv extends SilenceTv {


    @Override
    public void powerButton() {
        power = !power;
        if (power) {
            System.out.println("TV 전원이 켜졌습니다.");
        } else {
            System.out.println("TV 전원이 꺼졌습니다.");
        }
        displayStatus();
    }

    public void displayStatus() {
        System.out.println("=== 현재 TV 상태 ===");
        System.out.println(this.toString());
        System.out.println("===================");
    }

    public static void main(String[] args) {
        SilenceDisplayTv myTv = new SilenceDisplayTv();
        myTv.displayStatus();
        myTv.powerButton();
        myTv.volumeUp();
        myTv.channelUp();
        myTv.silenceButton();
        myTv.volumeUp(); // 음소거 상태에서는 볼륨이 안 올라가야 함
        myTv.silenceButton(); // 음소거 해제
        myTv.volumeUp(); // 음소거 해제 후 볼륨 올라가야 함
        myTv.channelDown();
        myTv.channelDown();
        myTv.volumeDown();
        myTv.powerButton(); // 전원 끔
        myTv.displayStatus();
    }


	
}