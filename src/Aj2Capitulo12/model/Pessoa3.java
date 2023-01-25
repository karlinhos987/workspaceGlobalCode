package Aj2Capitulo12.model;

/**
 * @author karlinhos987
 *
 */

//ExemploP281_01

import Aj2Capitulo12.util.Endereco;

//Class Endereco3 esta sem a declaracao do pacote, sendo assim nao eh possivel localizar a mesma
public class Pessoa3 {
    private Endereco3 endereco;
    private String nome;
    private String rg;

    public Pessoa3(Endereco3 endereco, String nome, String rg) {
        this.endereco = endereco;
        this.nome = nome;
        this.rg = rg;
    }
    public Endereco3 getEndereco() {return endereco;}
    public void setEndereco(Endereco3 endereco) {this.endereco = endereco;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getRg() {return rg;}
    public void setRg(String rg) {this.rg = rg;}   
}