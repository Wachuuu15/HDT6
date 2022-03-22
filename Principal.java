
/**
 * @author jenny
 * HDT 6
 * 
 */

import java.io.File;
import java.util.Scanner;
import java.util.HashMap;


public class Principal{
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		boolean salida = false;
		while(!salida) {
			
			System.out.println("Elija la opción que desea ejecutar ");
			System.out.println("1. Mostrar lista de productos");//mostrar lista
	        System.out.println("2. HashMap"); //Hashmap
	        System.out.println("3. LinkedHashMap");
	        int opc = sc.nextInt();
	        sc.nextLine();
	        
	        
	        switch(opc) {
	        case 1: 
	        	File doc =
	        	new File("C:\\Users\\jenni\\OneDrive\\Documentos\\GitHub\\HDT6\\ListadoProducto.txt");
	        	Scanner obj = new Scanner(doc);
	        	
	        	while (obj.hasNextLine())
	              
	        		System.out.println(obj.nextLine());
	        	break;
	        	
	        case 2:
	        	HashMap<String, Producto>productosmercado = new HashMap<String, Producto>();
	        	productosmercado.put("Producto", new Producto("Bebida",1,"Chocolatito"));
	        	
	        	System.out.println(productosmercado);
	        }
		}
		sc.close();

		
        }
	

	
	
		
}
