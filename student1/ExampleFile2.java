import java.io.*;

public class ExampleFile2
{
    public static void main(String[] args) throws IOException
    {

//        String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";
//
//        FileOutputStream outputStream = new FileOutputStream("data.txt");
//        byte[] strToBytes = fileContent.getBytes();
//        outputStream.write(strToBytes);
//
//        outputStream.close();

        String fileName = "C:\\Users\\Shree\\IdeaProjects\\project1\\data.txt";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            //process the line
            System.out.println(line);
        }




//
//        OutputStream os = null;
//        try {
//            os = new FileOutputStream(new File("data.txt"));
//            os.write(data.getBytes(), 0, data.length());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                os.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
