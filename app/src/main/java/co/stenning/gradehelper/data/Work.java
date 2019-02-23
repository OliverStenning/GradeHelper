package co.stenning.gradehelper.data;

public class Work {

    private String name;
    private String type;
    private double weight;
    private double grade;
    private double scaledGrade;

    public Work(String name, String type, double weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.grade = 0;
        this.scaledGrade = 0;
    }

    public void updateGrade(double percentage) {
        setGrade(percentage);
        setScaledGrade((percentage / 100) * weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getScaledGrade() {
        return scaledGrade;
    }

    public void setScaledGrade(double scaledGrade) {
        this.scaledGrade = scaledGrade;
    }
}
