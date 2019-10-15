package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        double number1,number2,number3;
        String operator;
        String resume="y";
        Scanner S = new Scanner(System.in);


        while(resume.equals("y")){ // AR TESTI PROGRAMA

        PrintSymbol(30,"*");
        print("Iveskite +, -, *, / zenkla. Ivedus klaustuko '?' zenkla - isvedama formule");
        operator = S.next();
            if(operator.equals("+")){
                print("Iveskite pirma skaiciu");
                number1 = S.nextDouble();
                print("Iveskite antra skaiciu");
                number2 = S.nextDouble();

                sudeti(number1,number2);
                print("Ar norite testi skaiciavima? y/n ?");
                resume = S.next();
            }
            else if(operator.equals("-")){
                atimti();
                resume = S.next();
            }
            else if(operator.equals("*")){
                print("Iveskite pirma skaiciu");
                number1 = S.nextDouble();
                print("Iveskite antra skaiciu");
                number2 = S.nextDouble();
                print("Iveskite treciaa skaiciu");
                number3 = S.nextDouble();

                dauginti(number1,number2,number3);
                print("Ar norite testi skaiciavima? y/n ?");
                resume = S.next();
            }
            else if(operator.equals("/")){
                    dalinti();
                    print("Ar norite testi skaiciavima? y/n ?");
                    resume = S.next();
            }
            else if (operator.equals("?")) {
                print("Iveskite pirma skaiciu");
                number1 = S.nextDouble();
                print("Iveskite antra skaiciu");
                number2 = S.nextDouble();
                FormulesSkaiciavimas((int)number1,(int)number2);
                print("Ar norite testi skaiciavima? y/n ?");
                resume = S.next();
            }

            else{
                print("Blogai ivesta salyga");
            }

        }


    }

    /*
    Atimtis
    @return apskaiciuojame atimties rezultata
     */
    public static double atimti(){
        double no1,no2,rez;
        Scanner input = new Scanner(System.in);
        System.out.println("iveskite pirma skaiciu");
        no1 = input.nextDouble();
        System.out.println("iveskite antra skaiciu");
        no2 = input.nextDouble();
        rez = no1 - no2;
        System.out.println(rez);
        return rez;
    }

    /*
    @param parametru sudetis - number1 ir number 2
    @return graziname parametru suma
     */
    public static double sudeti(double number1, double number2){
        double rez = number1 + number2;
        print(number1 + " + " + number2 + " = " + rez);
        return rez;
    }


    /*
    Dvieju skaiciu dalyba
    */
    public static void dalinti(){
        double number1,number2,rez;
        Scanner input = new Scanner(System.in);
        print("iveskite pirma skaiciu");
        number1 = input.nextDouble();
        print("iveskite antra skaiciu");
        number2 = input.nextDouble();

        if(number2 == 0){
            print("Dalyba is 0 negalima");
        }
        else{
            rez = number1 / number2;
            print(number1 + " / " + number2 + " = " + rez);
        }

    }

    /*
    @param parametru daugyba number1 ir number2, vartotojui perduodama info
     */
    public static void dauginti (double number1, double number2){
        System.out.println(number1 * number2);
    }

    /*
    @param parametru daugyba number1, number2 ir number3, vartotojui perduodama info
    */
    public static void dauginti (double number1, double number2, double number3){
        System.out.println(number1 + " * " + number2 + " * " + number3 + " = "+ number1  * number2 * number3);
    }


    /*
     Spausdinti, perduoti vartotojui informacija
     @param info - parametras, kuri perduoda info
     */
    public static void print(String info){
        System.out.println(info);
    }

    public static void PrintSymbol(int length, String Symbol){
        print("Skaiciuotuvas");
        for (int i = 0; i < length; i++) {
            System.out.print(Symbol);
            }
        print("");

        }

        /*
        Resultato skaiciavimas pagal formule naudojant for cikla
        @param number1,number2 - Parametrai, vartotojo ivesti duomenys (skaiciai) pagal, kurios skaiciuojama formuleje
        @return grazinam gauta formules rezultata
        */
        public static int FormulesSkaiciavimas(int number1, int number2){
            int rez = 0;
            for (int i = 9; i < 99; i++){
               rez = (number2 + number1) / i - (number1 - number2);
               if(rez > 0.25){
                   System.out.println("(" + number2 + " + " + number1 + ")" + " / " + i + " - " + "(" + number1 + " - " + number2 + ")" + " = " +  rez + " > 0.25");
               }
               else if (rez < 0.25){
                   System.out.println("(" + number2 + " + " + number1 + ")" + " / " + i + " - " + "(" + number1 + " - " + number2 + ")" + " = " +  rez + " < 0.25");
               }
               else {
                   System.out.println("(" + number2 + " + " + number1 + ")" + " / " + i + " - " + "(" + number1 + " - " + number2 + ")" + " = " +  rez + " == 0.25");
               }
            }
            return rez;
        }

    }

