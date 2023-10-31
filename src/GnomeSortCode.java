import java.util.Arrays;
import java.util.Random;

public class GnomeSortCode {

    // Gera e retorna um array de números aleatorios de 0 a 999
    static int[] createRandomArray(int size) {
        int array[] = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++)
            array[i] = random.nextInt(1000);

        return array;
    }

    // Ordena o array e retorna o tempo de execução em segundos
    static long gnomeSort(int array[]) {
        long start = System.currentTimeMillis();

        for (int index = 1; index < array.length;) {
            if (array[index] >= array[index - 1]) index++;
            else {
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                if (index > 1)
                    index--;
            }
        }

        return (System.currentTimeMillis() - start) / 1000;
    }

    public static void main(String[] args) {
        int array[] = createRandomArray(10000);
        long timeGnomeSort = gnomeSort(array);
        
        System.out.println("Array ordenado: " + Arrays.toString(array));
        System.out.println("Tempo de execução da ordenação: " + timeGnomeSort);
    }
}
