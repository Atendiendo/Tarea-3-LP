abstract public class Pikinim {
    private int ataque;
    private int capacidad;
    private int cantidad;
    Pikinim(){
        cantidad = 10;
    }

    public void SetCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public int GetCantidad(){
        return cantidad;
    }
    public void SetAtaque(int ataque){
        this.ataque = ataque;
    }
    public int GetAtaque(){
        return ataque;
    }
    public void SetCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    public int GetCapacidad(){
        return capacidad;
    }




    public void disminuir(int cantidad){
        this.cantidad -= cantidad;

    }
    abstract public void multiplicar(int cantidad);
}
