import jdk.dynalink.linker.ConversionComparator;

import java.util.ArrayList;
import java.util.Map;

public class Tratamiento {
    private String nombreMonedaACT;
    public Double conversionBusqueda(Map<String, Double> mapaDatos, int posicion, ArrayList<String> nombres){
        Double dato = null;
        if(posicion % 2 == 0){
            dato = mapaDatos.get(nombres.get(posicion+1));
            this.nombreMonedaACT= nombres.get(posicion+1);
        }else {
            dato = mapaDatos.get(nombres.get(posicion-1));
            this.nombreMonedaACT= nombres.get(posicion-1);
        }
        return dato;
    }

    public String getNombreMonedaACT(){
        return nombreMonedaACT;
    }


}
