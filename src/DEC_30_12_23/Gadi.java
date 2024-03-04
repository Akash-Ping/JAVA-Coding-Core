package DEC_30_12_23;

public class Gadi {

    Gadi manufacture(){
        System.out.println("Gadi Lelo");
        return new Gadi();
    }
}

class Ford extends Gadi{
    @Override
    Ford manufacture() {
        System.out.println("Ford ki gadi");
        return new Ford();
    }
}
