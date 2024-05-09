import java.util.Scanner;

public class ControleSimplesDeSaque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double limiteDiario = scanner.nextDouble();
        
        // Conversão explicita para utilizar o valor como contador no laço for
        int counter = (int) limiteDiario;
        
        for(int i = 0; i <= counter; i++) {
          double valorSaque = scanner.nextDouble();
          
            if(valorSaque <= 0) { 
                System.out.println("Transacoes encerradas.");
                break;
                
            }else if(valorSaque <= limiteDiario) {
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        } 
        scanner.close(); 
    }
}