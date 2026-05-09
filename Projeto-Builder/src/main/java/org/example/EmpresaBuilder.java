package org.example;

public class EmpresaBuilder {

    private Empresa empresa;

    public EmpresaBuilder(){
        empresa = new Empresa();
    }

    public Empresa build() {
        if (empresa.getRazaoSocial().equals("")) {
            throw new IllegalArgumentException("Razão social inválida");
        }
        if (empresa.getTelefone().equals("")){
            throw new IllegalArgumentException("Telefone inválido");
        }
        if (empresa.getNomeResponsavel().equals("")){
            throw new IllegalArgumentException("Nome responsável é obrigatório");
        }
        return empresa;
    }

    public EmpresaBuilder setRazaoSocial(String razaoSocial) {
        empresa.setRazaoSocial(razaoSocial);
        return this;
    }

    public EmpresaBuilder setCnpj(String cnpj) {
        empresa.setCnpj(cnpj);
        return this;
    }

    public EmpresaBuilder setNomeFantasia(String nomeFantasia) {
        empresa.setNomeFantasia(nomeFantasia);
        return this;
    }

    public EmpresaBuilder setInscricaoEstadual(String inscricaoEstadual) {
        empresa.setInscricaoEstadual(inscricaoEstadual);
        return this;
    }

    public EmpresaBuilder setInscricaoMunicipal(String inscricaoMunicipal) {
        empresa.setInscricaoMunicipal(inscricaoMunicipal);
        return this;
    }

    public EmpresaBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        empresa.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public EmpresaBuilder setEnderecoNumero(int enderecoNumero) {
        empresa.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public EmpresaBuilder setEnderecoComplemento(String enderecoComplemento) {
        empresa.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public EmpresaBuilder setEnderecoBairro(String enderecoBairro) {
        empresa.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public EmpresaBuilder setEnderecoCidade(String enderecoCidade) {
        empresa.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public EmpresaBuilder setEnderecoUf(String enderecoUf) {
        empresa.setEnderecoUf(enderecoUf);
        return this;
    }

    public EmpresaBuilder setCep(String cep) {
        empresa.setCep(cep);
        return this;
    }

    public EmpresaBuilder setTelefone(String telefone) {
        empresa.setTelefone(telefone);
        return this;
    }

    public EmpresaBuilder setEmail(String email) {
        empresa.setEmail(email);
        return this;
    }

    public EmpresaBuilder setNomeResponsavel(String nomeResponsavel) {
        empresa.setNomeResponsavel(nomeResponsavel);
        return this;
    }
}
