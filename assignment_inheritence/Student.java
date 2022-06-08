Public Class Student{
	String name;
	Public student(String s){
	name=s;
}
	Public student(){
	name="unknown";
	}
}
Class main{
	Public static void main(String args[]){
	Student s=new student(“xyz”);
	Student s1=new student();
	System.out.println(s.name);
	System.out.println(s1.name);
}
}
