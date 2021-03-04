// WAP for StringBuffer - capacity() method


class StringBufferExample6{

   public static void main(String[] args){

       StringBuffer sb = new StringBuffer();
       System.out.println(sb.capacity());
       sb.append("Hello");
       System.out.println(sb.capacity());
       sb.append("Java is a language");
       System.out.println(sb.capacity());
     }
}
