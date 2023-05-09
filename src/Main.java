import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
           String userName="mehmet";
           String password="123456";

           Scanner input = new Scanner(System.in);

           System.out.print("Kullanici adini giriniz : ");
           String enteredUserName = input.nextLine();

           System.out.print("Sifrenizi giriniz : ");
           String enteredPassword = input.nextLine();

           if(enteredUserName.equals(userName)&&enteredPassword.equals(password)){
               System.out.println("Giris Basarili");
           }else{
               System.out.println("Kullanici adi veya sifre yanlis");

               System.out.println("Sifrenizi sifirlamak ister misiniz? (E/H)");
               String reply = input.nextLine();

               if(reply.equalsIgnoreCase("E")){
                   System.out.println("Lutfen yeni sifre giriniz: ");
                   String newPassword = input.nextLine();


                   if(newPassword.equals(password)){
                       System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz : ");
                   }else{
                       System.out.println("sonuc :" +((newPassword!=password) ? "sifre olusturuldu" : "sifre olusturulamadi") );
                   }
               }
           }
        input.close();
    }
}