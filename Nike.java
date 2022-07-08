public class Nike implements IFabricaEsportiva {

    public Nike() {
    }

    @Override
    public ACamisa newCamisa() {
        return new Brasil();
    }

    
}
