package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Atividade;
import repository.AtividadeRepository;

@Service
public class AtividadeService {
    @Autowired
    private AtividadeRepository atividadeRepository;

    public List<Atividade> listarTodas() {
        return atividadeRepository.findAll();
    }

    public Atividade salvar(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }
}