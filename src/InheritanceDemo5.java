/*
 * 상송시 주의할 점
 * 4. 같은 이름을가진 리소스는 상속되지 않는다
 *  - overshadow 변수 : 같은이름의 변수
 *  - override method : 같은 이름의 메소드 
 */
public class InheritanceDemo5 {
	public static void main(String[] args) {
		Derived d = new Derived();
		System.out.println(d.name);
//		d.print();
		d.display();
	}

}
