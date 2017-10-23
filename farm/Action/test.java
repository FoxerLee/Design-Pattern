package action;

public class test {//It's just a test.
	public static void main(String[] args) {
		Entity human = new Entity();
		human.setName("LiYuan");
		human.runAction(Watering.create());
	}
}
