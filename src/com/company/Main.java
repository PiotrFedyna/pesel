package com.company;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        LinkedList m = new LinkedList();
        Random gen = new Random();
        int[] pesel = new int[11];
        int a, b, c, d, e, z, k;
        Scanner p = new Scanner(System.in);


        System.out.println("Podaj rok urodzenia ");

        a = p.nextInt();
        a = a - 2000;
        pesel[0] = a / 10;
        pesel[1] = a % 10;


        System.out.println("podaj miesiąc urodzenia ");


        b = p.nextInt();
        pesel[2] = b / 10 + 2;
        pesel[3] = b % 10;





        System.out.println("podj dzień urodzenia ");
        c = p.nextInt();

        pesel[4] = c / 10;
        pesel[5] = c % 10;


        System.out.println("data urodzin jest niepoprawna ");


        for (int i = 6; i < 9; i++) {
            pesel[i] = gen.nextInt(10);
        }

        System.out.println("Wybierz płeć  ");
        System.out.println("1 Kobieta  \n 2 Mężczyzna ");

        d=p.nextInt();
switch (d)
{
case 1-> {
    do {
        e=gen.nextInt(10);

    }

    while (e%2==1);
pesel[10]=e;

}
case 2->
        {
          do
          {
              z=gen.nextInt(10);
          }
          while (z%2==0);
            pesel[10]=z;
        }

}
        k=pesel[0]*1+pesel[1]*3+pesel[2]*7+pesel[3]*9+pesel[4]*1+pesel[5]*3+pesel[6]*7+pesel[7]*9+pesel[8]*1+pesel[9]*3;
pesel[10]=10-(k%10);
if (pesel[10]==10)
{
    pesel[10]=0;
}
        for (int x=0 ;x<11;x++)
        {
            System.out.println(pesel[x]);
        }
    }

}
