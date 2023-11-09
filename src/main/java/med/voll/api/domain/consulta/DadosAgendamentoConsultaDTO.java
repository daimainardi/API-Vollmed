package med.voll.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.medico.Especialidade;

import java.time.LocalDateTime;

public record DadosAgendamentoConsultaDTO(
        Long idMedico,
        @NotNull
        Long idPaciente,
        @NotNull
        @Future
        //@JsonFormat(pattern = "dd/MM/yyyy HH:mm") para receber o json com a data diferente do padrão!
        LocalDateTime data,
        Especialidade especialidade){
}
