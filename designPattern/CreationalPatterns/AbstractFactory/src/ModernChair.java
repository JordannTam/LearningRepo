public class ModernChair implements Chair{

    @Override
    public boolean hasLeg() {
        return true;
    }

    @Override
    public boolean hasFoot() {
        return false;
    }
}
