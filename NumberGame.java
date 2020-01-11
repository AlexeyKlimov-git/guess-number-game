// Импортируем библиотеку Scanner для реализации ввода данных поьзователем
import java.util.Scanner;

// Создаем основной класс
public class NumberGame {

    // Создаем main метод для старта программы
    public static void main (String [] args){
        //  Math.random() генерирует случайное число от 0 до 1, умножаем на 100 для получения целого числа
        // добавляем 1 чтобы не генерировалось в итоге число 0
        // переопредеелние (int) необходимо чтобы отбросить дробную часть
        int randomNumber = (int) (Math.random() * 100) + 1;

        // создаем будеву переменную для индикации выигрыша/проигрыша
        boolean hasWon = false;

        // Выводим на экран сообщения пользователю
        System.out.println("I have a randomly chosen number between 1 and 100.");
        System.out.println("Try to guess it.");

        // Проверяем какое значение принимает randomNumber
        //System.out.println(randomNumber);

       // Создаем переменную, которую определяет пользователь
        // Защиты от ввода некорректного типа данных не предусмотрено
        Scanner scanner = new Scanner (System.in);

        // Вводим цикл для отсчитывания десяти попыток
        for (int i=10; i>0; i--) {
            System.out.println("You have " + i + " guess(es) left. Choose again:");
            int guess = scanner.nextInt();
            //System.out.println("Your guess was: " +guess);

            if (randomNumber < guess) {
                System.out.println("It's smaller than  " + guess + ".");
            }
            else if (randomNumber > guess) {
                System.out.println("It's greater than  " + guess + ".");
            }
            else {
                hasWon = true;
                break;
            }
        }

        // СОздаем цикл для подведения итогов игры
        if (hasWon){
            System.out.println("Correct... You win !");
        } else {
            System.out.println("Game over... You lose !");
            System.out.println("The number was " +  randomNumber);
        }
    }
}
