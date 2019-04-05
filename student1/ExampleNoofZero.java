public class ExampleNoofZero {
    public static void main(String[] args) {


        Integer intgr = 31;
        String binary = Integer.toBinaryString(intgr);
        System.out.println(binary);
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                count++;
            }
        }
        System.out.println(count);
    }
}