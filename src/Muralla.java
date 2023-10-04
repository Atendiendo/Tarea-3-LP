public class Muralla extends Zona{
    private int vida;

    Muralla(int vida){
        super();
        this.vida = vida;
    }

    public boolean TryRomper(Pikinim[] pikinims){
        System.out.println("Te encuentras con una muralla, la cual te impide el paso");
        System.out.println("Reunes a todos tus pikinim y gritas: A LA CARGA!");
        int ataque_total = 0;
        for(int i = 0; i<3; i++){
            ataque_total += (pikinims[i].GetCantidad())*(pikinims[i].GetAtaque());
        }
        vida -= ataque_total;
        System.out.println("Tus pikinim logran hacer " + ataque_total + " de daño\n");
        if (vida <=0){
            System.out.println("Con un estruendo ensordecedor, los valientes pikinim logran derribar la muralla, permitiéndote así proseguir con tu aventura.\n");
            return true;
        }else {
            System.out.println("Lamentablemente la muralla parece ser mas fuerte de lo que esperabas");
            System.out.println("y los pikinim no logran romperla\n");
            return false;
        }
    }

    public void Interactuar(Pikinim[] pikinims){
        if (GetCompletada()){
            super.Interactuar(pikinims);
        } else if (TryRomper(pikinims)){
            SetCompletada(true);
        }
    }

    public String toString() {
        if (GetCompletada()){
            return super.toString();
        } else {
            return "Muralla: Vida=" + vida;
        }

    }
}
