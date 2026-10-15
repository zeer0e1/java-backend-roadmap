package dia01;

public  class Main {
    public static void main(String[] args){
         ContaBancaria conta = new ContaBancaria();

         conta.titular = "Lucas";
         conta.saldo = 100;

         conta.dados();

         conta.adicionarSaldo(40);

         System.out.println("Saldo: " + conta.saldo);

         conta.sacar(10);

         System.out.println("Saldo atualizado após o saque:" + conta.saldo);


    }
}