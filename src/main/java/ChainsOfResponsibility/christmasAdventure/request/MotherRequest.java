package ChainsOfResponsibility.christmasAdventure.request;

import ChainsOfResponsibility.christmasAdventure.shelf.Shelf;

public class MotherRequest {
    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }
}
