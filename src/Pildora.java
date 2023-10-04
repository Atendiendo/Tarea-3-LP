import java.util.Scanner;

public class Pildora extends Zona{
    private final int cantidad;

    Pildora(int cantidad){
        super();
        this.cantidad = cantidad;
    }
    public void Interactuar(Pikinim[] pikinims){
        if (GetCompletada()){
            super.Interactuar(pikinims);
        }else {
            System.out.println("De repente te encuentras con unas pequeñas pildoras en el suelo");
            System.out.println("Decides darselas a tus pikinim because why not");
            System.out.println("Ingrese el color de pikinim que desea multiplicar");
            System.out.println("1.Cyan 2.Magenta 3.Amarillo");
            Scanner input = new Scanner(System.in);

            int color_pikinim = input.nextInt();

            switch (color_pikinim){
                case 1:
                    pikinims[0].multiplicar(cantidad);
                    break;
                case 2:
                    pikinims[1].multiplicar(cantidad);
                    break;
                case 3:
                    pikinims[2].multiplicar(cantidad);
                    break;
            }
            SetCompletada(true);
        }


    }

    public String toString() {
        if (GetCompletada()){
            return super.toString();
        } else {
            return "Pildora: cantidad=" + cantidad;
        }

    }
}
