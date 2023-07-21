package guardavolumes;

import java.util.ArrayList;

/**
 *
 * @author soubrunasoares
 */
public class Armario {    
    private String nome;
    private String pontox;
    private String pontoy; 
    private ArrayList<Compartimento> compartimentos;
    
    public Armario(String nome, String pontox, String pontoy, ArrayList<Compartimento> compartimentos) {
        this.nome = nome;
        this.pontox = pontox;
        this.pontoy = pontoy;
              
        this.compartimentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPontox() {
        return pontox;
    }

    public void setPontox(String pontox) {
        this.pontox = pontox;
    }

    public String getPontoy() {
        return pontoy;
    }

    public void setPontoy(String pontoy) {
        this.pontoy = pontoy;
    }

    public ArrayList<Armario> getArmarios() {
        return armarios;
    }

    public void setArmarios(ArrayList<Armario> armarios) {
        this.armarios = armarios;
    }
    
 
}
    
    