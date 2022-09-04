package ChainsOfResponsibility.christmasAdventure.children;

import ChainsOfResponsibility.christmasAdventure.request.MotherRequest;
import ChainsOfResponsibility.christmasAdventure.shelf.Shelf;

public class Anthony extends Child{
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.HIGH)){
            System.out.println("Anthony has taken jar off the shelf  ");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
