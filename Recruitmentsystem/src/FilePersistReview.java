import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilePersistReview implements PersistReview{
    private File file;
    @Override
    public boolean persistReviewData(reviewer reviewer, candidate candidate, position position1, boolean reviewResult) {
        return reviewResult;
    }

    public static void main(String args[]) {
        try {
   writeLargeBytesFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public  static  void writeLargeBytesFile() throws IOException{
        String Filename = "/home/harikrishna/IdeaProjects/Recruitmentsystem/Text.txt";
        Path path = Paths.get(Filename);

        OutputStream outputStream = Files.newOutputStream(path, StandardOpenOption.APPEND);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        int iter = 0;
        while (iter < 10){
            byte[] data = FileIO.createByteData();
            bufferedOutputStream.write(data);
            iter++;
        }
        bufferedOutputStream.close();
    }

    public static void appendText(String fileName,String fileContents)
    {
        String path = "/home/harikrishna/IdeaProjects/Recruitmentsystem/Text.txt";
        try
        {
            Files.write(Paths.get(path),fileContents.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    private static String createCharData() {
        return "some-string-data----some-string-data";
    }
}
