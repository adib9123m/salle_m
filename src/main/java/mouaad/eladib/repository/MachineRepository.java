package mouaad.eladib.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mouaad.eladib.controle.model.Machine;
import mouaad.eladib.controle.model.Salle;

public interface MachineRepository extends JpaRepository<Machine, Long> {
    List<Machine> findBySalle(Salle salle);
}
