package homework;

public class Person {
	private String name;
	private int age;
	private String gender;
	public Person(String name) {
		this.name=name;
		System.out.println("����:"+name);
	}
	public Person(String name,String gender) {
		this.name=name;
		this.gender=gender;
		System.out.println(name+"��"+gender+"��");
	}
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println(name+"��"+gender+"�ģ��Ѿ�"+age+"����");
	}
	public static void main(String[] args) {
		Person p1=new Person("miaomiao");
		Person p2=new Person("miaomiao","Ů");
		Person p3=new Person("miaomiao",21,"Ů");
	}
	
}
