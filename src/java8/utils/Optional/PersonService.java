package java8.utils.Optional;

import java.util.Optional;

/**
 * Created by maxiaogang on 2017/8/6.
 */
public class PersonService {

    public String getCarInsuranceName(Person person){
        Optional<Person> personOptional = Optional.ofNullable(person);
        return personOptional.flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElse("UNKNOW");
    }
}
