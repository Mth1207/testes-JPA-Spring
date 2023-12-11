package teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import teste.entity.Fisica;

@Repository
public interface FisicaRepository extends JpaRepository<Fisica, Long>{

}
