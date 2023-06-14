package med.voll.Api.controller;

import med.voll.Api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")

public class PacienteController {
    public void cadastrar(@RequestBody DadosCadastroPaciente dados ){
        System.out.println("dados recebidos:"+ dados);

    }
}
