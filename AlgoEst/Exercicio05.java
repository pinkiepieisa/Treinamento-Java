import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    //Associa o Scanner ao teclado

    String x;
    int y;
    double z;
    char a;

    x = sc.next();
    y = sc.nextInt();
    z = sc.nextDouble(); //Pega o sistema do país do pc
    a = sc.next().charAt(0);//0 é a posição do primeiro caracter. Essa função pega o caracter que estiver denominado entre os parênteses
    //Responsável por passar o que foi digitado no teclado para a variável

    System.out.println("Você digitou: " + x);
    System.out.println("Você digitou: " + y);
    System.out.println("Você digitou: " + z);
    System.out.printf("Você digitou: %.2f%n" , z);
    System.out.println("Você digitou: " + a);


    sc.close();
    //Encerra o programa

    }
}
