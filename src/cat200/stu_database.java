package cat200;
public class stu_database {
    private String cubicle_id, name, date, supervisor;
    private int matric;
    public stu_database(String a, String b, int c, String d, String e){cubicle_id=a; name=b; matric=c; date=d; supervisor=e;}
    public String getCubicle_id(){return cubicle_id;}
    public String getName(){return name;}
    public int getMatric(){return matric;}
    public String getDate(){return date;}
    public String getSupervisor(){return supervisor;}
    public String toString(){return cubicle_id+" "+name+" "+matric+" "+date+" "+supervisor;}
}
