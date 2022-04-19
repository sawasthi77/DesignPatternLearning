import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<String> customerNames;

    public Database(){
        this.customerNames = new ArrayList<>();
        this.customerNames.add("Sam");
        this.customerNames.add("Brian");
        this.customerNames.add("Honda");
        this.customerNames.add("Champs");
    }

    public boolean existCustomer(String name){
        for( String s : customerNames){
            if( s.equalsIgnoreCase(name))
                return true;
        }
        return false;
    }
}
