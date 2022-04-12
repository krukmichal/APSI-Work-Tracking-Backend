package com.apsiworktracking.apsiworktracking.service;

import com.apsiworktracking.apsiworktracking.model.Person;
import com.apsiworktracking.apsiworktracking.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService
{
    private final PersonRepository personRepository;

    public List<Person> getPersons()
    {
        return personRepository.findAll();
    }

    public Person getPerson(Long id)
    {
        return personRepository.findById(id).orElse(null);
    }

    public Person createPerson(Person person)
    {
        return personRepository.save(person);
    }

    public Person updateUser(Long id, Person person)
    {
        Person personToUpdate = personRepository.findById(id).orElse(null);
        if (personToUpdate != null)
        {
            personToUpdate.setLogin(person.getLogin());
            personToUpdate.setPassword(person.getPassword());
            return personRepository.save(personToUpdate);
        }
        return null;
    }

    public void deletePerson(Long id)
    {
        personRepository.deleteById(id);
    }
}
