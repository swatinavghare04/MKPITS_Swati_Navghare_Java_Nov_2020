// WAP for StringBuffer - ensureCapacity() method


class StringBufferEnsureCapacityExample {

   public static void main(String[] args){

       StringBuffer sb = new StringBuffer();
       System.out.println(sb.capacity());
       sb.append("Hello");
       System.out.println(sb.capacity());
       sb.append("Java is a language");
       System.out.println(sb.capacity());
       sb.ensureCapacity(10);
       System.out.println(sb.capacity());
       sb.ensureCapacity(50);
       System.out.println(sb.capacity());
     }
}
