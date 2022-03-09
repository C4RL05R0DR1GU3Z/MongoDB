package org.ada.school.user.repository;

import org.ada.school.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User,Long>
{
    User save (User user);
    User findById (String id);
}

