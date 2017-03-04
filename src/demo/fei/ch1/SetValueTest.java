package demo.fei.ch1;

public class SetValueTest {

	private void setUserName(User user){
		user.setName("Hello world");
		System.out.println(user);
		user = new User();
		System.out.println(user);
		user.setName("feizhang");
	}
	/*
	public static void main(String[] args) {
		SetValueTest test = new SetValueTest();
		User user = new User();
		test.setUserName(user);
		System.out.println(user.getName());

	}*/
	/**
	 * 方法中对象的引用是“副本”，所以对象交换就没起作用
	 * @param arg1
	 * @param arg2
	 */
	public static void tricky(Point arg1, Point arg2)
	{
	    arg1.x = 100;
	    arg1.y = 100;
	    Point temp = arg1;
	    arg1 = arg2;
	    arg2 = temp;
	    
//	    arg2.x = 100;
//	    arg2.y = 100;
	}
	 
	public static void main(String [] args)
	{
	    Point pnt1 = new Point(0,0);
	    Point pnt2 = new Point(0,0);
	    System.out.println("before >>>point1::::"+pnt1+",point2::::"+pnt2);
	    System.out.println("X: " + pnt1.x + " Y: " +pnt1.y);
	    System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
	    System.out.println(" ");
	    tricky(pnt1,pnt2);
	    System.out.println("X: " + pnt1.x + " Y:" + pnt1.y);
	    System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
	    
	    System.out.println("------------------------------");
		SetValueTest test = new SetValueTest();
		User user = new User();
		test.setUserName(user);
		System.out.println(user.getName());
	}

}

class User{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Point{
	public int x;
	public int y;
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	
}
