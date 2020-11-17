package modulo8;

public class SumarArgumentos {
    
    public static void main(String[] args) {
        
        //args   1 3 45 
        int total = 0;
        for(String s : args){
           int n =  Integer.parseInt(s);
           total += n;
        }
        System.out.println("Total es " + total);
    }
    
}
