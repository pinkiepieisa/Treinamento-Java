public class Casting {
    
    public static void main(String[] args) {
        
        int a, b, c;
        double resultado, d;

        a = 5;
        b = 2;
        d = 5.0;
        c = (int) d;

        resultado = (double) a / b;
        //Para fazer a conversão explícita do resultado

        System.out.println(resultado);
        System.out.println(c);



    }
}
