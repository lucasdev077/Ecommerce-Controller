package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import model.Participante;
import service.ParticipanteService;

@RestController
@RequestMapping("/participantes")
@RequiredArgsConstructor
public class ParticipanteController {
    private final ParticipanteService participanteService = new ParticipanteService();

    @GetMapping
    public List<Participante> listarTodos() {
        return participanteService.listarTodos();
    }

    @PostMapping
    public Participante criar(@RequestBody Participante participante) {
        return participanteService.salvar(participante);
    }
    
}

	
