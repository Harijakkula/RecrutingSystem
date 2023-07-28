import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import  java.nio.file.Paths;

public class FileIO {

    public  static  void main(String[] args) {
        try {
            //byte[] data = readsamllImageFile();
            //writesmallImageFile();
            writeLargeBytesFile();
            //String data = readSmallCharFile();
            //  System.out.println(data);
        }
        catch (IOException ex){
            System.out.println("small image file doesn't exist---");
        }
    }
    public  static String readSmallCharFile() throws IOException {
        Path path = Paths.get("C:\\Temp\\test-out.txt");
        return Files.readString(path);
    }
    public static  byte[] readsamllImageFile() throws IOException {
        String fileName = "C:\\Temp\\temp1.png";
        Path path = Paths.get(fileName);
        return Files.readAllBytes(path);
    }
    public  static void writeSmallCharFile() throws IOException {
        Files.writeString(Paths.get("C:\\Temp\\test-out-copy.txt"),"sometextdata");
    }

    public static  void readLargeCharFile() {
        String fileName = "C:\\Temp\\PositionStatus.java";
        Path path = Paths.get(fileName);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = Files.newBufferedReader(path);
            String line = "";
            while (line != null){
                line = bufferedReader.readLine();
                //process each line-----
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    //ignore-----
                }
            }
        }
    }

    public  static void writeLargeCharFile(){
        String fileName = "";
        Path path = Paths.get(fileName);
        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path)) {
            String data = createCharData();
            int iter = 0;
            while (iter < 10){
                bufferedWriter.write(data);
                iter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String createCharData() {
        return "some-string-data----some-string-data";
    }

    public static void writesmallImageFile() throws IOException{
        byte[] bytes = readsamllImageFile();

        String fileName = "C:\\Temp\\temp1-copy.png";
        Path path = Paths.get(fileName);
        Files.write(path,bytes);
    }
    public static void readLargeBytesFiles() throws IOException {
        String fileName = "C:\\ Temp\\screenshot-1.png";
        Path path = Paths.get(fileName);
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            inputStream = Files.newInputStream(path);
            bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] data = new byte[4 * 1024];
            int numBytes = 0;
            while (numBytes != -1) {
                numBytes = bufferedInputStream.read(data);


                bufferedInputStream.close();
            }
        } catch (IOException ex) {
            throw  ex;
        } finally {
            if(bufferedInputStream != null){
                bufferedInputStream.close();
            }
        }
    }

    public  static  void writeLargeBytesFile() throws IOException{
        String fileName = "C:\\Temp\\write-large-bytes-file.binary";
        Path path = Paths.get(fileName);
        OutputStream outputStream = Files.newOutputStream(path);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        int iter = 0;
        while (iter < 10){
            byte[] data = createByteData();
            bufferedOutputStream.write(data);
            iter++;
        }
        bufferedOutputStream.close();
    }

    public static byte[] createByteData(){
        return "--jakkula-harikrishna jakkula-harikrishna--".getBytes();
    }

}