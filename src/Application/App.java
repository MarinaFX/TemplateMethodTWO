package Application;

import Template.FloatingPointComparator;

import java.util.Random;
import java.util.Scanner;

public class App {
    private static double d1 = 0.0;
    private static double d2 = 0.0;

    public static void coletaInfos(){
        Scanner in = new Scanner(System.in);
        System.out.println("Bem vindo!");
        System.out.println("Neste programa iremos comparar números a partir da sua vírgula");
        System.out.print("Insira um número com vírgula please: ");
        d1 = in.nextDouble();
        System.out.print("Insira outro numero com virgula sil vous plait: ");
        d2 = in.nextDouble();
    }

    public static void main(String[] args) {
        FloatingPointComparator comparator = new FloatingPointComparator();
        App.coletaInfos();
        System.out.println("\nPrimeiro resultado: ");
        comparator.compare(d1,d2);
        System.out.println();
        System.out.println("\nSegundo resultado: ");
        comparator.compare(App.ramdomArray());
        System.out.println();
        System.out.println("FIM");
    }

    private static double[] ramdomArray(){
        Random random = new Random();
        double array[] = new double[10];
        int index = 0;
        double masher = 0.2;

        for (double d : array){
            double gaussian = random.nextInt(100);
            array[index] = gaussian * masher;
            index++;
            masher = masher*0.2343;
        }
        return array;
    }
}
