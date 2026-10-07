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
    
    public void setName(String neuName)
    {
        name = neuName;
    }
    public void setPlaetze(int neuPlaetze)
    {
        plaetze = neuPlaetze;
    }
    public void setMotorisiert(boolean neuMotorisiert)
    {
        motorisiert = neuMotorisiert;
    }
}