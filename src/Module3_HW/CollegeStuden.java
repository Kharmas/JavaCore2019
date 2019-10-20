package Module3_HW;

public class CollegeStuden extends Student {

    String collegeName;
    int rating;
    long id;

    public CollegeStuden(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStuden(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStuden (String collegeName,int rating,long id){
        super(null,null,null);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

}




