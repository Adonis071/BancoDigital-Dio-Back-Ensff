import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Cliente adonis = new Cliente();
    adonis.setNome("Adonis");
    Cliente adellem = new Cliente();
    adellem.setNome("Adellem");
    Cliente hellem = new Cliente();
    hellem.setNome("Hellem");
/* Criando contas para clientes */
   Conta ccAdonis = new ContaCorrente(adonis);
   Conta ccAdellem = new ContaCorrente(adellem);
   Conta cchellem = new ContaCorrente(hellem);
   Conta ppAdonis = new ContaPoupanca(adonis);

   /*Movimetação financeira de conta corrente para conta poupança*/
   ppAdonis.depositar(9000);
   ppAdonis.transferir(100, ccAdonis);

   /*Depósito de valores */
   ccAdonis.depositar(100);
   cchellem.depositar(1000);
   ccAdellem.depositar(500);

   /*Transferência entre clientes*/
        cchellem.transferir(10, ccAdonis);
        ccAdonis.transferir(90, ccAdellem);

        /* imprimindo extrato bamcário*/
    ccAdonis.imprimirExtrato();
    ppAdonis.imprimirExtrato();

   List<Conta> contas = new ArrayList<>();
    Banco minhaListaDeClientes = new Banco("Bco.Lmt ");

   contas.add(ccAdellem);
   contas.add(ccAdonis);
   contas.add(cchellem);

  minhaListaDeClientes.setContas(contas);
  minhaListaDeClientes.imprimirContas();



    }
}
