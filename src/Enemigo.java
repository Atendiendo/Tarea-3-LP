import java.util.Scanner;

public class Enemigo extends Zona implements ILevantar{
    private int vida;
    private final int peso;
    private final int ataque;
    private final String descripcion;
    private boolean desc_inicial;

    Enemigo(int vida, int peso, int ataque, boolean desc_inicial, String descripcion){
        super();
        this.vida = vida;
        this.peso = peso;
        this.ataque = ataque;
        this.descripcion = descripcion;
        this.desc_inicial = desc_inicial;

    }

    public void Levantar(Pikinim[] pikinims){
        int capacidad_total = 0;
        for(int i = 0; i<3; i++){
            capacidad_total += (pikinims[i].GetCantidad())*(pikinims[i].GetCapacidad());
        }
        System.out.println("Todos los pikinim se reunen para tratar de levantar el cuerpo del monstruo");
        if (capacidad_total >= peso){
            System.out.println("Lo han logrado!");
            System.out.println("Ingrese el color de pikinim que desea multiplicar");
            System.out.println("1.Cyan 2.Magenta 3.Amarillo");
            Scanner input = new Scanner(System.in);

            int color_pikinim = input.nextInt();

            switch (color_pikinim){
                case 1:
                    pikinims[0].multiplicar(peso);
                    break;
                case 2:
                    pikinims[1].multiplicar(peso);
                    break;
                case 3:
                    pikinims[2].multiplicar(peso);
                    break;
            }
        } else {
            System.out.println("Los pikinim no son lo suficientemente fuertes para levantarlo :c\n");
        }

    }
    public void Interactuar(Pikinim[] pikinims){
        if (GetCompletada()){
            super.Interactuar(pikinims);
        } else {
            if (Pelear(pikinims)){
                System.out.println("En un momento de descuido, la cosa se vuelve realmente intensa.");
                System.out.println("La batalla ha sido feroz, pero finalmente, después de un esfuerzo sobrehumano y con el corazón latiendo a mil por hora,");
                System.out.println("lograron derrotar al enemigo\n");
                Levantar(pikinims);
                SetCompletada(true);
                System.out.println("El campo de batalla está lleno de silencio, solo interrumpido por el susurro del viento y el crujido de las hojas.");
                System.out.println("Te despides con una última mirada a los pikinim caídos antes de continuar con tu aventura,");
                System.out.println("con el peso de la pérdida y la determinación de honrar su memoria.\n");
            } else {
                System.out.println("El enemigo sigue con vida! D:\n");
            }
        }

    }

    public boolean Pelear(Pikinim[] pikinims) {
        if (desc_inicial){
            System.out.println("Te encuentras felizmente cantando: caminando por el bosque con un monstruo me encontre, como no tenia nombre...");
            System.out.println("Cuando de repente te encuentras con un horrible monstruo");
            System.out.println(descripcion + "\n");
            desc_inicial = false;
        }
        if (pikinims[0].GetCantidad() == 0 && pikinims[1].GetCantidad() == 0 && pikinims[2].GetCantidad() == 0){
            System.out.println("No tienes ningun pikinim para atacar ;c");
            return false;
        }


        int ataque_total = 0;
        for(int i = 0; i<3; i++){
            ataque_total += (pikinims[i].GetCantidad())*(pikinims[i].GetAtaque());
        }
        vida -= ataque_total;
        System.out.println("Todos tus pikinim reunen sus fuerzas y atacan al monstruo haciendo : " + ataque_total + " de daño");


        int pikinim_atacado = (int)(Math.random() * 3);
        while (pikinims[pikinim_atacado].GetCantidad() == 0){
            pikinim_atacado = (int)(Math.random() * 3);
        }

        int cantidad_disminuida = pikinims[pikinim_atacado].GetCantidad()-ataque;
        if (cantidad_disminuida<0){
            pikinims[pikinim_atacado].SetCantidad(0);
        } else {
            pikinims[pikinim_atacado].disminuir(ataque);
        }

        switch (pikinim_atacado){
            case 0:
                System.out.println("El monstruo pega un manotazo y arrasa con " + ataque + " pikinim de color Cyan\n");
                break;
            case 1:
                System.out.println("El monstruo logra atrapar a " + ataque + " valientes pikinim de color Magenta\n");
                break;
            case 2:
                System.out.println("El monstruo arremete con fuerza y elimina a " + ataque + " pikinim de color Amarillo\n");
                break;
        }

        return vida <= 0;
    }

    public String toString() {
        if (GetCompletada()){
            return super.toString();
        } else {
            return "Enemigo: vida=" + vida + " peso=" + peso + " ataque=" + ataque;
        }

    }
}
