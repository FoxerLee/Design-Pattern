package SecuritySystem;

public class Alarm {

	private int level;
	
	public Alarm(){
		level = 0;
	}
	
	public Alarm(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void run() {
		if(level < 1) {
			System.out.println("send out a alarm");
		}
		else {
		System.out.println("Send out a loud alarm");
		}
	}
}
