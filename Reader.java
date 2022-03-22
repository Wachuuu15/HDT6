/**
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author jenny
 *
 */
public class Reader {
	String pathway;
	  String cadena;
	  File archivo;
	  FileReader leer;
	  BufferedReader almacenamiento;
	  String texto;

	  public Reader(String miArchivo) {
	    this.pathway = miArchivo;
	    archivo = new File(miArchivo);
	    if (!archivo.exists()) {
	      try {
	        archivo.createNewFile();
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	    } else {
	      try {
	        leer = new FileReader(archivo);
	        almacenamiento = new BufferedReader(leer);
	        cadena = "";
	        while (cadena != null) {
	          try {
	            cadena = almacenamiento.readLine();
	          } catch (Exception e) {
	            e.printStackTrace();
	          }
	        }
	        almacenamiento.close();
	        leer.close();
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	    }
	  }

	  public String leer() {
	    
	    texto = "";
	    try {
	      Scanner myReader = new Scanner(archivo);
	      while (myReader.hasNextLine()) {
	        texto += myReader.nextLine() + "\n";
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }
	    return texto;
	  }

	  public ArrayList<String[]> evaluateTxt() {
	   
	    Reader reader = new Reader(pathway);
	    Scanner sc = new Scanner(reader.leer());
	    
	    ArrayList<String[]> txtList = new ArrayList<String[]>();
	    while(sc.hasNextLine()){
	      String[] str = sc.nextLine().split("\\|");
	      //System.out.println(sc.nextLine().split("\\|")[0]);
	      txtList.add(str);
	    }
	    return txtList;
	    
	    
	  }

}
