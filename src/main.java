public class main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        //Dados dos Zumbis
        z1.nome = "Alanzoka";
        z1.vida = 250;

        z2.nome = "Juquinha";
        z2.vida = 250;
        //Mostra vida do zumbi após a transferencia
        z1.mostraVida();
        z2.mostraVida();

        //Saida dos dados informados de cada zumbi
        System.out.println( z1.nome);
        System.out.println( "Vida: " + z1.vida);

        System.out.println();
        System.out.println(z2.nome);
        System.out.println("Vida: " + z2.vida);

        //Transferencia de vida do  zumbi z1 para zumbi z2
        z1.transfereVida(z2,100);

        //Saida dos dados após as transferencia
        System.out.println();
        System.out.println("Após transferencia de vida: ");
        System.out.println();

        System.out.println( z1.nome);
        System.out.println( "Vida: " + z1.mostraVida());

        System.out.println();
        System.out.println(z2.nome);
        System.out.println("Vida: " + z2.mostraVida());

    }
}
