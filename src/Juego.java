import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Pikinim[] pikinims;
        pikinims = new Pikinim[3];

        pikinims[0] = new Cyan();
        pikinims[1] = new Magenta();
        pikinims[2] = new Amarillo();

        Zona[] mapa;
        mapa = new Zona[11];
        //Crear cada zona por separado
        mapa[0] = new Pieza(50);
        mapa[1] = new Enemigo(130,20,25);
        mapa[2] = new Enemigo(50,10,15);
        mapa[3] = new Pildora(25);
        mapa[4] = new Muralla(50);
        mapa[5] = new Pieza(100);
        mapa[6] = new Enemigo(45,8,10);
        mapa[7] = new Pieza(35);
        mapa[8] = new Pildora(15);
        mapa[9] = new Enemigo(75,15,20);
        mapa[10] = new Muralla(150);

        String[] nombre_zonas;
        nombre_zonas = new String[11];
        nombre_zonas[0] = "Pieza";
        nombre_zonas[1] = "Enemigo";
        nombre_zonas[2] = "Enemigo";
        nombre_zonas[3] = "Pildora";
        nombre_zonas[4] = "Muralla";
        nombre_zonas[5] = "Pieza";
        nombre_zonas[6] = "Enemigo";
        nombre_zonas[7] = "Pieza";
        nombre_zonas[8] = "Pildora";
        nombre_zonas[9] = "Enemigo";
        nombre_zonas[10] = "Muralla";

        //Inicio juego
        System.out.println("!Bienvenido a 'Mal Aterrizaje'¡");
        System.out.println("Te despiertas solo en un planeta extraño");
        System.out.println("Lo ultimo que recuerdas es que estabas haciendo un viaje de rutina y de pronto todo se volvio negro...");
        System.out.println("Estas dentro de tu nave, la cual esta destrozada y inmediatamente te pones el tanque de oxigeno.");
        System.out.println("Afuera ves unas extrañas criaturas de diferentes colores");
        System.out.println("Estas son pequeñas y lo unico que repiten es 'pikinim' en una voz aguda");
        System.out.println("Decides salir de tu nave y acercarte a ellas, estas parecen inofensivas");
        System.out.println("Te dices a ti mismo: Quizas me pueden ayudar a encontrar las piezas para reparar mi nave");
        System.out.println("Sin embargo debes ser rapido, antes de que se te acabe el tanque de oxigeno");


        int turno = 1, turnos_totales = 30, PosJugador = 5;
        boolean PiezasEncontradas = false;

        while((turno <= turnos_totales) && !PiezasEncontradas){
            System.out.println("Turno " + turno + "(Cyan - " + pikinims[0].GetCantidad() + ", Amarillo - " + pikinims[1].GetCantidad() + ", Magenta - " + pikinims[2].GetCantidad() + ")");


            if (mapa[PosJugador] instanceof Enemigo){
                System.out.println("Actualmente te encuentra en: " + nombre_zonas[PosJugador]);

            } else if (mapa[PosJugador] instanceof Pieza){
                System.out.println("Actualmente te encuentra en: " + nombre_zonas[PosJugador]);

            } else if (mapa[PosJugador] instanceof Pildora){
                System.out.println("Actualmente te encuentra en: " + nombre_zonas[PosJugador]);
                
            } else if (mapa[PosJugador] instanceof Muralla){
                System.out.println("Actualmente te encuentra en: " + nombre_zonas[PosJugador]);

            }

            System.out.println("Tienes 3 opciones:");
            if(PosJugador == 10){
                System.out.println("1. Ir a la derecha(" + nombre_zonas[0] + ") 2. Ir a la izquierda(" + nombre_zonas[PosJugador-1] + ") 3. Quedarse aqui");
            } else if (PosJugador == 0){
                System.out.println("1. Ir a la derecha(" + nombre_zonas[PosJugador+1] + ") 2. Ir a la izquierda(" + nombre_zonas[10] + ") 3. Quedarse aqui");
            } else {
                System.out.println("1. Ir a la derecha(" + nombre_zonas[PosJugador+1] + ") 2. Ir a la izquierda(" + nombre_zonas[PosJugador-1] + ") 3. Quedarse aqui");
            }
            Scanner input = new Scanner(System.in);

            int opcion = input.nextInt();
            switch (opcion){
                case 1:
                    PosJugador += 1;
                    if (PosJugador == 11){
                        PosJugador = 0;
                    }
                    break;
                case 2:
                    PosJugador -= 1;
                    if (PosJugador == -1){
                        PosJugador = 10;
                    }
                    break;
                case 3:
                    break;
            }


            mapa[PosJugador].Interactuar(pikinims);

            if (mapa[0].GetCompletada() && mapa[5].GetCompletada() && mapa[7].GetCompletada()){
                PiezasEncontradas = true;
                System.out.println("OMG encontraste todas las piezas!!!!!!!!");
            }


            turno += 1;
        }
    }
}