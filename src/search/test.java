package search;

public class test{
    public static void main(String[] args) {
        String className = "search.Hero";
        try{
//            Class pClass1 = Class.forName(className);
            Class pClass3=new Hero().getClass();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
