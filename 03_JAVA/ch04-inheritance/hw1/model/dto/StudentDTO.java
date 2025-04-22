package advanced.hw1.model.dto;

public class StudentDTO extends PersonDTO{

    private int grade;
    private String major;

    public StudentDTO(){
        super();
    }
    public StudentDTO(String name, int age,double height, double weight,int grade, String major){
        super(age,height,weight);
        super.setName(name);

        this.grade = grade;
        this.major = major;

    }

    @Override
    public String information(){
        return "이름: " + super.getName() + " 나이: " + super.getAge() + " 키: " + super.getHeight() + " 몸무게: " + super.getWeight() + " 학년: " + grade + " 학과: " + major;
    }

}
