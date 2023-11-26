public class Personagem{
    private String nome, nomeVidaReal;
    private SuperPoder[] poderes;
    
    public Personagem(String nome,String nomeVidaReal){
        this.nome = nome;
        this.nomeVidaReal = nomeVidaReal;
        this.poderes = new SuperPoder[4];    
    }

    public void adicionaSuperPoder(SuperPoder sp){
        //Deve ter no maximo 4 superpoderes
        for (int i = 0; i < poderes.length; i++) {
            if(this.poderes[i]==null){
                this.poderes[i] = sp;
                break;
            }
        }


    }

    public int getPoderTotal(){
        int somaPoder = 0;
        for (int i = 0; i < poderes.length; i++) {
            if(this.poderes[i] != null){
                somaPoder = this.poderes[i].getCategoria() + somaPoder;
            }
        }
        return somaPoder;
    }


}