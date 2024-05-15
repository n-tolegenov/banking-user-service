package kz.almaty.finance.bankinguserservice.model.entity;

import jakarta.persistence.*;
import kz.almaty.finance.bankinguserservice.model.dto.Status;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authId;
    private String identification;

    @Enumerated(EnumType.STRING)
    private Status status;
}
