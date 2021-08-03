/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsol5;

/**
 *
 * @author MOKLET-1
 */
public class Latsol5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][]={{-5,3},{7,2}};
        int b[][]={{3,1},{5,-2}};
        System.out.println("Hasil A-B");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(a[i][j]-b[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
