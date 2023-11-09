package med.voll.api.domain.consulta.validacoes.cancelamento;

import med.voll.api.domain.consulta.DadosAgendamentoConsultaDTO;
import med.voll.api.domain.consulta.DadosCancelamentoConsultaDTO;

public interface ValidadorCancelamentoDeConsulta {
     void validar(DadosCancelamentoConsultaDTO dados);
}
