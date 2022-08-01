import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        a = inp.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        b = inp.nextInt();
        System.out.print("3. Sayıyı Giriniz: ");
        c = inp.nextInt();
        if (a>b && a>c){
            if (b>c){System.out.print("Sıralama: "+c+" < "+b+" < "+a);}
            else if (c>b) {System.out.print("Sıralama: "+b+" < "+c+" < "+a);}
        }
        else if (b>a && b>c){
            if (a>c){System.out.print("Sıralama: "+c+" < "+a+" < "+b);}
            else if (c>a) {System.out.print("Sıralama: "+a+" < "+c+" < "+b);}
        }
        else {
            if (a>b){System.out.print("Sıralama: "+b+" < "+a+" < "+c);}
            else if (b>a) {System.out.print("Sıralama: "+a+" < "+b+" < "+c);}
        }
    }
}