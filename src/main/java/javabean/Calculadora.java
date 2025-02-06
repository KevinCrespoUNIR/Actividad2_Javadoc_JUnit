package javabean;

import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int bandera=0;

        do{

            System.out.println("REALIZAR OPERACION:\n"+"1. Sumar\n"+"2. Restar\n"+"3 Multiplicar\n"+"4. Dividir\n"+"5. SALIR");




            switch (entrada.nextInt()){


                //sumar
                case 1:

                    Suma suma1 = new Suma();

                    double resultado_suma1 = 	suma1.sumaDosReales();
                    int resultado_suma2    = 	suma1.sumaDosEnteros();
                    double resultado_suma3 = 	suma1.sumaTresReales();

                    System.out.println("El resultado es: " + resultado_suma1);
                    System.out.println("El resultado es: " + resultado_suma2);
                    System.out.println("El resultado es: " + resultado_suma3);

                    System.out.println(
                            "El valor acumulado de todas las operaciones es: "
                                    + suma1.getValorAcumulado());
                    // ---------------------------------------------------- //

                    System.out.println(" ");
                    System.out.println(" ");


                    break;

                    //restar
                case 2:



                    // ---------------------- RESTA ----------------------- //
                    Resta resta1 = new Resta();


                    double resultado_resta1 = 	resta1.restaDosReales();
                    int resultado_resta2    = 	resta1.restaDosEnteros();
                    double resultado_resta3 = 	resta1.restaTresReales();

                    System.out.println("El resultado es: " + resultado_resta1);
                    System.out.println("El resultado es: " + resultado_resta2);
                    System.out.println("El resultado es: " + resultado_resta3);

                    System.out.println(
                            "El valor acumulado de todas las operaciones es: "
                                    + resta1.getValorAcumulado());
                    // ---------------------------------------------------- //


                    break;

                    //multiplicar
                case 3:


                    System.out.println("1.multiplicar 2 enteros\n"+"2.multiplicar 3 enteros\n"+"3.multiplicar 2 reales\n"+"4.potendia");


                    switch (entrada.nextLine()){

                        case "1":

                            break; case "2":

                                break;
                                case "3":

                                    break;
                                    case "4":

                                        break;


                }




                    break;

                    //dividir
                case 4:


                    //paula





                    break;



                    //salir
                case 5:

                    bandera=1;


                    break;

            }



        }while(bandera != 1);

    }//fin main
}//fin clase

