package com.slalom.icecold.repository;

import com.slalom.icecold.domain.UserAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource(collectionResourceRel = "users", path = "users", itemResourceRel = "user")
public interface UserRepository extends MongoRepository<UserAccount, String> {
    @Override
    @RestResource(exported = false)
    void delete(UserAccount entity);

    UserAccount findUserByUserName(@Param("userName") String userName);
}
