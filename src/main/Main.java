package main;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estudiantes: ");
        int estudiante = teclado.nextInt();

        int i;
        int promedioestudiante;
        int promedioestatura;
        int estatura = 0;
        int edad = 0;
        int mayor =0;

        for(i=1;i<=estudiante;i++){
            System.out.println("Ingrese edad de estudiante: ");
            promedioestudiante = teclado.nextInt();

            System.out.println("Ingrese estatura de estudiante: ");
            promedioestatura = teclado.nextInt();

            if(promedioestudiante == 18){
                promedioestudiante = mayor;
            }


            estatura = promedioestatura + promedioestatura;
            edad = promedioestudiante + promedioestudiante;
        }

        System.out.println("el promedio de las edades es :" + edad);
        System.out.println("el promedio de las estaturas es: " + estatura);


    }
}
