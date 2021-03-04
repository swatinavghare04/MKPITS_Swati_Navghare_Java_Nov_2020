// Example of Static Method in Interface.

interface TestDrawable{

    void draw();  
    static int cube(int x){return x*x*x;}  
    }  
    
    class TestRectangle implements TestDrawable{
    
    public void draw(){System.out.println("drawing rectangle");}  
    }  
      
    class TestInterfaceStatic{  
    
    public static void main(String args[]){

        TestDrawable d=new TestRectangle();
    d.draw();  
    System.out.println(TestDrawable.cube(3));
    }
  }  