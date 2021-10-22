public class Main {

    public static void printName(IName[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName());
        }
    }

    public static void main(String[] args) {

        Worker worker = new Worker(10000, "Dina");
        Manager manager = new Manager(12000, "Victor", 2);
//        Director director = new Director(12000, "Lina", 3);

//        Worker[] workers = {worker, manager, director};
//        Manager[] managers = {manager, director};

        Employee[] arr = {worker, manager};

        IName[] arr2 = {worker, MonthHelper.MONTHS[0]};

        printName(arr2);


//        System.out.println(EmployeeUtils.findByName("Irina", workers).getName());
//        System.out.println(EmployeeUtils.findBySubName("ct", workers).getName());
//        System.out.println(EmployeeUtils.getMinSubordinates(managers).getName());
    }
}
