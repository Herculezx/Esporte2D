import java.time.LocalDate;

public class Pessoa {
    // Atributos
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private Double altura;
    private double peso;

    private int idFederacao;
    public int getIdFederacao(){
        return idFederacao;
    }
    public void setIdFederacao(int idFederacao){
        this.idFederacao = idFederacao;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String sacar(){
        return "Não sei sacar";
    }
}
