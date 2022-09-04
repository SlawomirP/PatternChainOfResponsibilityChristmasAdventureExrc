package ChainsOfResponsibility.christmasAdventure.children;

import ChainsOfResponsibility.christmasAdventure.request.MotherRequest;
import ChainsOfResponsibility.christmasAdventure.shelf.Shelf;

public class Ann extends Child{
    @Override
    public void processRequest(MotherRequest motherRequest) {
        //jeżeli shelf z requesta zawiera LOW to:
        if(motherRequest.getShelf().equals(Shelf.LOW)){
            System.out.println("Ann has taken jar off the shelf  ");
        } else { // przekazanie
            getTallerChild().processRequest(motherRequest);
        }
    }
}
