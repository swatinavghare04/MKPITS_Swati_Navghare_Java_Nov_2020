//this keyword


class book
{
 // creating instance variable;
 String bookname;
 //creating a constructor with parameters
 public book(String bookname)
 {
 // bookname = bookname; -- it will give bookname = null therfore use this keyword
  this.bookname = bookname;
 }
// creating a method display
  public void display()
   {
       System.out.println("bookname = "+ bookname);
   }
}

// creating class
class thisex1
{
  public static void main(String[] args)
  {
    book b1 = new book("java");
    b1.display();
   }
  }
