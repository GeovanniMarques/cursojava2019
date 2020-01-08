package controller;

   import model.Carro;

public class Cadastro {

	public static void main(String[] args) {
		
        Carro Carro01 = new Carro();
        
        Carro Carro02 = new Carro();
        
        Carro Carro03 = new Carro();
        
        Carro01.fabricante="Chevrolet";
        Carro01.modelo="Celta";
        Carro01.cor="Prata";
        Carro01.ano=2012;
        
        Carro02.fabricante="Ford";
        Carro02.modelo="Fiesta";
        Carro02.cor="Vermelho";
        Carro02.ano=2018;
        
        Carro03.fabricante="Honda";
        Carro03.modelo="Civic";
        Carro03.cor="Preto";
        Carro03.ano=2019;                           
                
        System.out.println(Carro01.fabricante);
        System.out.println(Carro01.modelo);
        System.out.println(Carro01.cor);
        System.out.println(Carro01.ano);
        
        System.out.println(Carro02.fabricante);
        System.out.println(Carro02.modelo);
        System.out.println(Carro02.cor);
        System.out.println(Carro02.ano);
        
        System.out.println(Carro03.fabricante);
        System.out.println(Carro03.modelo);
        System.out.println(Carro03.cor);
        System.out.println(Carro03.ano);
        
        
		
	}

}
