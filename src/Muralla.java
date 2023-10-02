import java.util.Scanner;

public class Muralla extends Zona{
    private int vida;

    Muralla(int vida){
        super();
        this.vida = vida;
    }

    public boolean TryRomper(Pikinim[] pikinims){
        int ataque_total = 0;
        for(int i = 0; i<3; i++){
            ataque_total += (pikinims[i].GetCantidad())*(pikinims[i].GetAtaque());
        }
        vida -= ataque_total;
        if (vida <=0){
            return true;
        }else {
            return false;
        }
    }

    public void Interactuar(Pikinim[] pikinims){
        //Tirar true si se logro romper
        if (TryRomper(pikinims)){
            SetCompletada(true);
        }
    }

}
