package med.voll.Api.endereco;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotNull
        String logradouro,
        @NotNull

        String bairro,
        @NotNull
        @Pattern(regexp = "\\d{8}")
        String cep,
        @NotNull
        String cidade,
        @NotNull

        String uf,
        String complemento,
        String numero ) {
}
