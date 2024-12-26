public class DefaultStrategyImpl implements Strategy {
    @Override
    public void apply() {
        System.out.println("***** Noyau de l'opération en utilisant la strategy défaut *****");
    }
}
