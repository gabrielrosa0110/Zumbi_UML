public class Zumbi {
    double vida;
    String nome;

   public double mostraVida()
   {
       return vida;
   }
   public void transfereVida(Zumbi zumbiAlvo, double quantia)
   {
       vida -= quantia;
       zumbiAlvo.vida += quantia;

   }
}
