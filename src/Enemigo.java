import java.util.Scanner;

public class Enemigo extends Zona implements ILevantar{
    private int vida;
    private int peso;
    private int ataque;

    Enemigo(int vida, int peso, int ataque){
        super();
        this.vida = vida;
        this.peso = peso;
        this.ataque = ataque;

    }

    public void Levantar(Pikinim[] pikinims){
        int capacidad_total = 0;
        for(int i = 0; i<3; i++){
            capacidad_total += (pikinims[i].GetCantidad())*(pikinims[i].GetCapacidad());
        }
        if (capacidad_total >= peso){
            //Dejar mensaje
            System.out.println("Ingrese el color de pikinim que desea multiplicar");
            Scanner input = new Scanner(System.in);

            int color_pikinim = input.nextInt();

            switch (color_pikinim){
                case 1:
                    pikinims[0].SetCantidad(pikinims[0].GetCantidad()*peso);
                    break;
                case 2:
                    pikinims[1].SetCantidad(pikinims[1].GetCantidad()*peso);
                    break;
                case 3:
                    pikinims[2].SetCantidad(pikinims[2].GetCantidad()*peso);
                    break;
            }
        }

    }
    public void Interactuar(Pikinim[] pikinims){
        if (Pelear(pikinims)){
            System.out.println("Has logrado derrotar al enemigo!");
            Levantar(pikinims);
            SetCompletada(true);
        }
    }
    public boolean Pelear(Pikinim[] pikinims){
        int ataque_total = 0;
        for(int i = 0; i<3; i++){
            ataque_total += (pikinims[i].GetCantidad())*(pikinims[i].GetAtaque());
        }
        vida -= ataque_total;

        int pikinim_atacado = (int)(Math.random() * 3);
        System.out.println(pikinim_atacado);
        int cantidad_disminuida = pikinims[pikinim_atacado].GetCantidad()-ataque;
        if (cantidad_disminuida<0) cantidad_disminuida = 0;
        pikinims[pikinim_atacado].SetCantidad(cantidad_disminuida);

        return vida <= 0;
    }
}
