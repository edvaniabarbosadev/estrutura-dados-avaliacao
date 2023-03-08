public class Lista{
    private Node inicio;
    private Node fim;
    
    public Lista(){
        inicio = fim = null;
    }
    
    public void push(int valor){
        Node novoFim = new Node(valor);
        if(inicio==null){
            inicio = fim = novoFim;   
        }
        else{
            fim.setProx(novoFim);
            fim = novoFim; 
        }
    }
    
    public void show(){
        Node aux = inicio;
        
        while (aux!=null){
         System.out.println(aux.getX());
         aux = aux.getProx();
        }
    }
    
    public int length(){
        Node aux = inicio;
        int c=0;
        
        while (aux!=null){
         c++;
         aux = aux.getProx();
        }
        
        return c;
    }
    
    public int somatoria(){
        Node aux = inicio;
        int s=0;
        
        while (aux!=null){
         s = s+aux.getX();
         aux = aux.getProx();
        }
        
        return s;
    }
    
    public float media(){
        if(inicio!=null){
            return somatoria()/length();
        }
        else{
            return 0;
        }
    }
    
    public void pushInicio(int valor){
        Node novoInicio = new Node(valor);
        if(inicio==null){
            inicio = fim = novoInicio;   
        }
        else{
            novoInicio.setProx(inicio);
            inicio = novoInicio; 
        }
    }
    
    public void pushFim(int valor){
        this.push(valor);
    }
    
    
    public int popInicio(){
        int ret = -99999;
        
        if(inicio!=null){
            ret = inicio.getX();
            inicio = inicio.getProx(); // aponta para o segundo node
            if(inicio==null){
                fim = null;
            }
        }
        else{
            System.out.println("[popInicio] Erro remocao lista vazia");
        }
        
        return ret;
    }
    
    public int popFim(){
        int ret = -99999;
        
        if(inicio!=null){
            Node pnt = inicio;
            ret = fim.getX();
            if(inicio!=fim){  // se tem + de um node
                while(pnt.getProx() != fim){
                    pnt = pnt.getProx();
                }
                fim = pnt;
                fim.setProx(null);
            }
            else{ // se tem apenas um node
                inicio = fim = null;
            }
        }
        else{
            System.out.println("[popFim] Erro remocao lista vazia");
        }              
        return ret;
    }
    
    public boolean isEmpty(){
        if(inicio!=null){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void showMinCresc(int q){
        // teste para verificar se a lista não está vazia
        if(inicio!=null){
            // começo criando um vetor que tem tamanho igual a quantidade de Node da Lista
            int c[] = new int[this.length()];
        
            //agora faço um loop para copiar os valores da lista encadeada para o vetor
            Node aux = inicio;
            for(int i=0; i<c.length; i++){
                c[i] = aux.getX();
                aux = aux.getProx();
            }
            
            // ordenando c pelo metodo da ordenacao por insercao
            int menor, posmenor,temp;
            for(int i=0; i<c.length-1; i++){
                menor = c[i];
                posmenor = i;
                for(int j=i+1; j<c.length; j++){
                    if(menor>c[j]){ 
                        posmenor=j;
                        menor = c[j];
                    }
                }
                if(posmenor!=i){
                    temp = c[i];
                    c[i] = c[posmenor];
                    c[posmenor] = temp;
                }                
            }
            
            // imprimindo os q menores valores da lista
            for(int i=0; i<q; i++){
                System.out.print(c[i] + "  ");
            }
            System.out.println();
        }
        else{
            System.out.println("[showMinCresc] - Lista vazia");
        }
    }
    
    void merge(Lista l1, Lista l2){
        String intercalados = "";
        
        boolean troca = true;
        Node auxL1 = l1.inicio;
    	Node auxL2 = l2.inicio;
        while(auxL2 != null) {
        	if(troca) {
        		intercalados += auxL1.getX() + ", ";
        		auxL1 = auxL1.getProx();
        	} else {
        		intercalados += auxL2.getX() + ", ";
        		auxL2 = auxL2.getProx();
        	}
        	troca = !troca;
        }
        System.out.println(intercalados);
    }
}
