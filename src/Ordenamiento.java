public class Ordenamiento {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int k = 3; // Encuentra los primeros 3 elementos más pequeños

        // Llama a la función de selección tópica
        selectTopK(arr, k);

        // Imprime los primeros k elementos
        System.out.println("Los primeros " + k + " elementos más pequeños son:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectTopK(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambia el elemento mínimo con el elemento en la posición actual
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
