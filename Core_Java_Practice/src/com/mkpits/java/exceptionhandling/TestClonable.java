// WAP in java to illustrate cloneable


class TestClonable implements Cloneable {
    int empno;
    String empname;

    TestClonable(int empno, String empname) {
        this.empno = empno;
        this.empname = empname;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            TestClonable e1 = new TestClonable(123, "Sonu");
            TestClonable e2 = (TestClonable) e1.clone();

            System.out.println(e1.empno + " " + e1.empname);
            System.out.println(e2.empno + " " + e2.empname);
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.toString());
        }
    }
}