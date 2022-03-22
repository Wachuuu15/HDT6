/**
 * 
 */

/**
 * @author jenny
 *
 */

import java.util.Map;
import java.util.HashMap;

public class Controlador {

	private Map<Integer, Producto> map;
	  private Map<Integer, Producto> collectionMap;
	  
	  public void Map(String pathway, int key){
	    Reader reader = new Reader(pathway);
	    mapType(key);
	    for(int i=0; i < reader.evaluateTxt().size(); i++){
	      //              key                     type            productname       quantity
	      map.put(i, new Producto(reader.evaluateTxt().get(i)[0].trim(), reader.evaluateTxt().get(i)[1].trim(), 100));
	    }
	    
	  }

	  public void mapType(int type){
	    MapFactory mapFactory = new MapFactory();
	    System.out.println(new HashMap<>());
	    this.map = mapFactory.mapGenerator(type);
	    this.collectionMap = mapFactory.mapGenerator(type);
	  }

	  public boolean addProducto(String categoria, String descrip, int cantidad, int index){
	    boolean eliminado = false;
	    int key = 0;
	    while(key < map.size()){

	      if(map.get(key).getCategoria().toLowerCase().equals(categoria.toLowerCase()) && map.get(key).getDescrip().toLowerCase().equals(descrip.toLowerCase())){
	        map.get(key).subtract(cantidad);
	      
	        collectionMap.put(index, new Producto(map.get(key).getCategoria().trim(), map.get(key).getDescrip().trim(), cantidad));

	        eliminado =  true;
	      }
	      key++;
	    }
	    return eliminado;
	  }
}
