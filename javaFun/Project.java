public class Project{
    private String name;
    private String description;
    private float cost;

    public Project(){}

    public Project(String name){
        this.name = name;
    }

    public Project(String name,String description){
        this.name = name;
        this.description = description;
    }

    public Project(String name,String description,float cost){
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}
    public void setDescription(String description){this.description = description;}
    public String getDescription(){return this.description;}
    public void setCost(float cost){this.cost = cost;}
    public float getCost(){return this.cost;}
    public String elevatorPitch(){
        return this.name+" ($"+this.cost+"): "+this.description;
    }
}