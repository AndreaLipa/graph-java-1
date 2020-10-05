package data.structure;

public class Queue {
    private int maxtam = 100;
    private int frente;
    private int fin;
    private Object cola[];

    public Queue(){
        frente = 0;
        fin = -1;
        cola = new Object[maxtam];
    }

    public boolean colaLlena(){
        if(fin == maxtam - 1){
            return true;
        }else{
            return false;
        }
    }

    public void insertar(Object dato){
        if(!colaLlena()){
            fin++;
            cola[fin] = dato;
        }else{
            System.out.println("No se puede insertar, Cola llena!");
        }
    }

    public Object frente(){
        return cola[frente];
    }

    public boolean colaVacia(){
        if(fin == -1 || frente > fin){
            return true;
        }else{
            return false;
        }
    }

    public Object quitar(){
        Object aux = null;
        if(!colaVacia()){
            aux = cola[frente];
            frente++;
        }else{
            System.out.println("No se puede extraer, Cola vacia");
        }
        return aux;
    }

    public void mostrar(){
        System.out.println("Cola Actual: ");
        for(int i = frente; i <= fin; i++){
            System.out.println(cola[i]+"\t");
        }
    }
}
