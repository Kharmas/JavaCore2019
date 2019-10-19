package Module3_HW;

public class CollegeStuden extends Student {

    String collegeName;
    int rating;
    long id;

    public CollegeStuden(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }



}
