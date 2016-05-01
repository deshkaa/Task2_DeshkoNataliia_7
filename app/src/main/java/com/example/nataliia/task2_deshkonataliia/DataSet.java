package com.example.nataliia.task2_deshkonataliia;

import java.io.Serializable;
import java.util.ArrayList;

public class DataSet implements Serializable {

    private String mDataTitle;
    private String mDataAddress;
    private String mDataDate;
    private String mDataDaysNumber;
    private int mDataLikesNumber;
    private int mDataImageResourceId;
    private String mData1, mData2;
    private String mMainText;
    private String mResponsible;
    private String mStatus;
    private String mTitleNumber;

    public DataSet(String title,
                   String address,
                   String date,
                   String daysNumber,
                   int likesNumber,
                   int imageResId,
                   String data1,
                   String data2,
                   String mainText,
                   String responsible,
                   String status,
                   String titleNumber) {

        mDataTitle = title;
        mDataAddress = address;
        mDataDate = date;
        mDataDaysNumber = daysNumber;
        mDataLikesNumber = likesNumber;
        mDataImageResourceId = imageResId;
        mData1 = data1;
        mData2 = data2;
        mMainText = mainText;
        mResponsible = responsible;
        mStatus = status;
        mTitleNumber = titleNumber;
    }

    public static ArrayList<DataSet> setDataInProgress() {
        ArrayList<DataSet> dataSet = new ArrayList<>();
        dataSet.add(new DataSet("В роботі: Демонтаж інших об'єктів, що входять до переліку малих", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_send, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 1", "Дніпропетровський МВК", "В роботі","1"));
        dataSet.add(new DataSet("В роботі: Питання стововно нарахування боргу за електроенергії", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_gallery, "42 лютого 2016", "13 лютого 2016", "Опис проблеми 2", "Дніпропетровський МВК", "В роботі","2"));
        dataSet.add(new DataSet("В роботі: Ремонт та обслуговування ліфтів", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_camera, "15 лютого 2016", "13 лютого 2016", "Опис проблеми 3", "Дніпропетровський МВК", "В роботі","3"));
        dataSet.add(new DataSet("В роботі: Прибирання та санітарний стан території", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-12 днів", 50, R.drawable.ic_menu_manage, "16 лютого 2016", "13 лютого 2016", "Опис проблеми 4", "Дніпропетровський МВК", "В роботі","4"));
        dataSet.add(new DataSet("В роботі: Комунальне господарство", "Вул. Б.Кротова, 22, Дніпропетровськ", "Лют. 09, 2016", "-7 днів", 51, R.drawable.ic_menu_share, "17 лютого 2016", "13 лютого 2016", "Опис проблеми 5", "Дніпропетровський МВК", "В роботі","5"));
        dataSet.add(new DataSet("В роботі: Благоустрій та будівництво", "Дніпропетровськ, Вул. Олеся Гончара, 2", "Лют. 08, 2016", "-6 днів", 50, R.drawable.ic_menu_slideshow, "18 лютого 2016", "13 лютого 2016", "Опис проблеми 6", "Дніпропетровський МВК", "В роботі","6"));
        dataSet.add(new DataSet("В роботі: Благоустрій та будівництво", "Пр. Богдана Хмельницького, 54", "Лют. 05, 2016", "-6 днів", 51, R.drawable.ic_plus, "19 лютого 2016", "13 лютого 2016", "Опис проблеми 7", "Дніпропетровський МВК", "В роботі","7"));
        dataSet.add(new DataSet("В роботі: Дорожна служба", "Вул. Черниченка, 2, Дніпропетровськ", "Лют. 10, 2016", "-7 днів", 5, R.drawable.ic_menu_applications_24dp, "20 лютого 2016", "13 лютого 2016", "Опис проблеми 8", "Дніпропетровський МВК", "В роботі","8"));
        dataSet.add(new DataSet("В роботі: Водопостачання та роботи по водоочищенню", "Дніпропетровськ, Вул. Винниченка, 15", "Лют. 15, 2016", "-6 днів", 1, R.drawable.ic_menu_send, "22 лютого 2016", "13 лютого 2016", "Опис проблеми 9", "Дніпропетровський МВК", "В роботі","9"));
        dataSet.add(new DataSet("В роботі: Проведення верхових робіт", "Пр. Слобожанський, 90", "Лют. 22, 2016", "-6 днів", 2, R.drawable.ic_menu_camera, "12 лютого 2016", "23 лютого 2016", "Опис проблеми 10", "Дніпропетровський МВК", "В роботі","10")); //[Comment] Hardcode

        return dataSet;
    }

    public static ArrayList<DataSet> setDataDone() {
        ArrayList<DataSet> dataSet = new ArrayList<>();
        dataSet.add(new DataSet("Зроблено: Демонтаж інших об'єктів, що входять до переліку малих", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_send, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 11", "Дніпропетровський МВК", "Виконано","11"));
        dataSet.add(new DataSet("Зроблено: Питання стововно нарахування боргу за електроенергії", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_gallery, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 12", "Дніпропетровський МВК", "Виконано","12"));
        dataSet.add(new DataSet("Зроблено: Ремонт та обслуговування ліфтів", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_camera, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 13", "Дніпропетровський МВК", "Виконано","13"));
        dataSet.add(new DataSet("Зроблено: Прибирання та санітарний стан території", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-12 днів", 50, R.drawable.ic_menu_manage, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 14", "Дніпропетровський МВК", "Виконано","14"));
        dataSet.add(new DataSet("Зроблено: Комунальне господарство", "Вул. Б.Кротова, 22, Дніпропетровськ", "Лют. 09, 2016", "-7 днів", 51, R.drawable.ic_menu_share, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 15", "Дніпропетровський МВК", "Виконано","15"));
        dataSet.add(new DataSet("Зроблено: Благоустрій та будівництво", "Дніпропетровськ, Вул. Олеся Гончара, 2", "Лют. 08, 2016", "-6 днів", 50, R.drawable.ic_menu_slideshow, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 16", "Дніпропетровський МВК", "Виконано","16"));
        dataSet.add(new DataSet("Зроблено: Благоустрій та будівництво", "Пр. Богдана Хмельницького, 54", "Лют. 05, 2016", "-6 днів", 51, R.drawable.ic_plus, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 17", "Дніпропетровський МВК", "Виконано","17"));
        dataSet.add(new DataSet("Зроблено: Дорожна служба", "Вул. Черниченка, 2, Дніпропетровськ", "Лют. 10, 2016", "-7 днів", 5, R.drawable.ic_menu_applications_24dp, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 18", "Дніпропетровський МВК", "Виконано","18"));
        dataSet.add(new DataSet("Зроблено: Водопостачання та роботи по водоочищенню", "Дніпропетровськ, Вул. Винниченка, 15", "Лют. 15, 2016", "-6 днів", 1, R.drawable.ic_menu_send, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 19", "Дніпропетровський МВК", "Виконано","19"));
        dataSet.add(new DataSet("Зроблено: Проведення верхових робіт", "Пр. Слобожанський, 90", "Лют. 22, 2016", "-6 днів", 2, R.drawable.ic_menu_camera, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 20", "Дніпропетровський МВК", "Виконано","20"));

        return dataSet;
    }

    public static ArrayList<DataSet> setDataWaiting() {
        ArrayList<DataSet> dataSet = new ArrayList<>();
        dataSet.add(new DataSet("Очікує: Демонтаж інших об'єктів, що входять до переліку малих", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_send, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 21", "Дніпропетровський МВК", "Очікується","21"));
        dataSet.add(new DataSet("Очікує: Питання стововно нарахування боргу за електроенергії", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_gallery, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 22", "Дніпропетровський МВК", "Очікується","22"));
        dataSet.add(new DataSet("Очікує: Ремонт та обслуговування ліфтів", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-14 днів", 49, R.drawable.ic_menu_camera, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 23", "Дніпропетровський МВК", "Очікується","23"));
        dataSet.add(new DataSet("Очікує: Прибирання та санітарний стан території", "Вул. Вадима Гетьмана, 42", "Кві 26, 2016", "-12 днів", 50, R.drawable.ic_menu_manage, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 24", "Дніпропетровський МВК", "Очікується","24"));
        dataSet.add(new DataSet("Очікує: Комунальне господарство", "Вул. Б.Кротова, 22, Дніпропетровськ", "Лют. 09, 2016", "-7 днів", 51, R.drawable.ic_menu_share, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 25", "Дніпропетровський МВК", "Очікується","25"));
        dataSet.add(new DataSet("Очікує: Благоустрій та будівництво", "Дніпропетровськ, Вул. Олеся Гончара, 2", "Лют. 08, 2016", "-6 днів", 50, R.drawable.ic_menu_slideshow, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 26", "Дніпропетровський МВК", "Очікується","26"));
        dataSet.add(new DataSet("Очікує: Благоустрій та будівництво", "Пр. Богдана Хмельницького, 54", "Лют. 05, 2016", "-6 днів", 51, R.drawable.ic_plus, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 27", "Дніпропетровський МВК", "Очікується","27"));
        dataSet.add(new DataSet("Очікує: Дорожна служба", "Вул. Черниченка, 2, Дніпропетровськ", "Лют. 10, 2016", "-7 днів", 5, R.drawable.ic_menu_applications_24dp, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 28", "Дніпропетровський МВК", "Очікується","28"));
        dataSet.add(new DataSet("Очікує: Водопостачання та роботи по водоочищенню", "Дніпропетровськ, Вул. Винниченка, 15", "Лют. 15, 2016", "-6 днів", 1, R.drawable.ic_menu_send, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 29", "Дніпропетровський МВК", "Очікується","29"));
        dataSet.add(new DataSet("Очікує: Проведення верхових робіт", "Пр. Слобожанський, 90", "Лют. 22, 2016", "-6 днів", 2, R.drawable.ic_menu_camera, "12 лютого 2016", "13 лютого 2016", "Опис проблеми 30", "Дніпропетровський МВК", "Очікується","30"));

        return dataSet;
    }

    public String getmDataTitle() {
        return mDataTitle;
    }

    public String getmDataAddress() {
        return mDataAddress;
    }

    public String getmDataDate() {
        return mDataDate;
    }

    public String getmDataDaysNumber() {
        return mDataDaysNumber;
    }

    public int getmDataLikesNumber() {
        return mDataLikesNumber;
    }

    public int getmDataImageResourceId() {
        return mDataImageResourceId;
    }

    public String getmStatus() {
        return mStatus;
    }

    public String getmResponsible() {
        return mResponsible;
    }

    public String getmData1() {
        return mData1;
    }

    public String getmData2() {
        return mData2;
    }

    public String getmTitleNumber() {
        return mTitleNumber;
    }

    public String getmMainText() {
        return mMainText;
    }
}
