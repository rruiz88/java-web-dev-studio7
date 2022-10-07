package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD ceedee = new CD("music", 800, "CD");
        DVD deeveedee = new DVD("movie",3000,"Blu-Ray");
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        ceedee.spinDisc();
        deeveedee.spinDisc();
        ceedee.readDisc();
        deeveedee.readDisc();

        System.out.println(ceedee.toString());

    }
}
