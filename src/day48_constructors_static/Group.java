package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<String> memebers = new ArrayList<>();
    //constructor that accepts a name
    public Group (String name){
        this.name= name;
        memebers= new ArrayList<>();
    }

    public void addMemeber(String newName ){
        memebers.add(newName);
    }
    public void removeMembers(String nameToRemove){
        memebers.remove(nameToRemove);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", memebers=" + memebers +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMemebers() {
        return memebers;
    }

    public void setMemebers(List<String> memebers) {
        this.memebers = memebers;
    }
}
