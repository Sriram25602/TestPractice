package MapAndTypes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

    public static void main(String[] args) {
        //Random order
        Map<String, Integer> employeeIds = new HashMap<>();

        employeeIds.put("Sriram", 101);
        employeeIds.put("Ram", null);
        employeeIds.put("Sri", 103);

        System.out.println(employeeIds);

        //Add new record

        employeeIds.put("Tester", 104);
        //OR
        employeeIds.putIfAbsent("Srir", 192);

        System.out.println(employeeIds);

        //Modify value of a key
        employeeIds.put("Sriram", 100);
        //Or
        employeeIds.replace("Sriram", 110);
        System.out.println(employeeIds);

        //print value of key
        System.out.println(employeeIds.get("Sriram"));

        //Check Value
        System.out.println(employeeIds.containsValue(1102));
        System.out.println(employeeIds.containsKey("Sriram2"));
        System.out.println(employeeIds.size());
        TreeMapTest();
        LinkedHashMapTest();

    }

    public static void TreeMapTest(){
        //Sorted in ascending order
        Map<Integer,String> emp = new TreeMap<>();
        emp.put(3, "Tester");
        emp.put(1, "Admin");
        emp.put(5, "SuperAdmin");
        System.out.println(emp);
        System.out.println();
    }
    public static void LinkedHashMapTest(){
        Map<String, Integer> emp = new LinkedHashMap<>();
        emp.put("Tester", 1);
        emp.put("Admin", 2);
        emp.put("SuperAdmin", 3);
        System.out.println(emp.values());
    }
}
