package ek.osnb.dockerspring.repository;

import ek.osnb.dockerspring.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
