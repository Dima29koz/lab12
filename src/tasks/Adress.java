package tasks;

import java.util.StringTokenizer;

public class Adress {
    private String country;
    private String region;
    private String town;
    private String street;
    private String building;
    private String housing;
    private String apartment;

    public void getAdress_a(String adress){
        String[] tmp = adress.split(", ");
        if (tmp.length >= 7){
            country = tmp[0];
            region = tmp[1];
            town = tmp[2];
            street = tmp[3];
            building = tmp[4];
            housing = tmp[5];
            apartment = tmp[6];
        }

    }

    public void getAdress_b(String adress){
        StringTokenizer tmp = new StringTokenizer(adress, ",.;");
        if (tmp.countTokens() >= 7){
            country = tmp.nextToken().trim();
            region = tmp.nextToken().trim();
            town = tmp.nextToken().trim();
            street = tmp.nextToken().trim();
            building = tmp.nextToken().trim();
            housing = tmp.nextToken().trim();
            apartment = tmp.nextToken().trim();
        }
    }


    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", housing='" + housing + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
