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
    
    //Seestern - 6 Plaetze: true
    //Moewe - 4 Plaetze: false
    //Poseidon - 12 Plaetze: true
    
    public Boot(String name,int plaetze, boolean motorisiert)
    {
        this.name = name;
        this.plaetze = plaetze;
        this.motorisiert = motorisiert;
    }
    public String printBoot()
    {
        return (name+" Boot: "+plaetze+" Plaetze - "+motorisiert);
    }
}