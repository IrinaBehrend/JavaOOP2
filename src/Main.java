public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker(10000, "Dina");
        Manager manager = new Manager(12000, "Tina", 2);
        Director director = new Director(12000, "Lina", 3);

        Worker[] workers = {worker, manager, director};
        Manager[] managers = {manager, director};

        System.out.println(EmployeeUtils.findByName("Irina", workers).getName());
        System.out.println(EmployeeUtils.findBySubName("in", workers).getName());
        System.out.println(EmployeeUtils.getMinSubordinates(managers).getName());
    }
}
