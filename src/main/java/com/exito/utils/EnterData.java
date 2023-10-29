package com.exito.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class EnterData {
    private static ArrayList<Map<String, String>> data= new ArrayList<>();
    public static ArrayList<Map<String, String>> extractTo() {
        try {
            data = DataExcel.leerDatosDeHojaDeExcel("src/main/resources/dataExcel/SearchProduct.xlsx", "SelectProduct");
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
