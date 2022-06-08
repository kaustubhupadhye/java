public class Mammals{
	 public void m(){
	System.out.println("I am mammale");
	}
}
class MarineAnimals extends Mammals{
	 public void n(){
	System.out.println("i am marine animals");
	}
}
class Bluewhale extends MarineAnimals
{
	public void bluewhale()
	{
	System.out.println("i am belong to mammals and MarineAnimals");
	}
}
class xyz{
		public static void main(String []args){
		Bluewhale t=new Bluewhale();
		MarineAnimals ma=new MarineAnimals();
		Mammals mm=new Mammals();
		t.m();
		ma.n();
		t.bluewhale();
	}
}		