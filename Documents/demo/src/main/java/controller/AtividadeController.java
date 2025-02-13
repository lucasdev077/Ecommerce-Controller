package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import model.Atividade;
import service.AtividadeService;

@RestController
@RequestMapping("/atividades")
@RequiredArgsConstructor
public class AtividadeController {
    private final AtividadeService atividadeService = new AtividadeService();

    @GetMapping
    public List<Atividade> listarTodas() {
        return atividadeService.listarTodas();
    }

    @PostMapping
    public Atividade criar(@RequestBody Atividade atividade) {
        return atividadeService.salvar(atividade);
    }
}

