import java.util.*;

public class CollectionExample {
    public static void main(String[] args){
        // setExample();
        //fifoExample();
        //lifoExample();
        mapExample();
    }

    public static void mapExample(){
        Map<String,Integer> positiondurationmap = new HashMap<>();
        positiondurationmap.put("javadev",20);
        positiondurationmap.replace("javadev",15);
        positiondurationmap.put("python",15);
        positiondurationmap.put(".net",10);


        int javaDuration = positiondurationmap.get("javadev");
        System.out.println("javadev duration :" + javaDuration);
        Integer nonExsitentDuration = positiondurationmap.get("TEST");
        System.out.println("nonexsitent duration :" + nonExsitentDuration);
        int defaultDuration = positiondurationmap.getOrDefault("TEST",25);
        System.out.println("default deuration :" + defaultDuration);

        positiondurationmap.remove("python");
        Integer pythonduration = positiondurationmap.get("python");
        System.out.println("python duration : " + pythonduration);

        Set<Map.Entry<String ,Integer>> entrySet = positiondurationmap.entrySet();
        for (Map.Entry<String, Integer> entry: positiondurationmap.entrySet()){
            System.out.println("key : " + entry.getKey() + ", value: " + entry.getValue());
        }

        Set<String> keys = positiondurationmap.keySet();
        for (String key: keys){
            System.out.println("keys : " + key);
        }

        Collection<Integer> values = positiondurationmap.values();
        for (Integer val: values){
            System.out.println("values : " + val);
        }

    }


    //breath for search
    public  static void fifoExample(){
        Deque<Integer> deck = new LinkedList<>();
        int i = 0;
        deck.offer(i);
        while (!deck.isEmpty()){
            int value = deck.poll();
            System.out.println("value" + value);
            if (i<5){
                deck.offer(++i);
                deck.offer(++i);
            }
        }
    }
    //death for search
    public static void lifoExample(){
        int i = 0;
        Deque<Integer> deck = new ArrayDeque<>();
        deck.push(i);
        while (!deck.isEmpty()){
            int val = deck.pop();
            System.out.println("value:"+ val);
            if (i< 5){
                deck.push(++i);
                deck.push(++i);
            }
            System.out.println("deck state====" + deck.toString());
        }
    }

    public static void listExample() {
        List<Integer> list = new ArrayList<>(30);//TreeSet//LinkedList
        list.add(7);
        list.add(10);
        list.add(5);
        list.add(3);
        list.add(345);

        list.remove(0);
        list.add(0,25);
        for (Integer intvalue: list){
            System.out.println("intvalue:" + intvalue);
        }
        list.set(1,11);
        for (Integer intvalue: list){
            System.out.println("intvalue:" + intvalue);
        }
        if (list.contains(11)){
            System.out.println("list contains 11");
        }
        int index = list.indexOf(11);
        System.out.println("index of 11:" + index);

        List<Integer> sublist = list.subList(1,3);
        for (Integer intvalue: sublist){
            System.out.println("sublist intvalue:" + intvalue);
        }

    }
    public static void  setExample(){
        Set<Integer>  ints = new HashSet<>();//TreeSet<>();//linkedHashSet<>();

        ints.add(7);
        ints.add(10);
        ints.add(5);
        ints.add(3);
        ints.add(345);
       /* for (Integer intvalue: ints){
            System.out.println("intvalue:" + intvalue);
        }*/
        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext()){
            Integer val = iterator.next();
            System.out.println("iter value:" + val);
            if (val == 10){
                iterator.remove();
                System.out.println("removed the element 10");
            }

        }
        if(ints.contains(10)){
            System.out.println("ints set contains 10");

        } else {
            System.out.println("ints doesn't  contains 10");
        }

        int size = ints.size();
        ints.remove(7);
        if(ints.isEmpty()){
            System.out.println("ints is empty set");
        }
        else {
            System.out.println("ints is not empty");
        }
        Set<Integer> subInts = new TreeSet<>();
        subInts.add(0);
        subInts.add(10);
        if (ints.containsAll(subInts)){
            System.out.println("ints contain all elements");
        }
        else{
            System.out.println("ints doesn't contain all elements");
        }
        Set<Integer> newInts = Set.of(2,4,6,8);
    }
}

