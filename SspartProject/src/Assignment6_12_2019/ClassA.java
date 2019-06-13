package Assignment6_12_2019;

public class ClassA {

	String a;
	String b;
	String c;
	String d;
	String e;

	ClassA(String a, String b, String c, String d, String e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}

	public boolean contains(String str) {
		if (str.equals(this.a)) {
			return true;
		} else if (str.equals(this.b)) {
			return true;
		} else if (str.equals(this.c)) {
			return true;
		} else if (str.equals(this.d)) {
			return true;
		} else if (str.equals(this.e)) {
			return true;
		}else {
			return false;
		}
	}

}
