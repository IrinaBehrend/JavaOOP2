public class Manager extends Worker {

    private int numberOfSubordinates;

    public int getNumberOfSuborinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSuborinates(int numberOfSuborinates) {
        this.numberOfSubordinates = numberOfSuborinates;
    }

    @Override
    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        }
    }

}
