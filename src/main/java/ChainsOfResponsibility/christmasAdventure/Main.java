package ChainsOfResponsibility.christmasAdventure;

import ChainsOfResponsibility.christmasAdventure.children.Ann;
import ChainsOfResponsibility.christmasAdventure.children.Anthony;
import ChainsOfResponsibility.christmasAdventure.children.Child;
import ChainsOfResponsibility.christmasAdventure.children.Tom;
import ChainsOfResponsibility.christmasAdventure.request.MotherRequest;
import ChainsOfResponsibility.christmasAdventure.shelf.Shelf;

public class Main {
    public static void main(String[] args) {
        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);

        Child tom = new Tom();
        Child ann = new Ann();
        Child anthony = new Anthony();

        tom.setTallerChild(ann);
        ann.setTallerChild(anthony);

        tom.processRequest(motherRequest);// anthony ma HIGH
    }
}
