import java.io.FileInputStream;
import java.io.IOException;


/**
 * Created by IntelliJ IDEA.<br/>
 * User: user<br/> Date: 28.09.2021<br/> Time: 20:18<br/>
 * To change this template use File | Settings | File Templates.
 */
public class FileCSVReader {
    public static void main(String[] args) throws IOException {
        //DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\user\\Downloads\\price.csv"));
        FileInputStream stream = new FileInputStream("C:\\Users\\user\\Downloads\\price.csv");
        int streamLenght = stream.available();
        if (streamLenght > 0){
            byte[] data = new byte[streamLenght];
            stream.read(data);

            String text = new String(data, "cp1251");

            System.out.println(text);

        }



    }


}
