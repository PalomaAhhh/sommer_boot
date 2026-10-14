public class Boot
{
    private String name;
    private int plaetze;
    private boolean motorisiert;
    
    public String getName()
    {
        return name;
    }
    public int getPlaetze()
    {
        return plaetze;
    }
    public boolean getMotorisiert()
    {
        return motorisiert;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPlaetze(int plaetze)
    {
        if (plaetze >= 1 && plaetze <= 5000)
        {
        this.plaetze = plaetze;
        }
    }
    
    public void setMotorisiert(boolean motorisiert)
    {
        this.motorisiert = motorisiert;
    }
    
    public Boot()
    {
        name = "UNKN";
        plaetze = 0;
        motorisiert = false;
    }
}