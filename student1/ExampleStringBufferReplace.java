public class ExampleStringBufferReplace
{
    public static void main(String[] args) {
        StringBuffer phrase = new StringBuffer("hello");
        String substring = "l";
        String replacement = "0";
        int position = phrase.lastIndexOf(substring); // Find start of "two"
        phrase.replace(position, position + substring.length(), replacement);

        System.out.println(phrase);
    }
}
