/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guardavolumes;

/**
 *
 * @author soubrunasoares
 */
public class Compartimentos {
    private int tamanho;
    private int numero;

    public Compartimentos(int tamanho, int numero) {
        this.tamanho = tamanho;
        this.numero = numero;
    }

    Compartimentos() {
       
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
