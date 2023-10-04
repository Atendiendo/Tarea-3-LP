public class Amarillo extends Pikinim{
    Amarillo(){
        super();
        SetAtaque(1);
        SetCapacidad(3);
    }
    public void multiplicar(int cantidad){
        int cantidad_pikinim = GetCantidad();
        int cantidad_aumentada = (int) Math.ceil(cantidad * 1.5);
        cantidad_pikinim += cantidad_aumentada;
        System.out.println("Los pikinim Amarillo han aumentado su cantidad en: " + cantidad_aumentada + "\n");
        SetCantidad(cantidad_pikinim);

    }
}
