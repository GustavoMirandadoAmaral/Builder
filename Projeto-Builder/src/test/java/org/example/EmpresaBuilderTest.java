package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaBuilderTest {

    @Test
    void deveRetornarExcecaoParaAlunoSemRazaoSocial() {
        try {
            EmpresaBuilder empresaBuilder = new EmpresaBuilder();
            Empresa empresa = empresaBuilder
                    .setTelefone("32999025768")
                    .setNomeResponsavel("Nome responsável")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Razão social inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAlunoSemTelefone() {
        try {
            EmpresaBuilder empresaBuilder = new EmpresaBuilder();
            Empresa empresa = empresaBuilder
                    .setRazaoSocial("Razão social 1")
                    .setNomeResponsavel("Nome responsável")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Telefone inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAlunoSemNomeResponsavel() {
        try {
            EmpresaBuilder empresaBuilder = new EmpresaBuilder();
            Empresa empresa = empresaBuilder
                    .setRazaoSocial("Razão social 1")
                    .setNomeResponsavel("Nome responsável")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Telefone inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarEmpresaValida() {
        EmpresaBuilder empresaBuilder = new EmpresaBuilder();
        Empresa empresa = empresaBuilder
                .setRazaoSocial("Razão social 1")
                .setTelefone("32999025768")
                .setNomeResponsavel("Nome responsável")
                .build();

        assertNotNull(empresa);
    }
}