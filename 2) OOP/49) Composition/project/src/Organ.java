public class Organ {
    private String organName;
    private String organType;
    
    public Organ()
    {
        this.organName = "";
        this.organType = "";
    }
    public Organ(String on, String ot)
    {
        this.organName = on;
        this.organType = ot;
    }

    public String getOrganName()
    {
        return this.organName;
    }
    public String getOrganType()
    {
        return this.organType;
    }
    public void setOrganName(String on)
    {
        this.organName = on;
    }
    public void setOrganType(String ot)
    {
        this.organName = ot;
    }

    @Override
    public String toString()
    {
        return "Organ Name: "+this.organName+"\nOrganType: "+this.organType;
    }
}
