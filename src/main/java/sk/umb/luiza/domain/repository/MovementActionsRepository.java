package sk.umb.luiza.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.umb.luiza.domain.model.MovementAction;

import java.util.List;
import java.util.UUID;

@Repository
public interface MovementActionsRepository extends JpaRepository<MovementAction, UUID> {
    List<MovementAction> findAllByProcessed(boolean type);
}
