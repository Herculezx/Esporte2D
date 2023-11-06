public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pessoa qualquer = new Pessoa();
        qualquer.setNome("Mateus Tomoto");

        System.out.println(qualquer.getNome());

        Esportista jogadora = new Esportista();
        Esportista surfista = new Esportista(345);

        jogadora.setNome("Taissa");
        surfista.setNome("Maíra");

        // Polimorfismo
        qualquer = new Esportista();
        qualquer.setIdFederacao(567);

        System.out.println(qualquer.getIdFederacao());
        System.out.println(qualquer.sacar());
        System.out.println(jogadora.sacar());
    }
}