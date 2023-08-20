package pk;

public class MJYC {

	private String Teacher_name = "wane";
	private int Teacher_Id = 5465465;
	private double salary = 3000;
	private int age = 55;

	MJYC() {

	}

	public MJYC(String name, int id, double salaryy, int nage) {
		Teacher_name = name;
		Teacher_Id = id;
		salary = salaryy;
		nage = age;
	}
	public int getage() {
		return age;
	}
	

	public void setage(int nage) {
		age = nage;
		
	}
	
	public String getname() {
		return Teacher_name;
	}
	public void setname(String name) {
		Teacher_name = name;
	}
	
	public int getid() {
		return Teacher_Id;
	}
       public void setid(int id) {
		Teacher_Id = id;
		
	}
	
	double getsalary() {
		return salary;
	}
	public void  setsalary(double salaryy) {
		salary=salaryy;
		
	}


	public void walk() {
		System.out.println("Teacher is walking");
	}

	public void eat() {
		System.out.println("Teacher is eating");

	}

	public static void main(String[] args) {

		MJYC T = new MJYC();
		T.getage();
		System.out.println(T.getsalary());
		T.setsalary(40000);
		System.out.println("Name is " + T.Teacher_name + ",\nId is " + T.Teacher_Id + ",\nSalary is " + T.salary+",\n Age is "+T.age);
		T.walk();
		T.eat();

	}
}
