package Practice2;

public class EducationalInstitution {
    private int years;
    int duration;

    public EducationalInstitution(int duration) {
        this.duration = duration;
    }

    public String graduationRequirements() {
        return duration + " years of study";
    }
}

class LawSchool extends EducationalInstitution {

    public LawSchool() {
        super(3);
    }

    @Override
    public String graduationRequirements() {
        return duration + " years of study";

    }
}