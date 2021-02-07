//package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        zad0206();
//    }
//
//    public static void zad0206() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj numer miesiaca: ");
//
//        int a = scanner.nextInt();
//
//        switch (a){
//
//            case 1:
//                System.out.println("Styczen");
//                break;
//            case 2:
//                System.out.println("Luty");
//                break;
//            case 3:
//                System.out.println("Marzec");
//                break;
//            case 4:
//                System.out.println("Kwiecien");
//                break;
//            case 5:
//                System.out.println("Maj");
//                break;
//            case 6:
//                System.out.println("Czerwied");
//                break;
//            case 7:
//                System.out.println("Lipiec");
//                break;
//            case 8:
//                System.out.println("Sierpien");
//                break;
//            case 9:
//                System.out.println("Wrzesien");
//                break;
//            case 10:
//                System.out.println("Pazdziernik");
//                break;
//            case 11:
//                System.out.println("Listopad");
//                break;
//            case 12:
//                System.out.println("Grudzien");
//                break;
//            default:
//                System.out.println("Nie ma takiego miesiaca");
//        }
//
//    }
//}

//package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        zad0208();
//    }
//
//    public static void zad0208() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj pierwszy bok: ");
//        int a = scanner.nextInt();
//        System.out.println("Podaj drugi bok: ");
//        int b = scanner.nextInt();
//        System.out.println("Podaj trzeci bok: ");
//        int c = scanner.nextInt();
//
//        if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
//            System.out.println("Będzie z tego trójkąt");
//        } else {
//            System.out.println("Nie da rady");
//        }
//    }
//}

//package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        zad0205();
//    }
//
//    public static void zad0205() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj rok:");
//        int rok = scanner.nextInt();
//        if (((rok%4 == 0)&&(rok%100 != 0))|(rok%400 == 0)) {
//            System.out.println("Rok jest przestępny");
//        } else {
//            System.out.println("Rok nie jest przestępny");
//        }
//    }
//}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        najwieksza();
        najmniejsza();

    }

    public static void zbierzdane() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        int a = scanner.nextInt();
        System.out.println("Podaj druga liczbę:");
        int b = scanner.nextInt();
        System.out.println("Podaj trzecia liczbę:");
        int c = scanner.nextInt();
    }

    public static void najwieksza() {
        if ((a > b) && (a > c)) {
            System.out.println("Pierwsza liczba jest najwieksza");
        } else if ((b > a) && (b > c)) {
            System.out.println("Druga liczba jest najwieksza");
        } else {
            System.out.println("Trzecia liczba jest najwieksza");
        }
    }
        public static void najmniejsza() {
        if ((a<b)&&(a<c)) {
            System.out.println("Pierwsza liczba jest najmniejsza");
        } else if ((b<a)&&(b<c)) {
            System.out.println("Druga liczba jest najmniejsza");
        } else {
            System.out.println("Trzecia liczba jest najmniejsza");
        }
    }
}
