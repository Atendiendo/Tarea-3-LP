import java.util.Scanner;

public class Pildora extends Zona{
    private int cantidad;

    Pildora(int cantidad){
        super();
        this.cantidad = cantidad;
    }
    public void Interactuar(Pikinim[] pikinims){
        System.out.println("Ingrese el color de pikinim que desea multiplicar");
        Scanner input = new Scanner(System.in);

        int color_pikinim = input.nextInt();

        switch (color_pikinim){
            case 1:
                pikinims[0].multiplicar(pikinims[0].GetCantidad());
                break;
            case 2:
                pikinims[1].multiplicar(pikinims[1].GetCantidad());
                break;
            case 3:
                pikinims[2].multiplicar(pikinims[2].GetCantidad());
                break;
        }
        SetCompletada(true);

    }
}
