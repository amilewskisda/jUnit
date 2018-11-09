import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {
    @Test(expected = FileNotFoundException.class)
    public void testFileExist() throws IOException {
        System.out.println("Test if file exist");
        File file = new File("C:/AndroidWorkspace/data.cs"); //musi być plik nie folder
/*        if(file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not exists");
        }*/
        FileReader reader = new FileReader(file); // tutaj moge wrzucic String lub obiekt File, File posiada kilka przydatnych metod jak np exist (jest bardziej bezpieczne od String)
        reader.read();
        reader.close();
    }
}
