package org.acme.repositories;

import org.acme.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * |** @author 'Gihan Rathnayaka'**|
 */
@Repository
public interface UserRepositpry extends JpaRepository<User,Long> {
}
