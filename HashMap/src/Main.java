public class Main {
    public static void main(String[] args) {
        HashMap myHashMAP = new HashMap();
        myHashMAP.put("1","Marinich value1");
        myHashMAP.put("2","Marinich value2");
        myHashMAP.put("3","Marinich value3");
        myHashMAP.put("4","Marinich value4");
        myHashMAP.put("4","Marinich value44");
        System.out.println(myHashMAP.get("2"));
        System.out.println(myHashMAP.get("3"));
        System.out.println(myHashMAP.get("1"));
        System.out.println(myHashMAP.get("4"));
        System.out.println(myHashMAP.isEmpty());
        System.out.println(myHashMAP.size());
    }
}
