package objeto;

public class RodarAplicacao {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();  // construtor default

        carro1.setCor("azul");
        carro1.setModelo("carrinho");
        carro1.setCapacidadeTanque(100);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque()); 
        System.out.println(carro1.totalValorTanque(5));
        
        
        Carro carro2 = new Carro("branco", "carrão", 150);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(4)); 

    }
}
