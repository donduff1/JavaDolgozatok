
package arraysum;

public class ArraySum {

    public static void main(String[] args) {
       if(args.length <2){
       System.out.println("Nem elég adat!");
       return;
       }
       int lepeskoz = Integer.parseInt(args[0]);
       
       int[] tomb = new int[args.length - 1];
       for (int i =1; i < args.length; i++){
       tomb[i-1] = Integer.parseInt(args[i]);
       }
       
       int osszeg = szamokOsszeadasa(tomb, lepeskoz);
       System.out.println("Az összeg: " + osszeg);
    }
       public static int szamokOsszeadasa(int[] tomb, int lepeskoz){
               int osszeg = 0;
               for(int i = 0; i < tomb.length; i += lepeskoz){
                osszeg += tomb[i];
       }
        return osszeg;
}
}      
    
    

