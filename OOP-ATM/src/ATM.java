
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap){
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz...");
        
        System.out.println("***********************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("************");
        
        int giris_hakki = 3;
        
        while(true){
            if(login.Login(hesap)){
                System.out.println("Giriş başarılı...");
                break;
                
            }
            else {
                System.out.println("Giriş başarısız...");
                giris_hakki--;
                System.out.println("Kalan giriş hakkı: " + giris_hakki);
                
            }
            if (giris_hakki ==0 ){
                System.out.println("Giriş hakkınız bitti....");
                return;
            }
        }
        
        System.out.println("********************");
        String islemler = "1. Bakiye görüntüleme \n"
                + "2. Para yatırma\n"
                + "3. Para Çekme\n"
                + "Çıkış için q'ya basınız";
        System.out.println(islemler);
        System.out.println("**********************");
        
        while (true) {
        
            System.out.print("Yapmak istediğiniz işlemi giriniz: ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Çıkış yapılıyor...");
                break;
            }
            
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " +hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.ParaYatır(tutar);
            }
            else if(islem.equals("3")){
                System.out.print("Çekmek istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.ParaCekme(tutar);
            }
            else {
                System.out.println("Geçersiz işlem.");
            }
            
        }
        
        
    }

  
    
}
