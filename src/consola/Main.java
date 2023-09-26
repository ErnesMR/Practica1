package consola;

import consola.Consola;
import consola.Mandos;

public class Main {
    public static void main(String[] args) {
        Consola nintendo = new Consola();

        Mandos joycon = new Mandos();


        System.out.println(nintendo.refresco());
        System.out.println(nintendo.duracion());
        System.out.println(nintendo.jugabilidad());
        System.out.println(nintendo.produccion());
        System.out.println(nintendo.ventas());

        System.out.println(joycon.refresco());
        System.out.println(joycon.jugabilidad());

    }
}