package sk.umb.luiza.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.umb.luiza.domain.model.GarbageType;
import sk.umb.luiza.domain.model.MovementAction;
import sk.umb.luiza.domain.repository.MovementActionsRepository;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class MovementActionsService {

    private MovementActionsRepository movementActionsRepository;

    @Autowired
    public void setMovementActionsRepository(MovementActionsRepository movementActionsRepository) {
        this.movementActionsRepository = movementActionsRepository;
    }

    public void moveToDestination(String destination, String garbageType) {
        movementActionsRepository.save(new MovementAction(destination, GarbageType.valueOf(garbageType), false, false));
    }

    public List<MovementAction> getAllMovementActions() {
        List<MovementAction> actions = movementActionsRepository.findAllByProcessed(false);
        actions.forEach(a -> a.setProcessed(true));
        return actions;
    }

    public void machineArrived(UUID movementActionId) {
        MovementAction movement = movementActionsRepository.findById(movementActionId).orElse(null);
        if (movement == null) {
            throw new RuntimeException("There is no movement with this id!");
        }
        movement.setArrived(true);
        movementActionsRepository.save(movement);
    }


}
