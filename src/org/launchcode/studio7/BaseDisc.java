package org.launchcode.studio7;

import java.util.List;

public abstract class BaseDisc {
  private String name;
   private int storage;
   private String diskType;


    public BaseDisc(String name, int storage, String diskType){
        this.name = name;
        this.storage = storage;
        this.diskType = diskType;
    }
}
