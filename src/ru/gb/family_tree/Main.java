package ru.gb.family_tree;

import java.time.LocalDate;
import java.util.List;

import static ru.gb.family_tree.Gender.Female;
import static ru.gb.family_tree.Gender.Male;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Human human1 = new Human("Alexander", "Pushkin", LocalDate.of(1730, 5, 21), LocalDate.of(1767, 11, 4), Male);
        Human human2 = new Human("Michael", "Pushkin", LocalDate.of(1732, 9, 17), LocalDate.of(1775, 2, 23), Male);
        Human human3 = new Human("Maria", "Pushkin", LocalDate.of(1700, 2, 25), LocalDate.of(1790, 5, 3), Female, human1, human2);
        Human human4 = new Human("Elena", "Pushkin", LocalDate.of(1735, 4, 13), LocalDate.of(1800, 3, 27), Female);
        human3.addChildren(human4);

        familyTree.addHumanInFamTree(human1);
        familyTree.addHumanInFamTree(human2);
        familyTree.addHumanInFamTree(human3);
        familyTree.addHumanInFamTree(human4);



//        System.out.println(human1);
//        System.out.println(human3);
        System.out.println(familyTree);

    }
}
