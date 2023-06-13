
package mertanisorozat;

public class MertaniSorozat {

    public static void main(String[] args) {
        if (args.length < 3){
        System.out.println("Nem megfelelő a bemeneti paraméterek száma!");
        return;
        }
        
        int elsoElem = Integer.parseInt(args[0]);
        int kvociens = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        
        int[]sorozat = new int[n];
        sorozat[0] = elsoElem;
        for (int i = 1; i < n; i++){
        sorozat[i] = sorozat[i-1]* kvociens;
        }
        
        System.out.println("A mértani sorozat első"+ n + "eleme: ");
        for (int elem : sorozat){
            System.out.print(elem + "");
        }
        System.out.println();
    }
    
}
