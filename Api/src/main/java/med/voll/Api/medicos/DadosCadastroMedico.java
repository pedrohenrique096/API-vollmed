package med.voll.Api.medicos;

import med.voll.Api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidades especialidade, DadosEndereco endereco) {
}
