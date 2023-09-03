package poo.projetoestagio;

import java.time.LocalDate;

public class Funcionario extends BasePessoa {
    
    public Funcionario(int codigo, String nome, String email, String telefone, LocalDate dataNasciemnto, String usuario,
    String senha) {
    super(codigo, nome, email, telefone, dataNasciemnto, usuario, senha);
    }

    private String contacorrente;
    private String registro;
    private String cracha;

    public String getContacorrente() {
        return contacorrente;
    }

    public void setContacorrente(String contacorrente) {
        this.contacorrente = contacorrente;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
     

}

