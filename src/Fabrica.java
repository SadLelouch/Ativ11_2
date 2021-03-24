import java.util.Scanner;

public class Fabrica {
    public static void main (String [] args){
        Carro carro01;
        carro01 = new Carro();

        Carro carro02;
        carro02 = new Carro();

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a cor do carro 1: ");
        String cor = scan.nextLine();
        carro01.setCor(cor);
        System.out.println("Digite a ano do carro 1: ");
        String ano = scan.nextLine();
        carro01.setAno(ano);
        System.out.println("Cor: " + carro01.getCor());
        System.out.println("Ano: " + carro01.getAno());
        scan.nextLine();
        System.out.println("Digite a cor do carro 2: ");
        cor = scan.nextLine();
        carro02.setCor(cor);
        System.out.println("Digite a ano do carro 2: ");
        ano = scan.nextLine();
        carro02.setAno(ano);
        System.out.println("Cor: " + carro02.getCor());
        System.out.println("Ano: " + carro02.getAno());
    }
}
