package co.stenning.gradehelper.data;

import java.util.ArrayList;

public class Module {

    private String code;
    private String name;
    private ArrayList<Work> work;

    public Module(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public double getGrade() {
        double grade = 0;
        for (int i = 0; i < work.size(); i++) {
            grade += work.get(i).getScaledGrade();
        }
        return grade;
    }



}
