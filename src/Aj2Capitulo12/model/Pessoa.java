package Aj2Capitulo12.model;

/**
 * @author karlinhos987
 *
 */

//ExemploP277_01

import Aj2Capitulo12.util.Endereco;

public class Pessoa {
    private Endereco endereco;
    private String nome;
    private String rg;

    public Pessoa(Endereco endereco, String nome, String rg) {
        this.endereco = endereco;
        this.nome = nome;
        this.rg = rg;
    }
    public Endereco getEndereco() {return endereco;}
    public void setEndereco(Endereco endereco) {this.endereco = endereco;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getRg() {return rg;}
    public void setRg(String rg) {this.rg = rg;}   
}