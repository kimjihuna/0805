import java.util.Date;

public class Car {
	private String name;
	private int price;
	private String maker;
	private Date today;
	private final double PI; 

	public Car(String name, int price, String maker) {
		super();
		this.name = name;
		this.price = price;
		this.maker = maker;
//		this.PI = 3.141596;
		System.out.println("방금 객체가 생성되었습니다.");
	}

	{
		System.out.println("Hello World");
		this.today = new Date();
		this.PI = 3.141596;
	}// 초기화 블록 initialization block

	@Override
	public String toString() {
		return "오늘은" + this.today;
	}
	
	//생성자의역할은 멤버벼수 또느 멥버상수의 초기화
	//생성자를 통해서 또는 initialization block을 초기화한다

}                                                                     	
