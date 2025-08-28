import java.util.Locale;

public class OlaMundo {
    
    public static void main (String[] args) {
        
        int y = 22;
        double x = 10.3456;
        double z = 23.8970;
        String nome = "Isabela";
        int idade = 22;
        double renda = 2000;
        
        System.out.println("Olá Mundo!");
        System.out.println("Bom dia!");

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", z); //Formata a quantidade de casas decimais que irá aparecer na tela
        Locale.setDefault(Locale.US);
        //Transforma a localização do arquivo, mudando o sistema

        System.out.printf("Resultado em %.2f metros.%n", x);
        System.out.printf("A %s tem %d anos e recebe %.2f de salário do estágio!", nome, idade, renda);

    } 
}
