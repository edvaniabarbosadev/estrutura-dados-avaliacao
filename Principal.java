public class Principal{
    public static void main(String args[]){
        //
        // Teste do exercício 01
        //
        Arranjo1D a1 = new Arranjo1D(10);

        a1.push(35);
        a1.push(33);
        a1.push(42);
        a1.push(10);
        a1.push(14);
        a1.push(19);
        a1.push(27);
        a1.push(44);
        a1.push(26);
        a1.push(31);
        
        //Hora da verdade... funciona?
        
        a1.paresIntervalados(1); //Imprime: 35-33; 33-42; 42-10; ... 26-31; 31-35
        a1.paresIntervalados(2); //Imprime: 35-42; 33-10; 42-14; ... 26-35; 31-33   
//        a1.paresIntervalados(3);
//        a1.paresIntervalados(4);
        
        // 
        // Teste do exercÃ­cio 02
        //
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        Lista l3 = new Lista();
        
        l1.push(35);
        l1.push(33);
        l1.push(42);
        l1.push(10);
        l1.push(14);
        l1.push(19);
        l1.push(27);
        l1.push(44);
        l1.push(26);
        l1.push(31);
        
        
        l2.push(53);
        l2.push(23);
        l2.push(52);
        l2.push(73);
        l2.push(86);
        l2.push(36);
        l2.push(71);
        l2.push(27);
        l2.push(93);
        l2.push(79);
        
        //Hora da verdade... funciona?
        l3.merge(l1, l2);
        
        l3.show(); // imprime 35-53-33-23-42-52- ... - 26-93-31-79
    }
}
