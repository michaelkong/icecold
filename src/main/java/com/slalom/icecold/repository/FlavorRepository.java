package com.slalom.icecold.repository;

import com.slalom.icecold.domain.Flavor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "flavors", collectionResourceRel = "flavors", itemResourceRel = "flavor")
public interface FlavorRepository extends MongoRepository<Flavor, String> {

    @Override
    @RestResource(exported = false)
    void delete(Flavor entity);

    List<Flavor> findByFlavorName(@Param("flavorName") String flavorName);
}
