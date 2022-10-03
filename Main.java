import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //A = (R*R) * pi
    double pi = 3.14;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o raio do circulo: ");

    double raio = sc.nextDouble();
    double area = (raio * raio) * pi;
    
    System.out.println("A área do circulo é: " + area);
  }
}