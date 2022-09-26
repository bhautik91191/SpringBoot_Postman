package com.person.repository;

import org.apache.ibatis.annotations.Mapper;
import com.person.model.Person;

@Mapper
public interface PersonRepository {

	public void insert(Person person);

}
