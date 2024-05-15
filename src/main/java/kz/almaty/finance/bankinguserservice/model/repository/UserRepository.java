package kz.almaty.finance.bankinguserservice.model.repository;

import kz.almaty.finance.bankinguserservice.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
