import java.util.*;

public class GenericOverloading {
    public static String classify(Set<?> s){
        return "Set";
    }

    public static String classify(List<?> lst){
        return "List";
    }

    public static String classify(Collection<?> c){
        return "Unknown Collection";
    }

    public static void main(String[] args){
        Collection<?>[] collections = { new HashSet<String>(), new ArrayList<Integer>(), new HashMap<String, String>().values() };
        for( Collection<?> c : collections ) {
            System.out.println(classify(c));
        }
        System.out.println(classify(new HashSet<String>()));
        System.out.println(classify(new ArrayList<Integer>()));
        System.out.println(classify(new HashMap<String, String>().values()));
    }
}