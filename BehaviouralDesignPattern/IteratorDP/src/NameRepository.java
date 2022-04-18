public class NameRepository {

    private String[] names = {"saumya", "neha", "shruti", "mamma", "daddy"};

    public Iterator getIterator(){
        return new NameIterator(names);
    }
}
