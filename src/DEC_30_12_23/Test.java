package DEC_30_12_23;

class Jungle {
    protected void makeNoise()
    {
        System.out.println("Jungle sound");
    }
}
class Cat extends Jungle
{
    public void makeNoise()
    {
        System.out.println("meow");
    }
}

public class Test{

}