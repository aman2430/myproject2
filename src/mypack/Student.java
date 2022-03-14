package mypack;

public class Student {
      
	    int roll;
	    String name;
	    
	    public Student(int roll,String name)
	    {
	    	this.roll=roll;
	    	this.name=name;
	    }
	    public String toString()
	    {
	    String info;
	    info="student details :"+name+"("+roll+")";
	    return info;
	    }
}
