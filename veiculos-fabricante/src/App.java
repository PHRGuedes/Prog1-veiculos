public class App {

    public static void main(String[] args) throws Exception {
        
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setId(1);
        veiculo1.setPlaca("ABC-1234");
        veiculo1.setNome("Carro");
        veiculo1.setAno(2020);
        veiculo1.setModelo(2021);
        
        Fabricante fabricante1 = new Fabricante();
        fabricante1.setId(1);
        fabricante1.setNome("Fiat");
        fabricante1.setCnpj("12.345.678/0001-90");
        fabricante1.setCidade("São Paulo");
        
        // Associando o fabricante ao veículo
        veiculo1.fabricante = fabricante1;
        
        // Imprimindo os detalhes do veículo e do fabricante
        veiculo1.imprimirveiculo();
        
 
    }



}

