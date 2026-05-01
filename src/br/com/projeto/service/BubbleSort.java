package service;


public class BubbleSort {

    public static void bubbleSort(Produto[] lista) {
        int n = lista.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (lista[j].getId() > lista[j + 1].getId()) {
                    Produto temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                    trocou = true;
                }
            }

            if (!trocou) break;
        }
    }


}