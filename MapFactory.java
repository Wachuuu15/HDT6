import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class MapFactory {
	public Map<Integer, Producto> mapGenerator(int mapType){
	    switch (mapType) {
	      case 1:
	        return new HashMap<Integer, Producto>();
	      case 2:
	        return new TreeMap<Integer, Producto>();
	      case 3:
	        return new LinkedHashMap<Integer, Producto>();
	      default:
	        return null;
	    }
	  }
}
