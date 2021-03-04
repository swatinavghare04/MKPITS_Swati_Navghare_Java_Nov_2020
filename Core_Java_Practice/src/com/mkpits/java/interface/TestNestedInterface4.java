// Example of Nested Interface in Java.

interface TestPrintMessage{
     void print();  
     interface MessagePrintable{  
       void msg();  
     }  
    }  


    interface TestPrintMessage1{
     void print();
     interface MessagePrintable{
       void msg();
     }
    }

class example implements TestPrintMessage.MessagePrintable
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