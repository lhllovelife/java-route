package CourseTest;

import java.io.File;
import java.io.FileOutputStream;

public class FileTest01 {
    public static void main(String[] args) {
        File f1 = new File("F:\\temp");
        System.out.println("f1: "+ f1.getAbsolutePath());
        File f2 = new File("F:\\temp\\");
        System.out.println("f2: "+ f2.getAbsolutePath());

        f1.mkdir();
    }
}
