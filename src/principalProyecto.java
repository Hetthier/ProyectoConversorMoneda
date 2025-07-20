import com.sun.management.UnixOperatingSystemMXBean;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class principalProyecto {
    public static void main(String[] args) throws IOException, InterruptedException {
        Iniciales inicio = new Iniciales();
        Scanner lectura = new Scanner(System.in);

        ArrayList<String> monedasDeInteres = new ArrayList<>(Arrays.asList("USD","ARS","USD", "BOB", "USD", "BRL","USD","CLP","USD","COP"));
        while(true){
            try{
                inicio.opciones();
                int NombreMoneda = Integer.valueOf(lectura.nextLine());
                if(NombreMoneda == 11 ){
                    break;
                } else if (NombreMoneda < 1 || NombreMoneda > 10) {
                    throw new IndexOutOfBoundsException("No use valores fuera de las opciones!!!!") ;
                }
                System.out.println("ingrese a valor que deseas convertir:");
                int valorBase = Integer.valueOf(lectura.nextLine());

                consultaMoneda consulta = new consultaMoneda();
                Moneda moneda = consulta.Consulta(monedasDeInteres.get(NombreMoneda-1));

                Tratamiento busqueda = new Tratamiento();
                Double valor = busqueda.conversionBusqueda(moneda.conversion_rates(),NombreMoneda-1,monedasDeInteres);

                System.out.println("El valor "+valorBase+" ["+monedasDeInteres.get(NombreMoneda-1)+
                        "] corresponde al valor final de =>> "+valorBase*valor +" ["+busqueda.getNombreMonedaACT()+"]");

            }catch (IndexOutOfBoundsException e) {
                System.out.println("No use valores fuera de las opciones!!!!");
            }catch (NumberFormatException e){
                System.out.println("Solo puede ingresar carateres numericos!!!");
            }

        }

    }
}
