package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String name, int storage, String diskType) {
        super(name, storage, diskType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void readDisc() {
        System.out.println("This is a DVD disc!");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
