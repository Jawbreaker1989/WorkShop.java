package view;

import logic.WorkShop;

import java.util.Scanner;

public class Runner {
    private Scanner input;

    public Runner() {
        input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Runner().mainMenu();
    }

    private void mainMenu() {

        String menu = "<<<<<< MENU PRINCIPAL >>>>>\n\n" +
                "1.Numeros Romanos\n" +
                "2. Egolatras\n\n" +
                "X. Salir";

        char option = 0;

        do{
            System.out.println( menu );

            option = input.nextLine().charAt(0);

            switch(option){
                case '1' : roman();
                break;

                case '2' : egolatr();
                break;

                case '3' : chains();
            }

        }while (Character.toUpperCase(option) != 'X');
    }

    private void chains() {
        /*System.out.print("Digite Cadena ");
        String chain = input.nextLine();

        for( int index = 0 ; index < chain.length() ; index++ ){
            System.out.println( chain.charAt( index ) );
        }

        System.out.println( chain.compareTo("Sogamoso"));

        System.out.println("Edad");

        int age = Integer.parseInt(input.nextLine());

        System.out.printf("Hola eres %s de Edad\n",age >= 18 ? " Mayor " : " Menor ");*/

        System.out.printf("[%f]\n",Math.PI);
        System.out.printf("[%.2f]\n",Math.PI);
        System.out.printf("[%10.2f]\n",Math.PI);
        System.out.printf("[%-10.2f]\n",Math.PI);
        System.out.printf("[%010.2f]\n",Math.PI);
    }

    private void egolatr() {
        System.out.print("Numero...: ");

        try{
            int number = Integer.parseInt(input.nextLine());

            System.out.printf("El numero es %d y su cubo es %f en octales %o en hexadecimal %x\n",number,Math.pow(number,3),number,number);

            if( WorkShop.isEgolatr(number) ){
                //TODO el numero es egolatrta
            }else{
                //TODO el numero no es egolatra
            }

        }catch (NumberFormatException e){
            System.out.println("Dato no Valido");
        }
    }

    private void roman() {
        System.out.print("Numero...: ");

        try{
            int number = Integer.parseInt(input.nextLine());
            System.out.println(WorkShop.convertToRoman(number));
        }catch (NumberFormatException e){
            System.out.println("Dato no Valido");
        }

    }
}
