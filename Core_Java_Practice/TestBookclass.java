/* WAP in java to create a class book having fields bookid,bookname,price and author and getdata method
with 4 parameters and showdata method. */

class Book{

  int bookid;
  String bookname;
  int price;
  String author;


  void getdata(int bkid,String bName,int pr,String au){

     bookid = bkid;
     bookname = bName;
     price = pr;
     author = au;
  }

  void showdata(){

     System.out.println("Book id =" + bookid);
     System.out.println("Book name =" + bookname);
     System.out.println("Book price =" + price);
     System.out.println("Book author =" + author);

  }
}

class TestBookclass{

   public static void main(String[] args){

     Book b = new Book();
     b.getdata(23,"Wings of fire",200,"APJ Abdul Kalam");
     b.showdata();
   }
}