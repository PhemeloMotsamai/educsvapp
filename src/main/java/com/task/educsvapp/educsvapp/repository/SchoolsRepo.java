package com.task.educsvapp.educsvapp.repository;

import com.task.educsvapp.educsvapp.model.Schools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SchoolsRepo extends CrudRepository<Schools, Long> {
}
