package dev.tanto;

public class NameDict {
    String hunName;
    String itName;
    public NameDict(){}
    public NameDict(String hunName, String itName){
        this.hunName = hunName;
        this.itName = itName;
    }
    public String getHunName() {
        return hunName;
    }
    public void setHunName(String hunName) {
        this.hunName = hunName;
    }
    public String getItName() {
        return itName;
    }
    public void setItName(String itName) {
        this.itName = itName;
    }
    
}
