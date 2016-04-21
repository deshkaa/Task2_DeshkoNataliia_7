package com.example.nataliia.task2_deshkonataliia;

import java.io.Serializable;
import java.util.ArrayList;

public class DataSet implements Serializable{

    public String dataTitle;
    public String dataAddress;
    public String dataDate;
    public String dataDaysNumber;
    public int dataLikesNumber;
    public int dataImageResourceId;

    public DataSet(String title,
                   String address,
                   String date,
                   String daysNumber,
                   int likesNumber,
                   int imageResId) {

        dataTitle = title;
        dataAddress = address;
        dataDate = date;
        dataDaysNumber = daysNumber;
        dataLikesNumber = likesNumber;
        dataImageResourceId = imageResId;
    }

    public ArrayList<String> getArrayList(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(dataTitle);
        arrayList.add(dataAddress);
        arrayList.add(dataDate);
        arrayList.add(dataDaysNumber);
        return arrayList;
    }

    public static ArrayList<DataSet> setDataInProgress() {
        ArrayList<DataSet> dataSet = new ArrayList<>();
        dataSet.add(new DataSet("В роботі: Демонтаж інших об'єктів, що входять до переліку малих", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_send));
        dataSet.add(new DataSet("В роботі: Питання стововно нарахування боргу за електроенергії", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_gallery));
        dataSet.add(new DataSet("В роботі: Ремонт та обслуговування ліфтів", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_camera));
        dataSet.add(new DataSet("В роботі: Прибирання та санітарний стан території", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-12 днів", 50, R.drawable.ic_menu_manage));
        dataSet.add(new DataSet("В роботі: Комунальне господарство", "Вул. Б.Кротова, 22, Дніпропетровськ", "Лют. 09, 2016", "-7 днів", 51, R.drawable.ic_menu_share));
        dataSet.add(new DataSet("В роботі: Благоустрій та будівництво", "Дніпропетровськ, Вул. Олеся Гончара, 2", "Лют. 08, 2016", "-6 днів", 50, R.drawable.ic_menu_slideshow));
        dataSet.add(new DataSet("В роботі: Благоустрій та будівництво", "Пр. Богдана Хмельницького, 54", "Лют. 05, 2016", "-6 днів", 51, R.drawable.ic_plus));
        dataSet.add(new DataSet("В роботі: Дорожна служба", "Вул. Черниченка, 2, Дніпропетровськ", "Лют. 10, 2016", "-7 днів", 5, R.drawable.ic_menu_applications_24dp));
        dataSet.add(new DataSet("В роботі: Водопостачання та роботи по водоочищенню", "Дніпропетровськ, Вул. Винниченка, 15", "Лют. 15, 2016", "-6 днів", 1, R.drawable.ic_menu_send));
        dataSet.add(new DataSet("В роботі: Проведення верхових робіт", "Пр. Слобожанський, 90", "Лют. 22, 2016", "-6 днів", 2, R.drawable.ic_menu_camera));

        return dataSet;
    }

    public static ArrayList<DataSet> setDataDone() {
        ArrayList<DataSet> dataSet = new ArrayList<>();
        dataSet.add(new DataSet("Зроблено: Демонтаж інших об'єктів, що входять до переліку малих", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_send));
        dataSet.add(new DataSet("Зроблено: Питання стововно нарахування боргу за електроенергії", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_gallery));
        dataSet.add(new DataSet("Зроблено: Ремонт та обслуговування ліфтів", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_camera));
        dataSet.add(new DataSet("Зроблено: Прибирання та санітарний стан території", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-12 днів", 50, R.drawable.ic_menu_manage));
        dataSet.add(new DataSet("Зроблено: Комунальне господарство", "Вул. Б.Кротова, 22, Дніпропетровськ", "Лют. 09, 2016", "-7 днів", 51, R.drawable.ic_menu_share));
        dataSet.add(new DataSet("Зроблено: Благоустрій та будівництво", "Дніпропетровськ, Вул. Олеся Гончара, 2", "Лют. 08, 2016", "-6 днів", 50, R.drawable.ic_menu_slideshow));
        dataSet.add(new DataSet("Зроблено: Благоустрій та будівництво", "Пр. Богдана Хмельницького, 54", "Лют. 05, 2016", "-6 днів", 51, R.drawable.ic_plus));
        dataSet.add(new DataSet("Зроблено: Дорожна служба", "Вул. Черниченка, 2, Дніпропетровськ", "Лют. 10, 2016", "-7 днів", 5, R.drawable.ic_menu_applications_24dp));
        dataSet.add(new DataSet("Зроблено: Водопостачання та роботи по водоочищенню", "Дніпропетровськ, Вул. Винниченка, 15", "Лют. 15, 2016", "-6 днів", 1, R.drawable.ic_menu_send));
        dataSet.add(new DataSet("Зроблено: Проведення верхових робіт", "Пр. Слобожанський, 90", "Лют. 22, 2016", "-6 днів", 2, R.drawable.ic_menu_camera));

        return dataSet;
    }

    public static ArrayList<DataSet> setDataWaiting() {
        ArrayList<DataSet> dataSet = new ArrayList<>();
        dataSet.add(new DataSet("Очікує: Демонтаж інших об'єктів, що входять до переліку малих", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_send));
        dataSet.add(new DataSet("Очікує: Питання стововно нарахування боргу за електроенергії", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_gallery));
        dataSet.add(new DataSet("Очікує: Ремонт та обслуговування ліфтів", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_camera));
        dataSet.add(new DataSet("Очікує: Прибирання та санітарний стан території", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-12 днів", 50, R.drawable.ic_menu_manage));
        dataSet.add(new DataSet("Очікує: Комунальне господарство", "Вул. Б.Кротова, 22, Дніпропетровськ", "Лют. 09, 2016", "-7 днів", 51, R.drawable.ic_menu_share));
        dataSet.add(new DataSet("Очікує: Благоустрій та будівництво", "Дніпропетровськ, Вул. Олеся Гончара, 2", "Лют. 08, 2016", "-6 днів", 50, R.drawable.ic_menu_slideshow));
        dataSet.add(new DataSet("Очікує: Благоустрій та будівництво", "Пр. Богдана Хмельницького, 54", "Лют. 05, 2016", "-6 днів", 51, R.drawable.ic_plus));
        dataSet.add(new DataSet("Очікує: Дорожна служба", "Вул. Черниченка, 2, Дніпропетровськ", "Лют. 10, 2016", "-7 днів", 5, R.drawable.ic_menu_applications_24dp));
        dataSet.add(new DataSet("Очікує: Водопостачання та роботи по водоочищенню", "Дніпропетровськ, Вул. Винниченка, 15", "Лют. 15, 2016", "-6 днів", 1, R.drawable.ic_menu_send));
        dataSet.add(new DataSet("Очікує: Проведення верхових робіт", "Пр. Слобожанський, 90", "Лют. 22, 2016", "-6 днів", 2, R.drawable.ic_menu_camera));

        return dataSet;
    }
}
