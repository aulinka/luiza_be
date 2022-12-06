package sk.umb.luiza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.umb.luiza.controller.dto.MovementActionDto;
import sk.umb.luiza.domain.model.MovementAction;
import sk.umb.luiza.service.MovementActionsService;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.UUID;

@RestController
public class MovementActionsController {

    private MovementActionsService movementActionsService;

    @Autowired
    public void setMovementActionsService(MovementActionsService movementActionsService) {
        this.movementActionsService = movementActionsService;
    }


    @GetMapping("/reach/{destination}/{garbage-type}")
    public ResponseEntity<?> moveToDestination(@PathVariable("destination") String destination, @PathVariable("garbage-type") String garbageType){
        movementActionsService.moveToDestination(destination, garbageType);
        return new ResponseEntity<>("Moving to destination: " + destination + " for garbage: " + garbageType, HttpStatus.valueOf(201));
    }

    // pre riadiacu jednotku
    public List<MovementAction> getAllMovementActions(){
        return movementActionsService.getAllMovementActions();
    }

    // pre backend -> poslat response aj na frontend
    @PostMapping("/reach")
    public ResponseEntity<?> machineArrived(@RequestBody MovementActionDto movementActionDto){
        movementActionsService.machineArrived(UUID.fromString(movementActionDto.getMovementActionId()));
        return new ResponseEntity<>("Machine arrived to destination", HttpStatus.valueOf(200));
    }
}
