/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instrukcjewarunkowe;

public class InstrukcjeWarunkowe {

    public static void main(String[] args) {
        int a=5, b=7;
        
        if(a > b)
            System.out.println("a > b");
        else if(a < b)
            System.out.println("a < b");
        else
            System.out.println("a == b");
        
        
        switch(a)
        {
            case 50:
                System.out.println("A jest równe 50");
                break;
            case 100:
                System.out.println("A jest równe 100");
                break;
            default:
                System.out.println("A nie jest równe 50 ani 100, jest równe = " + a);
        }
        
        //Wyrażenie warunkowe > wyrażenie ? co jeśli true : co jeśli false
        
        int x = 3;
        
        String czyParzysta = x % 2 == 0 ? "parzysta" : "nieparzysta";
        
        System.out.println(czyParzysta);
                
    }
    
}
