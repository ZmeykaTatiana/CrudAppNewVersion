package zmey.DAO;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import zmey.model.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int COUNT;
    List<Person> people;

    {
        people=new ArrayList<>();
        people.add(new Person(++COUNT,"NANA"));
        people.add(new Person(++COUNT,"Tanja"));
        people.add(new Person(++COUNT,"Lecha"));
        people.add(new Person(++COUNT,"Kuna"));
    }
    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(Person->Person.getId() ==id).findAny().orElse(null);
    }
}
