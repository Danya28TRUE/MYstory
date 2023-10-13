//имрортируем массив и сканер
import java.util.Arrays;
import java.util.Scanner;
//создаем публичный класс
public class PYZIREK {
    public static void main (String[] args) {
        //arturchik очень полезен
        Scanner arturchik = new Scanner(System.in);
        //массив с числами
        int [] masive = {2,1,4,5,6,78,23,0,321};

        //присваиваем POMA значение false
        boolean POMA = false;
        int buf;
        //цикл whill
        while(!POMA) {
            //POMA определяет отсортировался массив или нет
            POMA = true;
            //цикл for
            for (int i = 0; i < masive.length-1; i++) {
                if(masive[i] > masive[i+1]){
                    POMA = false;

                    //меняем индексы если POMA неправ
                    buf = masive[i];
                    masive[i] = masive[i+1];
                    masive[i+1] = buf;

                }
            }
        }
        //выводит массив с правильной последовательностью чисел
        System.out.println(Arrays.toString(masive));
    }
}