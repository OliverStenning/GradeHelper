package co.stenning.gradehelper.data;

import java.util.ArrayList;

public class Module {

    private String code;
    private String name;
    private ArrayList<Work> work;

    public Module(String code, String name) {
        this.code = code;
        this.name = name;
        work = new ArrayList<>();
    }

    public double getGrade() {
        double grade = 0;
        for (int i = 0; i < work.size(); i++) {
            grade += work.get(i).getScaledGrade();
        }
        return grade;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Work> getWork() {
        return work;
    }

    public void setWork(ArrayList<Work> work) {
        this.work = work;
    }
}
