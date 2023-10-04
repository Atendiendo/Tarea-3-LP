public class Magenta extends Pikinim{
    Magenta(){
        super();
        SetAtaque(2);
        SetCapacidad(1);
    }
    public void multiplicar(int cantidad){
        int cantidad_pikinim = GetCantidad();
        int ataque_pikinim = GetAtaque();
        int cantidad_aumentada = cantidad * ataque_pikinim;
        cantidad_pikinim += cantidad_aumentada;
        System.out.println("Los pikinim Magenta han aumentado su cantidad en: " + cantidad_aumentada + "\n");
        SetCantidad(cantidad_pikinim);
    }
}
