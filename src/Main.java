import java.io.*;

public class Main {
    public static void main(String[] args) {
        printCountry("file.txt");
    }
    public static void printCountry(String url){
        File file;
        try {
            file = new File(url);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line ="";
            while ((line = br.readLine()) != null){
                String[] a = line.split(",");
                String name = a[2];
                System.out.println(name);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
