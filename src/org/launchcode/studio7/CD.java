package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{


    public CD(String name, int storage, String diskType) {
        super(name, storage, diskType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void readDisc() {
        System.out.println("This is a CD disc!");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
