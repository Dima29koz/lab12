package tasks;

public class Person {
    private String name;
    private String fam;
    private String second_name;

    public Person(String name, String fam, String second_name) {
        this.name = name;
        this.fam = fam;
        this.second_name = second_name;
    }
    public Person(String fam) {
        this.name = null;
        this.fam = fam;
        this.second_name = null;
    }
    public Person(String name, String fam) {
        this.name = name;
        this.fam = fam;
        this.second_name = null;
    }

    String fio(){
        StringBuilder str = new StringBuilder().append(fam);
        if (name != null || second_name != null)
        {
            str.append(" ");
            if (name != null){
                str.append(name.substring(0,1)).append(".");
            }
            if (second_name != null){
                str.append(second_name.substring(0, 1)).append(".");
            }
        }

        return str.toString();
    }
}
