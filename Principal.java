
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
		
		Controlador controlador = new Controlador();
		
		System.out.println("Elegir tipo de mapa");
	    //HashMap, 2)TreeMap, 3)LinkedHashMap.
	    System.out.println("1. Hashmap");
	    System.out.println("2. TreeMap");
	    System.out.println("3. LinkedHashMap");

	    Scanner sr = new Scanner(System.in);

	    int opt = sr.nextInt();
	    sr.nextLine();
		
		Scanner sc = new Scanner(System.in);
		boolean salida = false;
		while(!salida) {
			
			System.out.println("Elija la opción que desea ejecutar ");
			System.out.println("1. Mostrar lista de productos");//mostrar lista
	        System.out.println("2. Buscar producto"); //Hashmap
	        System.out.println("3. Agregar producto");
	        System.out.println("4. Salir");
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
	        	boolean veri = false;
	            while(!veri){ 
	              int i = 0;
	              System.out.println("\n\nIngresar categoria del producto");
	              String type = sc.nextLine().toLowerCase();

	              System.out.println("\nIngresar el nombre del producto");
	              String productName = sc.nextLine().toLowerCase();

	              System.out.println("\nIngresar la cantidad a agregar");
	              try {
	                int quantity = sc.nextInt();
	                sc.nextLine();

	                veri = controlador.addProducto(type, productName, quantity, i);
	                i++;
	              } catch (Exception e) {
	                System.out.println("Numero incorrecto");
	              }

	              if(veri == false){
	                System.out.println("\nNo se encontro su producto, intente de nuevo");
	              }
	            }
	            break;
	        	
	        	
	        case 3:
	        	HashMap<String, Producto>productosmercado = new HashMap<String, Producto>();
	        	productosmercado.put("Producto", new Producto("Bebida","Chocolatito",1));
	        	
	        	System.out.println(productosmercado);
	        	break;
	        	
	        case 4:
	        	
	        	System.out.println("Bye :D");
	        	salida = true;
	        	break;
	        }
		}
		sc.close();

		
        }
	

	
	
		
}
