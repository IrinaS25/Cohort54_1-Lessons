package consultation_16.main;

import consultation_16.main.model.CategoryBakeryProducts;
import consultation_16.main.model.BakeryProducts;

import java.util.ArrayList;

public class ListApp {
    public static void main(String[] args) {

        // мини хранилище

        //int numberArray = new int[10];
        //numberArray[0] = 24;
        //numberArray[1] = 29;
        //numberArray[2] = 31;

        //String[] stringArray = new String[10];
        //stringArray[0] = "Sergej";
        //stringArray[1] = "Ivan";
        //stringArray[2] = "Petr";

        //String[] goodsArray = {"Bread", "Cake", "Croissant"};

        ArrayList<BakeryProducts> bakeryProductsList = new ArrayList<>();

        // создание товаров
        BakeryProducts product1 = new BakeryProducts("Litovskij", CategoryBakeryProducts.BREAD, 3.25);
        BakeryProducts product2 = new BakeryProducts("Belorusskij", CategoryBakeryProducts.BREAD, 4.25);
        BakeryProducts product3 = new BakeryProducts("Franzuskij", CategoryBakeryProducts.CAKE, 5.25);

        System.out.println(bakeryProductsList.size());

        // добавление товаров в хранилище
        bakeryProductsList.add(product1);
        bakeryProductsList.add(product2);
        bakeryProductsList.add(product3);

        System.out.println(bakeryProductsList.size());

        for (BakeryProducts products : bakeryProductsList) {
            System.out.println(products);


        }
    }}
