
//Example of inheritance

class Inheritanceemployee {
    float salary = 40000f;
}

class TestInheritance4 extends Inheritanceemployee {
    float bonus = 1000f;

    public static void main(String[] args) {
        TestInheritance4 p = new TestInheritance4();
        System.out.println("salary = " + p.salary);
        System.out.println("bonus = " + p.bonus);
    }
}
