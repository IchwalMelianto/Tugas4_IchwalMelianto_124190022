package com.example.buttonnavigation;

import java.util.ArrayList;

public class CatalogData {
    private static  String[] namaData = new String[]{"Logitech G203 Blue", "Logitech G502 Hero White", "Logitech G703 Hero White", "Logitech G304 KDA", "Logitech G305 Lilac", "Logitech G603 Basic", "Logitech G604 Basic", "Logitech G903 Basic"};

    private static int[] gambarData = new int[]{R.drawable.mouse_1, R.drawable.mouse_2, R.drawable.mouse_3, R.drawable.mouse_4, R.drawable.mouse_5, R.drawable.mouse_6, R.drawable.mouse_7, R.drawable.mouse_8};

    public static ArrayList<CatalogModel> getListDataM(){
        CatalogModel catModel = null;
        ArrayList<CatalogModel> listMouse = new ArrayList<CatalogModel>();
        for ( int i = 0; i < namaData.length; i++){
            catModel = new CatalogModel();
            catModel.setGambarItem(gambarData[i]);
            catModel.setNamaItem(namaData[i]);
            listMouse.add(catModel);
        }
        return listMouse;
    }
}