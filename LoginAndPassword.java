import java.util.Scanner;

public class LoginAndPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин:");
        String login = scanner.nextLine();

        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        System.out.println("Повторите пароль:");
        String confirmPassword = scanner.nextLine();

        boolean isValid = validateLoginAndPassword(login, password, confirmPassword);

        if (isValid) {
            System.out.println("Логин и пароль подходят.");
        } else {
            System.out.println("Ошибка: логин и пароль должны быть длиной меньше 20 символов и содержать только латинские буквы, цифры и знак подчеркивания, или пароли не совпадают.");
        }
    }

    private static boolean validateLoginAndPassword(String login, String password, String confirmPassword) {
// Проверка длины меньше 20 символов
        if (login.length() >= 20 || password.length() >= 20 || confirmPassword.length() >= 20) {
            return false;
        }

// Проверка наличия запрещенных символов
        String regex = "^[a-zA-Z0-9_]+$";
        if (!login.matches(regex) || !password.matches(regex) || !confirmPassword.matches(regex)) {
            return false;
        }

// Проверка совпадения паролей
        return password.equals(confirmPassword);
    }
}