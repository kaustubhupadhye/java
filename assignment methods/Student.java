public class Student{
	String name;
	int roll_no;
	Student(String s,int b){
		this.name=s;
		this.roll_no=b;
		System.out.println(s+ " "+ b);
}
}
class main{
	public static void main(String args[]){
		Student s=new Student("John",2);
	}
}