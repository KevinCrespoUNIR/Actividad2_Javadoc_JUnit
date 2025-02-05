package javabean;

import java.util.Scanner;

public class Calculadora {

    private double resultado;

    //get
    public double getResultado() {
        return resultado;
    }

    //set
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int bandera=0;

        do{

            System.out.println("REALIZAR OPERACION:\n"+"1. Sumar\n"+"2. Restar\n"+"3 Multiplicar\n"+"4. Dividir\n"+"5. SALIR");




            switch (entrada.nextInt()){


                //sumar
                case 1:

                        //codigo sumar



                    break;

                    //restar
                case 2:


                    break;

                    //multiplicar
                case 3:




                    break;

                    //dividir
                case 4:



                    break;

                    //salir
                case 5:

                    bandera=1;


                    break;

            }



        }while(bandera != 1);




        Resta resta = new Resta();




    }
}
