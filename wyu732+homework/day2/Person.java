package homework;

public class Person {
	private String name;
	private int age;
	private String gender;
	public Person(String name) {
		this.name=name;
		System.out.println("名字:"+name);
	}
	public Person(String name,String gender) {
		this.name=name;
		this.gender=gender;
		System.out.println(name+"是"+gender+"的");
	}
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println(name+"是"+gender+"的，已经"+age+"岁了");
	}
	public static void main(String[] args) {
		Person p1=new Person("miaomiao");
		Person p2=new Person("miaomiao","女");
		Person p3=new Person("miaomiao",21,"女");
	}
	
}
