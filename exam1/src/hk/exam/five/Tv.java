package hk.exam.five;

// 미구현클래스
public abstract class Tv {

	protected boolean power; // tv전원		전원이 꺼진 상태에서는 다른 기능들이 절대 작동되어서는 안된다.
	protected int channel; // 채널 			제일 작은 채널값은 1 최대값 5 5를 넘기면 1이 되어야 함 / 1에서 내려가면 5
							
	protected int volume; // 볼륨 			최소 0 최대 3 0에서는 더 내려가지 않음 / 3에서 더 올라가면 안됨

	public Tv() {
		power = false;
		channel = 1;
		volume = 0;
	}

	// tv전원 키거나 끔
	public abstract void powerButton();

	// 채널을 올린다
	public void channelUp() {
		
		 if (power) {
	            channel = (channel % 5) + 1;
	            System.out.println("현재 채널: " + channel);
	        } else {
	            System.out.println("TV가 꺼져 있습니다.");
	        }
		System.out.println("현재 채널: " + channel);
	}

	// 채널을 내린다
	public void channelDown() {
		   if (power) {
	            channel = (channel == 1) ? 5 : channel - 1;
	            System.out.println("현재 채널: " + channel);
	        } else {
	            System.out.println("TV가 꺼져 있습니다.");
	        }
		
		
	}

	// 볼륨을 올린다
	public void volumeUp() {
		if (power) {
            if (volume < 3) {
                volume++;
                System.out.println("현재 볼륨: " + volume);
            } else {
                System.out.println("최대 볼륨에 도달했습니다.");
            }
        } else {
            System.out.println("TV가 꺼져 있습니다.");
        }
	}

	// 볼륨을 낮춘다
	public void volumeDown() {
		if (power) {
            if (volume > 0) {
                volume--;
                System.out.println("현재 볼륨: " + volume);
            } else {
                System.out.println("최소 볼륨에 도달했습니다.");
            }
        } else {
            System.out.println("TV가 꺼져 있습니다.");
        }
	}

	@Override
	public String toString() {
		return "Tv [power " + power + ", channel=" + channel + ", volume=" + volume + "]";
	}

}
