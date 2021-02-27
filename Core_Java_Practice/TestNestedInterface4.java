// Example of Nested Interface in Java.

interface printable{  
     void print();  
     interface MessagePrintable{  
       void msg();  
     }  
    }  


    interface printable{
     void print();
     interface MessagePrintable{
       void msg();
     }
    }

class example implements printable.MessagePrintable
{
	public void print()
		{
			System.out.println("print");
	}

	public void msg()
		{
			System.out.println("msg");
	}
}
class TestNestedInterface4
{
	public static void main(String[] arg)
	{
		example e=new example();
		e.msg();
		e.print();

	}
}