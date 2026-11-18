  import java.util.Scanner;
 public class SayiAnalizSistemi {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int sayi;
     int toplam=0;
    int pozitif=0;
   int negatif=0;
   int tek =0;
   int cift=0;
   int asalsay=0;
   
   int enbuyuk=0;
   int enkucuk=0;
   int pozsay=0;
   int sayac=0;
   
   
   boolean ilksayi = true;
        
        while (true) {            
            System.out.println("Sayi giriniz:  ");
            System.out.println("eger 0 girer isen souc ekranina yonlendirilirsin");
            sayi=sc.nextInt();
            
            
            if (sayi==0){
                System.out.println("Program kapatiliyor...");
                break;
            }
            
            sayac++;
            toplam += sayi;
            
            if (ilksayi) {
                enbuyuk=sayi;
                enkucuk=sayi;
                ilksayi=false;
                
             
                
                
            }else{
                if (sayi>enbuyuk){
                    enbuyuk=sayi;
                    
                }
                if (sayi<enkucuk) {
                    enkucuk=sayi;
                    
                    
                }
                
                    
                    
            }
            if (sayi>0) {
                pozitif++;
                pozsay+=sayi;
                
            }else{
                negatif++;
                
            }
            if (sayi % 2==0) {
                cift++;
                
                
            }else{
                tek++;
                
            }
            boolean asal = true;
    
    if (sayi <=  1) {
    
     asal=false;
     
    }
    else if (sayi==2){
        asal=true;
     
             
             
             
             
             
    }else{
        for (int i = 2; i <= Math.sqrt(sayi); i++) 
            if (sayi % i ==0) {
            asal = false;
            break;
        }
    }
        
 if (asal) {
            asalsay++;
            
        }
        
        int bolentop=0;
        
        if (sayi>0){
            for (int i = 1; i < sayi; i++) {
                if (sayi % i==0) {
                    bolentop+=i;
                    
                }
                
            }
            boolean muksay =
                    (sayi>0 && bolentop==sayi);
            
            System.out.println("Asal mi " + asal);
            System.out.println("Mukemmel mi " + muksay);
            
            
            int bassay =0;
        
          if (sayi<0) {
              System.out.println("negatif bir sayi girdin HATA!!!!");
          }
          else if  (sayi==0){
             System.out.println("HATA !!! 0 girdin");
         }else {
              
         
            while ( sayi>0){
                sayi=sayi/10;
                bassay++;
                
            }
                  
              }
              System.out.println("girdigin sayinin basamak sayisi :" + bassay);
          }
    }
            //sonuc ekranı 
            
            System.out.println("---SONUC EKRANI---");
            
            if (sayac==0) {
                System.out.println("Henuz islem yapmadin");
            
        }else{
                System.out.println("girilen sayı adeti: " + sayac);
                System.out.println("girilen pozitif sayi adati: " + pozitif);
                System.out.println("girilen negatif sayi adati: " + negatif);
                System.out.println("tek sayi adeti: " + tek);
                System.out.println("cift sayi adeti: " + cift);
                
                System.out.println("en buyuk sayi: " + enbuyuk);
                System.out.println("en kucuk sayi: " + enkucuk);
                
                System.out.println("sayilarin toplami: " + toplam);
                
                double ort = (double) toplam/sayac;
                System.out.println("Sayilarin ortalamarı: " + ort);
                
                
                int fark = enbuyuk-enkucuk;
                System.out.println("en buyuk sayi ile en kucuk sayinin farki: " + fark);
                
                
                if (pozitif>0) {
                    double pozort=
                            (double) pozsay/pozitif;
                    
                    System.out.println("pozitif ortalama: " + pozort);
                    
                }else {
                    System.out.println("pozitif sayi girilmedi bu yuzden ortalama hesaplanamaz");
                }
                System.out.println("Asal sayi adeti: " + asalsay);
            }
        }
             
                
            
        
        
    }

        


    