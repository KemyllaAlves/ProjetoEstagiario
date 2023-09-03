package poo.projetoestagio;

import java.time.LocalDate;

public class Passageiro extends BasePessoa{

        private String numeroCartao;
        private String documento;
        
    public Passageiro(int codigo, String nome, String email, String telefone, LocalDate dataNasciemnto, String usuario,
            String senha) {
        super(codigo, nome, email, telefone, dataNasciemnto, usuario, senha);
        //TODO Auto-generated constructor stub

    }

    public String getNumeroCartao() {
        return numeroCartao;
    }


    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }


    public String getDocumento() {
        return documento;
    }


    public void setDocumento(String documento) {
        this.documento = documento;
    }

 
}
