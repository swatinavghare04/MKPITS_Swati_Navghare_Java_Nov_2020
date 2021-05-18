//WAP in java - use of protected access modifiers in program;

class TestA2 {
    protected void msg() {
        System.out.println("Hello java");
    }
}

public class ProtectedAccessModifiers extends A {
    public void msg() {
        System.out.println("Hello java");
    }

    public static void main(String[] args) {
        TestA2 s = new TestA2();
        s.msg();
    }
}