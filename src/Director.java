public class Director extends Manager {

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates()/100 * 9);
        }
    }
}
