public class Adidas implements IFabricaEsportiva {

    public Adidas() {
    }

    @Override
    public ACamisa newCamisa() {
        return new Flamengo();
    }


    
}
