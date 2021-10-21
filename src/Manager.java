public class Manager extends Worker {

    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSuborinates) {
        this.numberOfSubordinates = numberOfSuborinates;
    }

    @Override
    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates()/100 * 3);
        }
    }

}
