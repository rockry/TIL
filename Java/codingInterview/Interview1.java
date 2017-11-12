import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

class Interview1 {
    public static void listQuestion() {
        // 저 아래 뭐가 출력 될까?
        // 왜 그렇지?
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    
        for (int i= 0; i < list.size(); i++) {
            System.out.println("remove : " + list.remove(i));
        }
    
        System.out.println(list.get(0));
    }

    public static void setQuestion() {
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

    
        for (int i= 0; i < set.size(); i++) {
            System.out.println("remove : " + set.remove(i));
        }
    
        System.out.println(set.toString());
        
    }

    public static void main(String[] args) {
        listQuestion();
        setQuestion();
    }
}

