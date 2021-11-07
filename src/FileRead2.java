import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: user<br/> Date: 22.09.2021<br/> Time: 18:05<br/>
 * Второй  способ чтения файла.
 */
public class FileRead2 {
    public static void main(String[] args) throws Exception {
        Scanner scaner = new Scanner(new FileInputStream("file2.txt"));

        while (scaner.hasNextLine()){
            System.out.println(scaner.nextLine());
        }
        scaner.close();
    }
}
