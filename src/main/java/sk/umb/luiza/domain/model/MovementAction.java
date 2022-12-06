package sk.umb.luiza.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "movement_actions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovementAction extends UuidDomainObject {

    private String destination;

    @Enumerated(EnumType.STRING)
    private GarbageType garbageType;

    private boolean processed;

    private boolean arrived;
}
