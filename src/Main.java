import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void somarIdade(int idadeHomem1, int idadeHomem2, int idadeMulher1, int idadeMulher2) {

        int homemMaisVelho;
        int homemMaisNovo;
        int mulherMaisVelha;
        int mulherMaisNova;

        if (idadeHomem1 > idadeHomem2) {
            homemMaisNovo = idadeHomem2;
            homemMaisVelho = idadeHomem1;
        } else {
            homemMaisNovo = idadeHomem1;
            homemMaisVelho = idadeHomem2;
        }

        if (idadeMulher1 > idadeMulher2) {
            mulherMaisNova = idadeMulher2;
            mulherMaisVelha = idadeMulher1;
        } else {
            mulherMaisNova = idadeMulher1;
            mulherMaisVelha = idadeMulher2;
        }

        System.out.println("Homem mais velho com mulher mais nova: " + (homemMaisVelho + mulherMaisNova));
        System.out.println("Homem mais novo com mulher mais velha: " + (homemMaisNovo + mulherMaisVelha));

    }

    public static void imprimirSequencia() {

        for (int i = 1; i < 10; i += 2) {
            System.out.print("(" + i + ",");
            for (int j = 1; j <= 10; j++) {
                System.out.print(" " + j);
            }
            System.out.print(") ");
        }
        System.out.println();

    }

    public static List<Integer> uniaoOrdenadaDeArrays(int[] array1, int[] array2) {
        int i = 0;
        int j = 0;
        final var uniao = new ArrayList<Integer>();

        while (i < array1.length && j < array2.length) {
            while ((i < array1.length - 1) && (array1[i] == array1[i + 1])) {
                i++;
            }

            while ((j < array2.length - 1) && (array2[j] == array2[j + 1])) {
                j++;
            }

            if (array1[i] < array2[j]) {
                uniao.add(array1[i++]);
            } else if (array1[i] > array2[j]) {
                uniao.add(array2[j++]);
            } else {
                uniao.add(array1[i]);
                i++;
                j++;
            }
        }

        while (i < array1.length) {
            if (i < array1.length - 1 && array1[i] == array1[i + 1]) {
                i++;
            } else {
                uniao.add(array1[i++]);
            }
        }

        while (j < array2.length) {
            if (j < array2.length - 1 && array2[j] == array2[j + 1]) {
                j++;
            } else {
                uniao.add(array2[j++]);
            }
        }

        return uniao;
    }


    public static void main(String[] args) {

        somarIdade(20, 40, 34, 37);

        imprimirSequencia();

        int[] array1 =  {2, 2, 5, 7, 10, 15};
        int[] array2 = {1, 1, 2, 3, 4, 4, 4, 5, 6, 8, 9, 10, 20, 31};
        var uniao = uniaoOrdenadaDeArrays(array1, array2);

        System.out.println("União dos arrays: " + uniao);

    }

}