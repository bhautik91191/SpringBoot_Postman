package com.person.services;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;
import com.person.model.Person;
import com.person.repository.PersonRepository;
import com.person.util.DbSession;

@Component
public class PersonServiceImpl implements PersonService {

	private PersonRepository personRepository;

	private SqlSessionFactory sqlSessionFactory;

	private SqlSession sqlSession;

	public PersonServiceImpl() {
		sqlSessionFactory = DbSession.getSqlSessionFactory(); 
	}

	@Override
	public void insert(Person person) {
		try {
			sqlSession = sqlSessionFactory.openSession();
			personRepository = sqlSession.getMapper(PersonRepository.class);
			personRepository.insert(person); // Inserted data in database
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

}
