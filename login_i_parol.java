import java.util.Scanner;
public class login_i_parol {
    public static void main (String[]args){
        Scanner scaner = new Scanner(System.in);

        //правила
        System.out.println("Правила которые вы должны соблюдать при введении логина и пароля:");
        System.out.println("1.Ваш логин и пароль не должны превышать длину в 20 символов.");
        System.out.println("2.Ваш логин и пароль должны содержать только латинские буквы, цифры и знак подчеркивания");
        System.out.println();

        //логин
        System.out.println("Введите ваш логин: ");
        String login = scaner.nextLine();
        System.out.println();

        String regex = "^[a-zA-Z0-9_]+$";
        if(login .length() >=20 || !login.matches(regex)){
            System.out.println("Ваш логин нарушает правила.");
            System. exit(0);
        }

        //пароль
        System.out.println("Введите ваш пароль: ");
        String password = scaner.nextLine();

        if(password .length() >=20 || !password.matches(regex)){
            System.out.println("Ваш пароль нарушает правила.");
            System. exit(0);
        }

        //подтверждение пароля
        System.out.println("Подтвердите ваш пароль: ");
        String confirm_password = scaner.nextLine();

        if(confirm_password.length() >=20 || !confirm_password.matches(regex)){
            System.out.println("Ваш пароль нарушает правила.");
            System. exit(0);
        }

        //проверка совпадения паролей
        if(password.equals(confirm_password)){
            System.out.println("Добро пожаловать");
            System. exit(0);
        }
        else {
            System.out.println("Ваши пароли не совпадают.");
            System. exit(0);
        }
    }
}
