import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println("Informe um número de 1 a 200");
      String numero = sc.nextLine();
      ConsumoApi api = new ConsumoApi();
      String json = api.NumAleatorio(numero);
      System.out.println(" -*CONSELHO DO DIA*- ");
      System.out.println(numero);
      sc.close();
    }
}
