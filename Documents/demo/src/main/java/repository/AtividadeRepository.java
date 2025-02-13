package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
}

