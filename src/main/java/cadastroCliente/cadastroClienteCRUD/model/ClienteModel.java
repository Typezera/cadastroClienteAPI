package cadastroCliente.cadastroClienteCRUD.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;


    @Column(unique = true)
    private String email;
    private String senha;
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public long getId() {
        return id;
    }

}
