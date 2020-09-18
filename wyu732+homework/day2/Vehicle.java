package homework;

public class Vehicle {
	private String name;
	private float speed;
	private float size;
	
	
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", speed=" + speed + ", size=" + size + "]";
	}
	public void speedUp(float speed) {
		System.out.println("º”ÀŸ"+speed);
	}
	public void speedDown(float speed) {
		System.out.println("ºıÀŸ"+speed);
	}
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		v1.name="Car";
		v1.speed=20f;
		v1.size=100f;
		System.out.println(v1.toString());
		v1.speedUp(v1.speed);
		v1.speedDown(v1.speed);
		
	}
}
