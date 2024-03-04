package View;

import Controller.Binario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Binario bin = new Binario();

        System.out.print("Insira um número inteiro até 2000: ");

        boolean check = false;
        int n = 0;

        while (check == false) {


            n = scan.nextInt();

            if ( n <= 2000) {

                check = true;

            }
            else {

                System.out.println("Valor inválido");
            }


        }
        System.out.println("Valor em binário: " + bin.funcBinario(n));

    }

}
