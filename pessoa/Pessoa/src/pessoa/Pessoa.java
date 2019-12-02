package pessoa;


public class Pessoa {

    /**
     * @param args the command line arguments
     */
    String nome;
    Pessoa pai, mae;
    public Pessoa(String nome, Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }
    boolean igualdade(Pessoa outro){
        if(outro.nome.equals(this.nome) && outro.mae.equals(this.mae))
            return true;
        else
            return false;
    }
    boolean irmandade(Pessoa outro){
        if(outro.pai.equals(this.pai) || outro.mae.equals(this.mae))
            return true;
        else
            return false;
    }
    boolean antecessora(Pessoa outro){
        if(outro.equals(this.pai) || outro.equals(this.mae) || outro.equals(this.pai.pai) || outro.equals(this.mae.mae))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa raiz1 = new Pessoa("Adão", null, null);
        Pessoa raiz2 = new Pessoa("Eva", null, null);
        Pessoa raiz3 = new Pessoa("Caim", raiz1, raiz2);
        Pessoa raiz4 = new Pessoa("Avan", null, null);
        Pessoa galho1 = new Pessoa("Jodosberto", raiz1, raiz2);
        Pessoa galho2 = new Pessoa("Aurora", raiz3, raiz4);
        Pessoa folha1 = new Pessoa("Magno", galho1, galho2);
        Pessoa folha2 = new Pessoa("Josefo", galho1, galho2);
        Pessoa folha3 = new Pessoa("Josefo", galho1, galho2);
        
        System.out.println(folha1.antecessora(galho1));
        System.out.println(folha1.antecessora(galho2));
        System.out.println(folha1.antecessora(folha2));
        System.out.println(folha1.antecessora(raiz1));
        System.out.println(folha2.igualdade(folha3));
        System.out.println(folha1.irmandade(folha3));
        
    }
    
}
