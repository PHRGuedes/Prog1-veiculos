public class Veiculo {

private int id;
private String placa;
private String nome;
private int ano;
private int modelo;
public Fabricante fabricante;


public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}
public String getPlaca() {
    return placa;
}
public void setPlaca(String placa) {
    this.placa = placa;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getAno() {
    return ano;
}
public void setAno(int ano) {
    this.ano = ano;
}
public int getModelo() {
    return modelo;
}
public void setModelo(int modelo) {
    this.modelo = modelo;
}

public void imprimirveiculo() {
    System.out.println("ID: " + this.id);
    System.out.println("Placa: " + this.placa);
    System.out.println("Nome: " + this.nome);
    System.out.println("Ano: " + this.ano);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Fabricante: " + this.fabricante.getNome());
    System.out.println("CNPJ: " + this.fabricante.getCnpj());
    System.out.println("Cidade: " + this.fabricante.getCidade()); 

    }
}