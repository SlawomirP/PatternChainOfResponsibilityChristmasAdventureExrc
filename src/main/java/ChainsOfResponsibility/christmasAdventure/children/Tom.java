package ChainsOfResponsibility.christmasAdventure.children;

import ChainsOfResponsibility.christmasAdventure.request.MotherRequest;
import ChainsOfResponsibility.christmasAdventure.shelf.Shelf;

public class Tom extends Child{
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.MEDIUM)){
            System.out.println("Tom has taken jar off the shelf  ");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
