public class Cyan extends Pikinim{
    Cyan(){
        super();
        SetAtaque(1);
        SetCapacidad(1);
    }
    public void multiplicar(int cantidad){
        int cantidad_pikinim = GetCantidad();
        cantidad_pikinim = cantidad * 3;
        SetCantidad(cantidad_pikinim);
    }
}
