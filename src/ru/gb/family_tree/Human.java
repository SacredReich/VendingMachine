package ru.gb.family_tree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dob, dod;

    private List<Human> childsArray;

    public Human(String firstName, String lastName, LocalDate dob, LocalDate dod, Gender gender) {
        this.childsArray = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.dod = dod;
        this.gender = gender;
    }

    public Human(String firstName, String lastName, LocalDate dob, LocalDate dod, Gender gender, Human children) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.dod = dod;
        this.childsArray.add(children);
        this.gender = gender;
    }

    public Human(String firstName, String lastName, LocalDate dob, LocalDate dod, Gender gender, Human... children) {
        this(firstName, lastName, dob, dod, gender);
        for (Human child : children) {
            this.childsArray.add(child);
        }
    }

    public void addChildren(Human children) {
        this.childsArray.add(children);
    }

    public void setDod(LocalDate dod) {
        this.dod = dod;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public LocalDate getDod() {
        return dod;
    }

    public List<Human> getChildsArray() {
        return childsArray;
    }



    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\n" + firstName + " " + lastName + ", " + gender + ", " + " (" + dob + " - " + dod + ")");
        if (childsArray.isEmpty()!=true){
            str.append("\nChilds: \n");
            for (int i = 0; i < childsArray.size(); i++) {

                if (i == childsArray.size()-1){
                    str.append(childsArray.get(i).firstName).append(" ").append(childsArray.get(i).lastName);
                }
                else str.append(childsArray.get(i).firstName).append(" ").append(childsArray.get(i).lastName).append(", ");
            }
        }
        String res = String.valueOf(str);
        return res;
    }
}

