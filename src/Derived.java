
public class Derived extends Base {
	String name = "박ㅈ민";

	void print() {
		System.out.println("나는 좌식 메소드");
	}
	
	void display() {
		this.print();
		super.print();
	}
}
