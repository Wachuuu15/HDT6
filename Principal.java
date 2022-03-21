
/**
 * @author jenny
 * HDT 6
 * 
 */

import java.io.File;
import java.util.Scanner;

public class Principal{
	public static void main(String[] args) throws Exception{
        File doc =
          new File("C:\\Users\\jenni\\OneDrive\\Documentos\\GitHub\\HDT6\\ListadoProducto.txt");
        Scanner obj = new Scanner(doc);

        while (obj.hasNextLine())
            System.out.println(obj.nextLine());
        }
}
