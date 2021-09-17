import java.util.Scanner;

public class manavkasaprogrami {
public static void main(String[] args) {
    // değişkenleri tanımlayalım
    double armut,elma,domates,muz,patlican,sonuc,kgarmut,kgelma,kgdomates,kgmuz,kgpatlican;

    // import sınıfını tanımlayalım
    Scanner input = new Scanner(System.in);

    // kullanıcından input alalım
    System.out.println("Kaç kg armut ?");
    kgarmut = input.nextDouble();
    
    System.out.println("Kaç kg elma ?");
    kgelma = input.nextDouble();
    
    System.out.println("Kaç kg patlıcan ?");
    kgpatlican = input.nextDouble();
    
    System.out.println("Kaç kg domates ?");
    kgdomates = input.nextDouble();
    
    System.out.println("Kaç kg muz ?");
    kgmuz = input.nextDouble();

    // hesabı yapalım
    armut = kgarmut*2.14;
    elma = kgelma*3.67;
    domates = kgdomates*1.11;
    muz = kgmuz*0.95;
    patlican = kgpatlican*5;
    sonuc = armut + elma + domates + muz + patlican;

    System.out.println("ödeyeceğiniz fiyat " + sonuc);
}
}