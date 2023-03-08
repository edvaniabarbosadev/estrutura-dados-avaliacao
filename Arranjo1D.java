public class Arranjo1D{
    private int x[];
    private int fim;
    
    public Arranjo1D(int n){
        x = new int[n];
        fim = -1;
    }
    
    public void push(int valor){
        if(fim < x.length){
            fim++;
            x[fim] = valor;
        }
        else{
            System.out.println("[push] Arranjo Cheio");
        }
    }
    
    public int somaMax(int q){
        int s=0;
        // fazendo uma copia do arranjo x
        int c[] = x.clone();
        
        // ordenando c pelo metodo da ordenacao por insercao
        int maior, posmaior, aux;
        for(int i=0; i<c.length-1; i++){
            maior = c[i];
            posmaior = i;
            for(int j=i+1; j<c.length; j++){
                if(maior<c[j]){ 
                    posmaior=j;
                    maior = c[j];
                }
            }
            if(posmaior!=i){
                aux = c[i];
                c[i] = c[posmaior];
                c[posmaior] = aux;
            }                
        }
        // [debug] imprimindo o arranjo c
        // for(int i=0; i<c.length; i++){            
            // System.out.print(c[i] + " ");            
        // }
        // System.out.println();
        
        // somando os q maiores valores do arranjo
        for(int i=0; i<q; i++){
            s = s + c[i];
        }
        
        return s;
    }
    
    public void show(){
        for(int i=0; i<x.length; i++){            
            System.out.print(x[i] + " ");            
        }
        System.out.println();
    }
    
    public void paresIntervalados(int intervalo){
    	String pares = "";
    	
    	for(int i = 0; i < x.length; i++) {
    		if(i + intervalo >= x.length) {
    			pares += x[i] + " - " + x[( i + intervalo) - (x.length) ] + "; ";
    		} else {
    			pares += x[i] + " - " +  x[i + intervalo] + "; ";
    		}
    	}
    	System.out.println(pares);
    }
}
