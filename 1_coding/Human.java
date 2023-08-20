package pk;

public class Human {
	

	public String getname(String nname) {
		return nname;
	}

	public String getcolor(String ncolor) {
		return ncolor;
	}

	public int getage(int nage) {
		return nage;
	}

	public int getheight(int nheight) {
		return nheight;
	}

	private double getweight(double nweight) {
		return nweight;
	}

	private void walk() {
		System.out.println("He is walking");
	}

	public static void main(String[] args) {
		Human h1 = new Human();
		System.out.println("Name is =" + h1.getname("zau naw"));
		System.out.println("Color is =" + h1.getcolor("white"));
		System.out.println("age is =" + h1.getage(20));
		System.out.println("weight =" + h1.getweight(120) + "Lb");
		System.out.println("height is =" + h1.getheight(180) + "cm");
		h1.walk();
	

	}
}
