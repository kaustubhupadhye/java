
public class Car {
    private int year;
    private String make;
    private double speed;
Car(int y,String x,double z){
this.year=y;
this.make=x;
this.speed=z;
}
public int getyear(){
    return year;
}

public String getmake(){
    return make;
}


public double getspeed(){
    System.out.println("you are going"+this.speed+"mph");
    return speed;
}

void accelarate(){
    speed=speed+1;
	
} 
}

class Racetrack{
	public static void main(String[]args){
	Car c =new Car(1889,"Porche",200.88);
	System.out.println("Current speed is: " + c.getspeed());
	System.out.println("Current year is: " + c.getyear());
	c.accelarate();
	System.out.println("Current speed is: " + c.getspeed());
                                        
	}
}


