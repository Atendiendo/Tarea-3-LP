public class Zona {
    private boolean completada;

    Zona(){
        completada = false;
    }

    public boolean GetCompletada(){
        return completada;
    }

    public void SetCompletada(boolean completada){
        this.completada = completada;
    }

    public void Interactuar(Pikinim[] pikinims){
        System.out.println("No queda nada que hacer aquí\n");
    }

    public String toString() {
        return "No queda nada por hacer en esta zona";
    }
}
