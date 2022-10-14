import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(max<numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "C:\\Users\\minhd\\OneDrive\\Desktop\\Source\\MD2_Bai16_thuchanh\\src\\number.txt";
        String PATH_RESULT = "C:\\Users\\minhd\\OneDrive\\Desktop\\Source\\MD2_Bai16_thuchanh\\src\\result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT,maxValue);
    }
}
