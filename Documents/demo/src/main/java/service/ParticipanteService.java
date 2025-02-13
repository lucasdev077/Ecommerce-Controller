package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Participante;
import repository.ParticipanteRepository;

@Service
public class ParticipanteService {
    @Autowired
    private ParticipanteRepository participanteRepository;

    public List<Participante> listarTodos() {
        return participanteRepository.findAll();
    }

    public Participante salvar(Participante participante) {
        return participanteRepository.save(participante);
    }
}
