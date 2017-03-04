package demo.fei.ch1;

public class TestObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People person = new People();
		person.setAge(11);
		System.out.println(person.getAge());
		
		
	}

}

class People{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}