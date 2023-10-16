import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Soru1
        System.out.println(Math.abs(-2147483648));
        /*Math.abs fonksiyonu girilen değerin mutlak değerini alır fakat bu parametrenin alabileceği en küçük sayı değeri -2147483648 en büyük sayı değeri ise 2147483647 dir.Yani bu sayının
        pozitif değerini yazdıramaz ve aynı çıktıyı verir.Java'da Math.abs() fonksiyonu int türündeki en küçük değeri işleyemediği için bu durum gerçekleşir*/

        //Soru 2

        /*Kütüphaneler, hazır halde fonksiyonlar ve modüller bulundurur.Böylece yazılımcı bunları kolaylıkla kullanabilir.Ayrıca kütüphaneler test edildiği için güvenirliği ve performansı artırır.

        API uygulama programlama arayüzüdür ve yazılımlar arasında veri ve işlevsellik paylaşımını sağlar.Farklı sistemlerin birbiriyle entegre edilmesini sağlar.Kod tekrarını azaltır.

        Maven projelerin derlenmesi,test edilmesi,dağıtılması süreçlerini otomatik gerçekleştirmek için kullanılan yönetim aracıdır.Proje dosyalarını yapılandırmamızı,düzenlememizi sağlar.
        Büyük projeleri modüllere bölmeye ve ayrı ayrı yönetmemize imkan sağlar.
         */

        //Soru 3
        //Debug mod satır satır hata ayıklamamıza ve düzeltmemize yarar
        for (int i = 0; i <= 9; i++) {
            System.out.println("Merhaba");
        }
        //Soru5
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üç sayi giriniz:");
        int sayi8 = scanner.nextInt();
        int sayi9 = scanner.nextInt();
        int sayi10 = scanner.nextInt();

        if (sayi8 < sayi9 && sayi9 < sayi10) {
            System.out.println(sayi8 + " < " + sayi9 + " < " + sayi10);
        } else if (sayi8 == sayi9 && sayi9 < sayi10) {
            System.out.println(sayi8 + " = " + sayi9 + " < " + sayi10);
        } else if (sayi9 < sayi8 && sayi8 < sayi10) {
            System.out.println(sayi9 + " < " + sayi8 + " < " + sayi10);
        } else if (sayi9 == sayi8 && sayi8 < sayi10) {
            System.out.println(sayi9 + " = " + sayi8 + " < " + sayi10);
        } else if (sayi10 < sayi9 && sayi9 < sayi8) {
            System.out.println(sayi10 + " < " + sayi9 + " < " + sayi8);
        } else if (sayi10 == sayi9 && sayi9 < sayi8) {
            System.out.println(sayi10 + " = " + sayi9 + " < " + sayi8);
        } else if (sayi8 == sayi9 && sayi9 == sayi10) {
            System.out.println(sayi8 + " = " + sayi9 + " = " + sayi10);
        }else {
            System.out.println("Başka bir durum söz konusu.");
        }



        //Soru 6
        int sayi1 = 5;
        int sayi2 = 10;
        int sayi3 = 7;

        int ortancaSayi = ortancaBul(sayi1, sayi2, sayi3);
        System.out.println("Ortanca Sayı: " + ortancaSayi);

        //Soru 7
        int sayi4 = -8;
        System.out.println(signum(sayi4));
        //Soru8
        scanner.nextInt();
        System.out.print("Bir n sayısı giriniz: ");
        int n = scanner.nextInt();

        // Yıldızları artırarak üst kısmı oluştur
        for (int i = 1; i <= n; i++) {

            for (int k = 1;k<=n-i;k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Yıldızları azaltarak alt kısmı oluştur
        for (int i = n - 1; i >= 1; i--) {
            for (int k = n - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        scanner.close();

        //Soru 9
        long saniye = 7589;
        displayDuration(saniye);
        //Soru10
        int asalMi=12;
        boolean isPrime = true;
        if(asalMi<2){
            System.out.println("Geçersiz sayi");
            return;
        }
        if(asalMi== 1){
            System.out.println("Sayi asal degildir");
            return;
        }

        for (int i = 2; i < asalMi; i++) {//2 ve 1 icin girmez bu döngüye bug var yani
            if (asalMi % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {   //if(isPrime == true) ile ayni sey
            System.out.println("Sayi asaldir");

        }else {
            System.out.println("Sayi asal degildir");
        }
        //Soru12
        


    }


    //Soru 6'nın fonksiyonu
    public static int ortancaBul(int sayi1, int sayi2, int sayi3) {
        if ((sayi1 >= sayi2 && sayi1 <= sayi3) || (sayi1 <= sayi2 && sayi1 >= sayi3)) {
            return sayi1;
        } else if ((sayi2 >= sayi1 && sayi2 <= sayi3) || (sayi2 <= sayi1 && sayi2 >= sayi3)) {
            return sayi2;
        } else {
            return sayi3;
        }
    }
    //Soru 7 nin fonksiyonu
    public static int signum(int sayi) {
        if (sayi > 0) {
            return 1;
        } else if (sayi < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    //Soru 9 un fonksiyonu
    public static void displayDuration(long seconds) {
        long hours = seconds / 3600;
        long remainingSeconds = seconds % 3600;
        long minutes = remainingSeconds / 60;
        long remainingSecondsFinal = remainingSeconds % 60;

        if (hours > 0) {
            System.out.print(hours + " saat ");
        }
        if (minutes > 0) {
            System.out.print(minutes + " dakika  ");
        }
        if (remainingSecondsFinal > 0) {
            System.out.println(remainingSecondsFinal + " saniye");
        }

}}