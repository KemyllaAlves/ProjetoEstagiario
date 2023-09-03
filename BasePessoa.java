package poo.projetoestagio;

import java.time.LocalDate;

public abstract class BasePessoa {

    protected int codigo;
    protected String nome;
    protected String email;
    protected String telefone;
    protected LocalDate dataNasciemnto;
    protected String usuario; 
    protected String senha;
    
   
    public BasePessoa(int codigo, String nome, String email, String telefone, LocalDate dataNasciemnto, String usuario,
            String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNasciemnto = dataNasciemnto;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNasciemnto() {
        return dataNasciemnto;
    }

    public void setDataNasciemnto(LocalDate dataNasciemnto) {
        this.dataNasciemnto = dataNasciemnto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
