package com.apsiworktracking.apsiworktracking.repository;

import com.apsiworktracking.apsiworktracking.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>
{

}
