import java.util.HashMap;

public class position extends Person {
    String pname;
    int id;
    int salary;
    boolean is_open;


    public position() {

    }



    public static position position(int id, String pname, boolean is_open) {

        return null;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public String setPname(String pname) {
        this.pname = pname;
        return pname;
    }


    position(int id,String pname, boolean is_open) {
        this.pname = pname;
        this.is_open = is_open;
        this.id = id;

    }

    boolean is_open() {
        return true;
    }



}
/*public class position extends Person {
    int id;
    String name;
    boolean is_open;
    static HashMap<Integer,position> positionHashMap=getPositionIdMap();



    position(){
        super(phoneno,emailid);
        if(positionHashMap==null){



            positionHashMap=new HashMap<Integer,position>();
            position position1=new position(1,"Intern",true);
            position position2=new position(2,"Trainee",true);
            position position3=new position(3,"Developer",true);
            position position4=new position(4,"Tech lead",false);



            positionHashMap.put(1,position1);
            positionHashMap.put(2,position2);
            positionHashMap.put(3,position3);
            positionHashMap.put(4,position4);
        }
    }
    private static HashMap<Integer,position> getPositionIdMap() {
        return positionHashMap;
    }
    position(int id, String name, boolean is_open){
        super(phoneno,emailid);
        this.id=id;
        this.name=name;
        this.is_open=is_open;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isIs_open() {
        return is_open;
    }
    public void setIs_open(boolean is_open) {
        this.is_open = is_open;
    }
    public position getOpenPosition(int id)
    {
        position position=positionHashMap.get(id);
        if(position !=null && position.isIs_open()){
            return position;
        }
        return null;
    }
}*/