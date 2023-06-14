package med.voll.Api.medicos;

import jakarta.validation.constraints.NotNull;
import med.voll.Api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {


}
