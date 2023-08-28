package Banco;

public class Conta{
    private int agencia;
    private int numero;
    private String Titular;
    private double saldo;
    public Conta() {
    }
    
    public Conta(int agencia, int numero, Titular titular, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public boolean depositar(double valor){
        if( valor>=0 ){
            this.saldo += valor;
            return true;
        }else {
            return false;
        }
    }
    public boolean sacar(double valor){
        if (valor>= 0 & this.saldo>= valor){
            System.out.println("Saque realizado com sucesso");
            this.saldo -= valor;
            return true;
        }else{
            System.out.println("Saque não permitido");
            return false;
        }
    }
    public boolean transferir(double valor, Conta destino){
        boolean sacou = this.sacar(valor);
        if(sacou){
            boolean depositou = destino.depositar(valor);
            if(depositou){
                System.out.println("Sucesso");
                return true;
            }else{
                System.out.println("Transferencia não realizada");
                return false;
            }
        }else{
            System.out.println("Transferencia não realizada");
            return false;
        }
    }
    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numero=" + numero + ", titular=" + Titular + ", saldo=" + saldo + "]";
    }
    
}