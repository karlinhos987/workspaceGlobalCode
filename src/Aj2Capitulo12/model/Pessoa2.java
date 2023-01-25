package Aj2Capitulo12.model;

/**
 * @author karlinhos987
 *
 */

//ExemploP281_01

import Aj2Capitulo12.util.Endereco;

//Class Endereco2 esta sem o modificador de acesso, sendo assim somente permite o acesso por classes
//que estao no mesmo pacote
public class Pessoa2 {
    private Endereco2 endereco;
    private String nome;
    private String rg;

    public Pessoa2(Endereco2 endereco, String nome, String rg) {
        this.endereco = endereco;
        this.nome = nome;
        this.rg = rg;
    }
    public Endereco2 getEndereco() {return endereco;}
    public void setEndereco(Endereco2 endereco) {this.endereco = endereco;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getRg() {return rg;}
    public void setRg(String rg) {this.rg = rg;}   
}