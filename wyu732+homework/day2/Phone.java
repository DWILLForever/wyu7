package homework;

public class Phone {
	private float screenSize;
	private String brand;
	private String CPU;
	private String memory;
	
	public Phone(float screenSize, String brand, String cPU, String memory) {
		super();
		this.screenSize = screenSize;
		this.brand = brand;
		CPU = cPU;
		this.memory = memory;
	}
	public float getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "Phone [screenSize=" + screenSize + ", brand=" + brand + ", CPU=" + CPU + ", memory=" + memory + "]";
	}
	
	public static void main(String[] args) {
		Phone p=new Phone(6.9f,"2020.9.16","чичл9000","16G");
		System.out.println(p.toString());
	}
	
}
