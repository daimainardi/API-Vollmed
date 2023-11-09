package med.voll.api.domain.consulta;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsultaDTO(
        Long id,
        Long idMedico,
        Long idPaciente,

        //@JsonFormat(pattern = "dd/MM/yyyy HH:mm") para devolver o json com a data diferente do padrão!
        LocalDateTime data) {
    public DadosDetalhamentoConsultaDTO(ConsultaEntity consulta) {
        this(consulta.getId(), consulta.getMedico().getId(), consulta.getPaciente().getId(), consulta.getData());
    }
}
