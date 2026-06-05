import java.io.Serializable;
public class Employee implements Serializable {
    private int id;
    private String name;
    Employee(){}
    public void setId(int id){this.id=id;}
    public int putId(){return id;}
    public void setName(String name){this.name=name;}
    public String putName(){
        return name;
    }
}
