public class Magenta extends Pikinim{
    Magenta(){
        super();
        SetAtaque(2);
        SetCapacidad(1);
    }
    public void multiplicar(int cantidad){
        int cantidad_pikinim = GetCantidad();
        int ataque_pikinim = GetAtaque();
        cantidad_pikinim = cantidad * ataque_pikinim;
        SetCantidad(cantidad_pikinim);
    }
}
