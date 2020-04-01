package HashMap;

import java.util.*;

public class TestListMap {

    public static void main(String[] args) {

        List<String> divisionOfBangladesh= new ArrayList<>();

        divisionOfBangladesh.add("Dhaka");
        divisionOfBangladesh.add("Rajshahi");
        divisionOfBangladesh.add("Khula");
        divisionOfBangladesh.add("Chattogram");

        List<String> districtOfBangladesh =new ArrayList<>();

        districtOfBangladesh.add("Naogaon");
        districtOfBangladesh.add("Natore");
        districtOfBangladesh.add("Bagura");
        districtOfBangladesh.add("Dinajpur");

        List<String> upazilaOfBangladesh = new ArrayList<>();

        upazilaOfBangladesh.add("Raninagor");
        upazilaOfBangladesh.add("Shantahar");
        upazilaOfBangladesh.add("Lalpur");
        upazilaOfBangladesh.add("Porsha");

        Map <String,List<String>> allAboutBangladesh = new LinkedHashMap<>();

        allAboutBangladesh.put("Division", divisionOfBangladesh);
        allAboutBangladesh.put("District", districtOfBangladesh);
        allAboutBangladesh.put("Upazila:", upazilaOfBangladesh);

        for (Map.Entry country:allAboutBangladesh.entrySet()) {

            System.out.println(country.getKey()+ " "+ country.getValue());
        }

        
    }

}
