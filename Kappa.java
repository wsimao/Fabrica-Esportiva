public class Kappa implements IFabricaEsportiva {

    public Kappa() {
    }

    @Override
    public ACamisa newCamisa() {
        return new Vasco();
    }

    
}
