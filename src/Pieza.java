public class Pieza extends Zona implements ILevantar{
    private int peso;

    Pieza(int peso){
        super();
        this.peso = peso;
    }

    public void Levantar(Pikinim[] pikinims){
        System.out.println("Acabas de encontrar una pieza!!");
        int capacidad_total = 0;
        for(int i = 0; i<3; i++){
            capacidad_total += (pikinims[i].GetCantidad())*(pikinims[i].GetCapacidad());
        }
        if (capacidad_total >= peso){
            //Dejar mensaje
            System.out.println("Los pikinim han logrado levantar la pieza!");
            SetCompletada(true);
        } else {
            System.out.println("Los pikinim no han logrado leventar la pieza u.u");
        }

    }
    public void Interactuar(Pikinim[] pikinims){
        if (GetCompletada()){
            super.Interactuar(pikinims);
        }else {
            Levantar(pikinims);
        }

    }
}
