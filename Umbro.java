public class Umbro implements IFabricaEsportiva{

    public Umbro() {
    }

    @Override
    public ACamisa newCamisa() {
        return new Fluminense();
    }


    
}
