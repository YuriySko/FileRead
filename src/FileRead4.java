import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: user<br/> Date: 22.09.2021<br/> Time: 18:30<br/>
 * Четвертый способ чтения файла.
 */
public class FileRead4 {
    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("file2.txt")).forEach(System.out::println);

    }
}
