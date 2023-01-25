package Aj2Capitulo12.util;

/**
 * @author karlinhos987
 *
 */

//ExemploP280_01
//Class sem o modificador de acesso somente permite acesso por classes do mesmo pacote
class Endereco2{
    private String rua;
    private int numero;

    public Endereco2(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {return rua;}
    public void setRua(String rua) {this.rua = rua;}
    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}
    
}