
package cin_zodyagi;

import java.util.Scanner;

public class Cin_Zodyagi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz");
        int year = scanner.nextInt();
        
        String deger = "Cin Zodyagı Burcunuz: ";
        int result = year %12;
        switch(result){
            
            case 0 -> System.out.println(deger + "Maymun");
            case 1 -> System.out.println(deger + "Horoz");
            case 2 -> System.out.println(deger + "Kopek");
            case 3 -> System.out.println(deger + "Domuz");
            case 4 -> System.out.println(deger + "Fare");
            case 5 -> System.out.println(deger + "Okuz");
            case 6 -> System.out.println(deger + "Kaplan");
            case 7 -> System.out.println(deger + "Tavsan");
            case 8 -> System.out.println(deger + "Ejderya");
            case 9 -> System.out.println(deger + "Yilan");
            case 10 -> System.out.println(deger + "At");
            case 11 -> System.out.println(deger + "Koyun");
        }
           
    }
    
}
