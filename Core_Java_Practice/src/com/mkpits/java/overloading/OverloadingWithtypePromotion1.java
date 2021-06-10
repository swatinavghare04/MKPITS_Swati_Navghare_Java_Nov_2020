//method overloading with type promotion if matching found

class OverloadingWithtypePromotion1 {
    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }

    public static void main(String[] args) {
        OverloadingWithtypePromotion1 obj = new OverloadingWithtypePromotion1();
        obj.sum(20, 20);
    }
}