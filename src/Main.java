public class Main {
    public static void main(String[] args) {

        // Task #1
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName  + " " + firstName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);

        // Task #2
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName);

        //Task #3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}