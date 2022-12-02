package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p5 = new Point(5, 6);
		Point p6 = p5;
		Point p7 = new Point(5, 6);
		System.out.println("p5 equals p6: " + p5.equals(p6));
		System.out.println("p5 equals p7: " + p5.equals(p7));
		System.out.println(p5.toString());
	}

}
