package mypack;

public class Launcher {
	
    static LinkNode head=null;
    
    public static void deleteroll(int roll)
    {
    LinkNode c=head;
    if(c.data.roll==roll)
    	head=head.next;
    else
    {
      while(c.next!=null)
      {
    	  if(c.next.data.roll==roll)
    	  {
    		  c.next=c.next.next;
    		  break;
    	  }
    	  c=c.next;
      }
    	if(c==null)
    	{
    		System.out.println("Invalid roll no");
    	}
    }
    }
    
    public static void beforeroll(int roll,Student data)
    {
    	LinkNode c=head;
    	if(c.data.roll==roll)
    	{
    		addBeg(data);
    	}
    	else
    	{
    	while(c.next!=null)
    	{
    	 if(c.next.data.roll==roll)
    	 {
    		 LinkNode newnode=new LinkNode(data);
    		 newnode.next=c.next;
    		 c.next=newnode;
    		 break;
    	 }
    	 c=c.next;
    	}
    	if(c.next==null)
    		System.out.println("Invalid roll no");
    	
    	}
    	}
    
    public static void afterroll(int roll,Student data) {
    	LinkNode curr=head;
    	while(curr!=null)
    	{
    		if(curr.data.roll==roll) 
    		{
    		  LinkNode newnode=new LinkNode(data);
    		  newnode.next=curr.next;
    		  curr.next=newnode;
    		  break;
    		}
    	  curr=curr.next;	
    	}
    	if(curr==null)
    		System.out.println("Invalid roll no");
    }
	
	public static void addEnd(Student data)
	{
		if(head==null)
			head=new LinkNode(data);
		else
		{
		 LinkNode c=head;
		 while(c.next!=null)
		 {
			 c=c.next;
		 }
		 c.next=new LinkNode(data);
		}
	}
    
	
	public static void addBeg(Student data)
	{
		if(head==null)
			head=new LinkNode(data);
		else
		{
		 LinkNode c=new LinkNode(data);
		 c.next=head;
		 head=c;
			
		}
	}
	public static void main(String[] args) {
		
		addEnd(new Student(1,"Aman"));
		addEnd(new Student(2,"amar"));
		addEnd(new Student(3,"amit"));
		
		addBeg(new Student(1,"ravi"));
		addEnd(new Student(6,"ratan"));
		afterroll(8,new Student(10,"Raaman"));
		deleteroll(6);
		beforeroll(2,new Student(1,"kin"));
		deleteroll(1);
		deleteroll(1);
		/*
		LinkNode head=new LinkNode(new Student(1,"Amar"));
		head.next=new LinkNode(new Student(2,"Amit"));
		head.next.next=new LinkNode(new Student(3,"Ravi"));
	   */
		LinkNode c=head;
		while(c!=null)
		{
			System.out.println(c.data);
			c=c.next;
		}
	}

}
