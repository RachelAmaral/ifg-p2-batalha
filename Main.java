public class Main{
    public static void main(String[] args){
        SuperPoder magia = new SuperPoder("magia negra",666);
        SuperPoder energia = new SuperPoder("energia",54);
        Personagem rachel = new Personagem("Mulher gata", "Rachel");
        
        rachel.adicionaSuperPoder(magia);
        rachel.adicionaSuperPoder(energia);

        System.out.println("magia.getcategoria "+ magia.getCategoria());
        System.out.println("qualquer coisa "+rachel.getPoderTotal());
        System.out.println("Eu te amo");
    }
} 