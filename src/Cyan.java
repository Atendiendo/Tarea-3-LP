public class Cyan extends Pikinim{
    Cyan(){
        super();
        SetAtaque(1);
        SetCapacidad(1);
    }
    public void multiplicar(int cantidad){
        int cantidad_pikinim = GetCantidad();
        int cantidad_aumentada = cantidad * 3;
        cantidad_pikinim += cantidad_aumentada;
        System.out.println("Los pikinim Cyan han aumentado su cantidad en: " + cantidad_aumentada + "\n");
        SetCantidad(cantidad_pikinim);
    }
}
