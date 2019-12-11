package Entities;

import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType> {
    List<PersonType> personList;

    public People () {}

    public void add (PersonType person){
        this.personList.add(person);
    }

    public void remove (PersonType person){
        this.personList.remove(person);
    }

    public Integer size (List<PersonType> personList){
        return this.personList.size();
    }

    public void clear (List<PersonType> personList) {
        this.personList.clear();
    }

    public List<PersonType> addAll (List<PersonType> personList, Iterable<PersonType> people){
        for(PersonType person : people){
            personList.add(person);
        }
        return personList;
    }

    public PersonType findById (List<PersonType> personList, long id) {
        for (int i = 0; i < personList.size(); i++) {
             if(personList.get(i).getId().equals(id));
             return personList.get(i);
        }
        return null;
    }

    public List<PersonType> findAll (){
        return this.personList;
    }
}
