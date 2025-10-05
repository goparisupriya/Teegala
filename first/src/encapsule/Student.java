package encapsule;

public class Student {

	 private int age;              // data hidden
	    public void setAge(int a){ age = a; }  
	    public int getAge(){ return age; }
	
	    public static void main(String[] args) {
	        Student s = new Student();
	        s.setAge(20);
	        System.out.println(s.getAge());
	    }
	}
	