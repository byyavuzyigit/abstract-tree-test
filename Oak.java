public class Oak extends Tree{

    public Oak(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public int getType(){
        return this.type;
    }
    public void setType(int type){
        this.type = 2;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int compareTo(Tree oakTree){

        String nameOne = this.getName();
        String nameTwo = oakTree.getName();
        int name_compare = nameOne.compareTo(nameTwo);
        if(name_compare<0)
            return -2;
        if(name_compare>0)
            return 2;
        if(this.getAge()<oakTree.getAge())
            return -1;
        if(this.getAge()>oakTree.getAge())
            return 1;
        String addOne = this.getAddress();
        String addTwo = oakTree.getAddress();
        int address_compare = addOne.compareTo(addTwo);
        if(address_compare<0)
            return -3;
        if(address_compare>0)
            return 3;

        return 0;
    }
    public void printMessage(){
        System.out.println("This is an Oak tree named <" + this.getName() +">!");
    }
    public String toString(){
        String line1 = "Type: Oak";
        String line2 = "Name:<" + this.getName() + ">";
        String line3 = "Age:<" + this.getAge() + ">";
        String line4 = "Address:<" + this.getAddress() + ">";
        String info = line1 + "\n" + line2 + "\n" + line3 + "\n" + line4;
        return info;
    }
}