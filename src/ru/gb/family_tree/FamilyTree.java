package ru.gb.family_tree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> familyTreeList = new ArrayList<>(); /* На 1 уроке в проекте автомата поля были просто с объявлением листа, а сама инициализация была отдельным конструктором ниже.
    Но у меня выходят ошибки. Зато если объявить прям в классе, как я сделал в 7 строчке - никаких проблем */

//    public FamilyTree() {   // Вот с этим конструктором проблема, описанная выше, он не работает, получается
//        List<Human> familyTreeList = new ArrayList<>();
//    }

    public void addHumanInFamTree(Human human){
        familyTreeList.add(human);
    }

    public Human findHuman(String firstName){
        for (Human el : familyTreeList) {
            if (el.getFirstName().equals(firstName)){
                return el;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Human el: familyTreeList) {
            str.append(el + "\n");
        }
        String res = String.valueOf(str);
        return res;
    }
}
