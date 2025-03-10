package br.com.BitByte.Commerce.API.models;
import jakarta.persistence.*;

@Entity
@Table(name = "Empresas_cadastradas")
public class EmpresasCadastradas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empresa_id")
    private int empresaid;

    @Column(name="Razão_social")
        private String Razãosocial;

    @Column(name = "Email_da_empresa")
   private String  Emaildaempresa;

    @Column(name = "CNPJ_da_empresa")
private String CNPJdaempresa;

    @Column(name = "Senha_da_empresa")
    private String Senhadaempresa;

    @Column(name = "Telefone_da_empresa")
    private String Telefonedaempresa;

    @Column(name="Endereco_da_empresa")
    private String Enderecodaempresa;

    @Column(name = "Capital_social")
    private String Capitalsocial;


    public void setEmpresaid(int empresaid) {
        this.empresaid = empresaid;
    }

    public String getRazãosocial() {
        return Razãosocial;
    }

    public void setRazãosocial(String razãosocial) {
        Razãosocial = razãosocial;
    }


    public String getEmaildaempresa() {
        return Emaildaempresa;
    }

    public void setEmaildaempresa(String emaildaempresa) {
        Emaildaempresa = emaildaempresa;
    }

    public String getCNPJdaempresa() {
        return CNPJdaempresa;
    }

    public void setCNPJdaempresa(String CNPJdaempresa) {
        this.CNPJdaempresa = CNPJdaempresa;
    }

    public String getSenhadaempresa() {
        return Senhadaempresa;
    }

    public void setSenhadaempresa(String senhadaempresa) {
        Senhadaempresa = senhadaempresa;
    }

    public String getTelefonedaempresa() {
        return Telefonedaempresa;
    }

    public void setTelefonedaempresa(String telefonedaempresa) {
        Telefonedaempresa = telefonedaempresa;
    }

    public String getEnderecodaempresa() {
        return Enderecodaempresa;
    }

    public void setEnderecodaempresa(String enderecodaempresa) {
        Enderecodaempresa = enderecodaempresa;
    }

    public String getCapitalsocial() {
        return Capitalsocial;
    }

    public void setCapitalsocial(String capitalsocial) {
        Capitalsocial = capitalsocial;
    }
}



