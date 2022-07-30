package Aj1Capitulo03;

class Aplicacao {
    public static void main(String[] args) {
        System.out.println(new Carro("a"));
        System.out.println(new Carro("x"));
    }
    static class Carro {
        private String marca;
        public Carro(String marca) {
            this.marca = marca;
        }
        public boolean equals(Object o) {
            Carro carro = (Carro) o;
            
            //o retorno deve ser boolean
            //return Objects.equals(marca, carro.marca);
            return false;
        }
        public int hashCode() {
            return 1;
        }
    }
}