public class ContinueEx {

    public static void main(StringEx args[])
    {
        System.out.println ("starting loop:");
        for (int n = 0; n < 7; ++n)
        {
            System.out.println ("in loop: " + n);
            if (n == 2) {
                continue;
            }
            System.out.println ("   survived first guard");
            if (n == 4) {
                break;
            }
            System.out.println ("   survived second guard");
            // continue at head of loop
        }
// break out of loop
        System.out.println ("end of loop or exit via break");
    }
}
