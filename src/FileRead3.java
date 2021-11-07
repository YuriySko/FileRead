import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: user<br/> Date: 22.09.2021<br/> Time: 18:16<br/>
 * Третий способ чтения файла.
 */
public class FileRead3 {
    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Paths.get("file.txt"));

        for (String item : list) {
            System.out.println(item);
        }
    }
}
