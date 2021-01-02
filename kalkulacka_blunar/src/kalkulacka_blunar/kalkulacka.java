
package kalkulacka_blunar;

public class kalkulacka {
    
    float posledny_vysledok;
    
      public float scitanie(float a, float b)
    {
        posledny_vysledok = a + b;
        return a + b;
    }
    
    public float odcitanie(float a, float b)
    {
        posledny_vysledok = a - b;
        return a - b;
    }
     
    public float delenie(float a, float b)
    {
        if(a == 0 || b == 0)
        {
            posledny_vysledok = 0;
            return 0;
        }
        else 
        {
        posledny_vysledok = a / b;
        return a / b;
        }
    }
      
    public float nasobenie(float a, float b)
    {
        if(a == 0 || b == 0)
        {
            posledny_vysledok = 0;
            return 0;
        }
        else 
        {
        posledny_vysledok = a * b;
        return a * b;
        }
    }
    
    public float get_posledny_vysledok()
    {
        return posledny_vysledok;
    }
    
}
