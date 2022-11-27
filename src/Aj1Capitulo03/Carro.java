package Aj1Capitulo03;

public /*static*/ class Carro
{
    private String marca;
    
    public Carro(final String marca) {
        this.marca = marca;
    }
    
    @Override
    public boolean equals(final Object o) {
        final Carro carro = (Carro)o;
        return false;
    }
    
    @Override
    public int hashCode() {
        return 1;
    }
}