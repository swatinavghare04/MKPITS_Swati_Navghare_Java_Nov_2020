// string method example

class TestStringMethodUseForLoop {
    public static void main(String[] args) {
        String s3 = new String("example");
        int ch = s3.length();
        for (int i = 0; i < ch; i++) {
            System.out.println(s3.charAt(i));
        }
    }
}
