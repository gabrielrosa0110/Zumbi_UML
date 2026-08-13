public class main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Alanzoka";
        z1.vida = 250;

        z2.nome = "Juquinha";
        z2.vida = 250;


        z1.mostraVida();
        z2.mostraVida();

        z1.transfereVida(z2,100);

        System.out.println( z1.nome);
        System.out.println( "Vida: " + z1.mostraVida());

        System.out.println();
        System.out.println(z2.nome);
        System.out.println("Vida: " + z2.mostraVida());


    }
}
