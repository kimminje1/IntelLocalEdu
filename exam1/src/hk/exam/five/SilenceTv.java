package hk.exam.five;

public abstract  class SilenceTv extends Tv {

	protected boolean silence = false;    // 음소거 동작 가능 여부
	protected int previousVolume = 0;     // 이전 볼륨 정보
	public SilenceTv() {
        super();
        silence = false;
        previousVolume = 0;
    }
	// 음소거 버튼
	public void silenceButton() {
		  if (power) {
	            silence = !silence;
	            if (silence) {
	                previousVolume = volume;
	                volume = 0;
	            } else {
	                volume = previousVolume;
	            }
	            System.out.println("음소거: " + (silence ? "켜짐" : "꺼짐"));
	        } else {
	            System.out.println("TV가 꺼져 있습니다.");
	        }
	}
	
	

	@Override
	public String toString() {
		return "SilenceTv [power " + power + ", channel=" + channel + ", volume=" + volume + " silence=" + silence
				+ "]";
	}

	

	
}
