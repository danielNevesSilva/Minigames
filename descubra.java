package com.mycompany.projetosgit;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class descubra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random numero = new Random();

        boolean acertou = false;

        int numer = numero.nextInt(100), num;

        int tentativas = 5;

        do {

            System.out.println("digite um numero de 1 a 100");
            num = sc.nextInt();

            if (num == numer) {

                System.out.println("Párabens, você ganhou o jogo!");

                acertou = true;

            } else if (num < numer) {

                System.out.println("Numero é maior");

            } else if (num > numer) {
                System.out.println("Numero é menor");

            }
            tentativas--;
        } while (!acertou && tentativas > 0);
                System.out.println("Gamer Over!"
                        + "\n o numero era: " + numer);

    }

}
