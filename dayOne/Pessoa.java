package dayOne;

public class Pessoa extends Trabalho {
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public Pessoa(String nome, int idade, String trabalho, int salario) {
    super(trabalho, salario);
    this.nome = nome;
    this.idade = idade;
  };

  protected int idade;
  protected String nome;

  public void getPessoa() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);
  }
}

class Trabalho {
  protected String trabalho;
  protected int salario = 0;

  public Trabalho() {

  }

  public Trabalho(String trabalho, int salario) {
    this.trabalho = trabalho;
    this.salario = salario;
  }

  public void getTrabalho() {
    if (trabalho == null || salario == 0) {
      System.out.println("Esta pessoa está desempregada");
    } else {
      System.out.println("Trabalho: " + this.trabalho);
      System.out.println("Salario: " + this.salario);
    }
  }

  public void setTrabalho(String trabalho, int salario) {
    this.trabalho = trabalho;
    this.salario = salario;
  }
}