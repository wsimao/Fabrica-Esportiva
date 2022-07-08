public class Puma implements IFabricaEsportiva {

    public Puma() {
    }

    @Override
    public ACamisa newCamisa() {
        return new Botafogo();
    }

    
}
