package HashMap;


public class Main {
    public static void main(String[] args) {
        HashMapGeneric newHashMap = new HashMapGeneric();
        newHashMap.put("1","Igor1");
        newHashMap.put("2","Igor2");
        newHashMap.put("3","Igor3");
        newHashMap.put("4","Igor4");
        System.out.println(newHashMap.get("1"));
        System.out.println(newHashMap.get("3"));
        System.out.println(newHashMap.get("4"));
        System.out.println(newHashMap.get("2"));
        newHashMap.remove("1");
        newHashMap.remove("2");
        System.out.println(newHashMap.get("1"));
        System.out.println(newHashMap.get("2"));
    }
}
