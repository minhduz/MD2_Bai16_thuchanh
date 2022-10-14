import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Bai1 {

    public void readFileText(String path){
            try {
                File file = new File(path);
                if(!file.exists()){
                    throw new FileNotFoundException();
                }
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = "";
                int sum = 0;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                    sum+=Integer.parseInt(line);
                }
                br.close();
                System.out.println("Tổng là: "+sum);

            }catch (Exception e){
                System.out.println("File ko tồn tại hoặc nội dung có lỗi");
            }
    }


    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        Bai1 readFileEx = new Bai1();
        readFileEx.readFileText(path);
    }
}