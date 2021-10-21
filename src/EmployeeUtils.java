public class EmployeeUtils {

    public static Employee findByName(String name, Employee[] array) {
        for (int i =0; i < array.length; i++) {
            if (name.equals(array[i].getName())) {
                return array[i];
            }
        }
        return null;
    }
    public static Employee findBySubName(String subName, Employee[] array) {
        for (int i =0; i < array.length; i++) {
            if (array[i].getName().contains(subName)) {
                return array[i];
            }
        }
        return null;

}
