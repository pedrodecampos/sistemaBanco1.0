public class Main {
    public static void main(String[] args) {

        Banco p1 = new Banco();
        p1.setNumConta(1111);
        p1.setDono("Roberto");
        p1.abrirConta("CC");


        Banco p2 = new Banco();
        p2.setNumConta(2222);
        p2.setDono("Ana");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);


        p1.estadoAtual();
        p2.estadoAtual();

    }
}