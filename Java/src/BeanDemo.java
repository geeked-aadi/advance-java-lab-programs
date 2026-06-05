import java.beans.*;
public class BeanDemo {
    public static void main(String[] args)throws Exception{
        BeanInfo b =Introspector.getBeanInfo(Employee.class);
        PropertyDescriptor[] pd = b.getPropertyDescriptors();
        for(PropertyDescriptor i:pd){
            System.out.println("Property Method: "+i.getName());
            System.out.println("Getter Method: "+i.getReadMethod());
        }
    }
}
