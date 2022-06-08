package assignment_inheritance;
public class Car {
    private int year;
    private String make;
    private double speed;
Car(int y,String x,double z){
year=y;
make=x;
speed=z;
}
public int getyear(){
    return year;
}

public String getmake(){
    return make;
}


public double getspeed(){
    System.out.println("you are going"+speed+"mph");
    return speed;
}

void accelarate(){
    speed=speed+1;
	
} 
}
class Racetrack{
	public static void main(String args[]){
	Car c=new Car(1889,"Porche",200.88);
	System.out.println("Current speed is: " + c.getSpeed());
	System.out.println("Current year is: " + c.getyear());
	c.accelarate();
	System.out.println("Current speed is: " + c.getSpeed());
                                        
	}
}


