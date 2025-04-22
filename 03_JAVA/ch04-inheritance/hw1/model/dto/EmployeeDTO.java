package advanced.hw1.model.dto;

public class EmployeeDTO extends PersonDTO{
    private int salary;
    private String dept;

    public EmployeeDTO(){
        super();
    }

    public EmployeeDTO(String name, int age, double height,double weight, int salary, String dept ){
        super(age,height,weight);
        super.setName(name);
        this.salary = salary;
        this.dept = dept;
    }
    @Override
    public String information(){
        return "이름: " + super.getName() + " 나이: " + super.getAge() + " 키: " + super.getHeight() + " 몸무게: " + super.getWeight() + " 월급: " + salary + " 부서: " + dept;
    }
}
