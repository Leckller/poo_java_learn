package dayOne;

public class Pessoa {
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public Pessoa(String nome, int idade, String trabalho, int salario) {
    this.nome = nome;
    this.idade = idade;
    this.trabalho = trabalho;
    this.salario = salario;
  };

  protected int idade;
  protected String nome;
  private String trabalho;
  private int salario = 0;

  public void getTrabalho() {
    if (trabalho == null || salario == 0) {
      System.out.println("Esta pessoa está desempregada");
    } else {
      System.out.println("Trabalho: " + this.trabalho);
      System.out.println("Salario: " + this.salario);
    }
  }

  public void getPessoa() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);
  }
}
