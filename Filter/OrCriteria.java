package Filter;

import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Person> otherCriteriaPersons = otherCriteria.meetCriteria(persons);
        otherCriteriaPersons.stream()
                .filter(person -> !firstCriteriaPersons.contains(person))
                .forEach(firstCriteriaPersons::add);
        return firstCriteriaPersons;
    }
}
