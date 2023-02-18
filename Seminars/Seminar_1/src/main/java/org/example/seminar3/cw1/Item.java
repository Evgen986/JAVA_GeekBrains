package org.example.seminar3.cw1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Даны сведения об экспортируемых товарах:
 * указывается наименование товара,
 * страна, экспортирующая товар,
 * и объем поставляемой партии в штуках.
 * Найти страны, которые экспортируют данный товар, и общий объем его экспорта.
 */

@AllArgsConstructor
@Data
public class Item {

    private String item;
    private String countryName;
    private int value;



    public static void main(String[] args) {

    }
}
