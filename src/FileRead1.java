import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: user<br/> Date: 22.09.2021<br/> Time: 14:55<br/>
 * Первый способ чтения файла.
 */
public class FileRead1 {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("file.txt"));

    byte[] buffer = new byte[dis.available()];
    while (dis.available() != 0){
        int count = dis.read(buffer);
        System.out.println(count);
        if (count > 0){
            System.out.println(new String(buffer));
           // System.out.println(buffer.length);
        }
    }
    }
}
