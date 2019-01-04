package Composite;

public abstract class Entry {
    private String  road;
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatMentException{
        throw new FileTreatMentException();
    }
    public void printList(){
        prinList("");
    }
    protected abstract void prinList(String str);
    public String toString(){
        return getName() + "(" +getSize() + ")";
    }
    public void setRoad( String string){
        road = string + "/" + getName();
    }
    public String getRoad(){
        return road;
    }
}
