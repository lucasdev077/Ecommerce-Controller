package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Long> {
}

