package src;

import java.util.Scanner;

public class Treino2 {

	public static void main(String[] args) {
		double n1, n2, media;
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.println("Digie a segunda nota: ");
		n2 = sc.nextDouble();
		media = (n1 + n2)/2;
		System.out.println("A média da aluna é: " + media);
		if (media > 6) {
			System.out.println("Parabéns, você foi aprovada!");
		} 
		else if (media == 6 ) {
			System.out.println("Olha, passou por pouco, você foi aprovada!");
		}
		else {
			System.out.print("Poxa, você foi reprovada!");
		}
		sc.close();
	}

}
