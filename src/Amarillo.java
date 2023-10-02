public class Amarillo extends Pikinim{
    Amarillo(){
        super();
        SetAtaque(1);
        SetCapacidad(3);
    }
    public void multiplicar(int cantidad){
        int cantidad_pikinim = GetCantidad();
        cantidad_pikinim = (int) Math.ceil(cantidad * 1.5);
        SetCantidad(cantidad_pikinim);
    }
}
