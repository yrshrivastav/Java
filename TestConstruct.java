public class TestConstruct {
	
	int age ;
	int height;
	String name;

	
	//no argument constructor
	public TestConstruct()
	{
	System.out.println("initialization using no argument constructor");
	age = 15;
	height = 175;
	name = "Rahul";
	}
	
	//parameterized constructor
	public TestConstruct(int a, int h, String n)
	{
	System.out.println("initialization using argument constructor");
	age = a;
	height = h;
	name = n;
	}


	public static void main(String[] args) {
		
		TestConstruct person1 = new TestConstruct();
		person1.age = 13;
		person1.height = 170;
		person1.name="Rajveer";
		person1.print();
		
		TestConstruct person2 = new TestConstruct();
		person2.age = 14;
		person2.height = 174;
		person2.name= "Vaibhav";
		person2.print();
		
		TestConstruct person3 = new TestConstruct();
		person3.print();
		
		TestConstruct person4 = new TestConstruct(25, 177, "Akash" );
		person4.print();
	}
	void print() {
		System.out.println(age + "  " + height + "  " + name);
	}
}