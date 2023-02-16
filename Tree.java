public abstract class Tree implements Comparable<Tree>{
     String name;
     String address;
     int age;
     int type;
    abstract int getType();
    abstract void setType(int type);
    abstract String getName();
    abstract void setName(String name);
    abstract String getAddress();
    abstract void setAddress(String address);
    abstract int getAge();
    abstract void setAge(int age);
    //abstract int compareTo(Tree t);
    abstract void printMessage();
    //abstract String toString();
}