public class ContaBancaria {
    String titular;
    float saldo;

    void dados(){
        System.out.println("Meu nome é " + titular);
    }
    void adicionarSaldo (float valor){
        saldo += valor;
    }

    void sacar (float valor ){
        saldo -= valor;
    }

}
