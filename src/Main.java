import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;

        Scanner inp= new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz :");
        userName=inp.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password=inp.nextLine();

        if (userName.equals("mstkyc")&&password.equals("123456")){
            System.out.print("Giriş Yaptınız ");
        }else {
            System.out.print("Yanlış Giriş yaptınız ");
        }

    }
}