package advanced.polymorphism.model.dto;

public class AniBook extends Book{
    private int accessAge;

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    public AniBook(){
        super();
    }

    public AniBook(String title, String author, String publisher, int accessAge){
        super(title,author,publisher);
        this.accessAge= accessAge;
    }

    @Override
    public String toString() {
        return super.toString() + " | 연령 제한 : " + accessAge;
    }
}
