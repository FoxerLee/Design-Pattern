package SecuritySystem;

public interface State {
	abstract public void check();
	abstract public void attack();
	abstract public void checkTime(SecuritySystem system,int time); 
}