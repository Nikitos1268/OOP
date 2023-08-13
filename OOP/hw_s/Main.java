package hw_s;

import java.io.IOException;

import hw_s.model.FamilyTree;
import hw_s.model.Human;
import hw_s.model.IO;
import hw_s.model.comporator.HumanComporatorByAge;
import hw_s.presenter.Presenter;
import hw_s.ui.Console;
import hw_s.ui.View;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree<Human> familyTree = new FamilyTree<>();

        familyTree.addFamilyTree(new Human("Никита", "муж", 34));
        familyTree.addFamilyTree(new Human("Прядко Владимир Анатольевич", "муж", 56));
        familyTree.getByName("никита");

        View view = new Console();
        IO serialize = new IO();
        HumanComporatorByAge sortAge =  new HumanComporatorByAge();
        new Presenter(view, familyTree, serialize, sortAge);
        view.start();

    }
}
