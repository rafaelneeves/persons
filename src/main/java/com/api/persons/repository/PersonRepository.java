    package com.api.persons.repository;

    import com.api.persons.entity.Person;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface PersonRepository extends JpaRepository<Person, Long> {
    }
