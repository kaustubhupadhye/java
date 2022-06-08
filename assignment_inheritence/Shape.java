 public class Shape{
	void shape(){
		System.out.println("this is shape");
}
 }

class Polygon extends Shape{
	void shape(){
		System.out.println("Polygon is shape");
}
}
class Rectangle extends Shape{
	/*void shape(){
		System.out.println("rectangle is shape");
	}*/
}

class main{
	public static void main(String args[]){
	Rectangle r=new Rectangle();
	Polygon p =new Polygon();
	
	r.shape();
	p.shape();
	}
}
	

	
		


	
