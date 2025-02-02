package javabean;


public class Calculadora {

//atributos de clases

   double resultado = 0;

   //constructor
    public Calculadora() {
    }

    //getter
    public double getResultado() {
        return resultado;
    }


    //metodos propios
    public double multiplicar(int a, int b) {

        Producto producto = new Producto();
        return  this.resultado=producto.multiplicar(a,b);
    }

    public double multiplicar(int a, int b,int c) {

        Producto producto = new Producto();
        return  this.resultado=producto.multiplicar(a,b,c);
    }

    public double multiplicar(double a, double b) {

        Producto producto = new Producto();
        return  this.resultado=producto.multiplicar(a,b);
    }



    public static void main(String[] args) {


Calculadora calculadora = new Calculadora();
        calculadora.multiplicar(2.7,3.7);
        System.out.println(calculadora.getResultado());

    }
}
