package javaIntermediate.Construtor;

public class Main {
   public static void main(String[] args) {
        Hokages hashirama = new Hokages();
        hashirama.name = "Hashirama Senju";


        Hokages minato = new Hokages("Minato Namikaze",30, true);
        System.out.println(minato.name);

    }


}
