package mouaad.eladib.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mouaad.eladib.controle.model.Machine;
import mouaad.eladib.controle.model.Salle;
import mouaad.eladib.repository.MachineRepository;

@RestController
@RequestMapping("/api/machines")
public class MachineController {
    @Autowired
    private MachineRepository machineRepository;
    @Autowired
    public MachineController(MachineRepository machineRepository) {
        this.machineRepository = machineRepository;
    }


    @GetMapping("/salle/{salleId}")
    public List<Machine> getMachinesBySalle(@PathVariable Long salleId) {
        Salle salle = new Salle();
        salle.setId(salleId);
        return machineRepository.findBySalle(salle);
    }
}

