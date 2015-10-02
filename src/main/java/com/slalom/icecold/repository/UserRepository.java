package com.slalom.icecold.repository;

import com.slalom.icecold.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource(collectionResourceRel = "users", path = "users", itemResourceRel = "user")
public interface UserRepository extends MongoRepository<User, String> {
    @Override
    @RestResource(exported = false)
    void delete(User entity);

    User findUserByLastName(@Param("lastName") String lastName);
}
