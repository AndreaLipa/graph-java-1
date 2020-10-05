package data.structure;

public class Stack {
    private int tampila = 100;
    private int cima;
    private Object pilaArray[];

    public Stack(){
        this.cima = -1;
        this.pilaArray = new Object[tampila];
    }

    public boolean pilaLlena(){
        if(this.cima == tampila - 1){
            return true;
        }else{
            return false;
        }
    }

    public void insertar(Object dato){
        if(pilaLlena()){
            System.out.println("No se puede insertar, pila llena");
        }else{
            this.cima++;
            pilaArray[cima] = dato;
        }
    }

    public boolean pilaVacia(){
        if(this.cima == -1){
            return true;
        }else{
            return false;
        }
    }

    public Object cimaPila(){
        if(!pilaVacia()){
            return pilaArray[cima];
        }else{
            System.out.println("La pila esta vacia");
            return null;
        }
    }

    public Object quitar(){
        Object aux = null;
        if(pilaVacia()){
            System.out.println("No se puede extraer, la pila esta vacia");
        }else{
            aux = pilaArray[cima];
            System.out.println("Se ha extraido el dato: "+aux);
            cima--;
        }
        return aux;
    }

    public void limpiar(){
        this.cima = -1;
    }

    public void mostrar(){
        if(!pilaVacia()){
            for(int i = cima; i >= 0; i--){
                System.out.print("|"+pilaArray[i]+"|");
            }
        }else{
            System.out.println("No hay elementos");
        }
    }
}
