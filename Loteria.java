import java.util.Random;
import java.util.ArrayList;

public class Loteria{

    public static void geraNumerosLoteria(){
        //gera n aleatório
        Random gerar = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
		Integer valor;
        //repete até ter os 6 numeros
        while (lista.size() < 6)
        {
             //imprime numero ate 60
            // System.out.println(gerar.nextInt(61));
            valor = gerar.nextInt(61);
            // se o numero nao estiver na lista,ele adiciona 
            if (lista.indexOf(valor) < 0 && valor!=0) {
                lista.add(valor);    
                System.out.println("Numero sorteado: " + valor);
            }
        }   
    }

    public static void main (String[] args){
        
        geraNumerosLoteria();
    }
}