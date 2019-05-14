package project01.services;

public enum InfoBase {

    INSURANCE_COMPANY,
    COMPANY_ADDRESS,
    MANAGER_NAME,
    MANAGER_SURNAME,
    CLIENT_NAME,
    CLIENT_SURNAME,
    CLIENT_BIRTH_DATE,
    CLIENT_ADDRESS,
    CLIENT_PHONE_NUMBER,
    DEPOSIT_AMOUNT(100_000),
    INSURANCE_NUMBER(1000),
    DATE_OF_SIGNED,
    EXPIRATION_DATE,
    PREDICTION_COEFFICIENT(10),
    STATISTIC_COEFFICIENT(20),
    UNIQUE_PARAM(10),
    SIZE(10),
    MONEY_AMOUNT(100);

    private int num;

    InfoBase() {
    }


    InfoBase(int num) {
        this.num = num;
    }

    public static String generate(InfoBase BASE){
        switch (BASE){
            case INSURANCE_COMPANY:
                return insuranceCompany[generateValue(SIZE)];
            case COMPANY_ADDRESS:
            case CLIENT_ADDRESS:
                return address[generateValue(SIZE)];
            case MANAGER_NAME:
            case CLIENT_NAME:
                return names[generateValue(SIZE)];
            case MANAGER_SURNAME:
            case CLIENT_SURNAME:
                return surnames[generateValue(SIZE)];
            case CLIENT_BIRTH_DATE:
                return birthDates[generateValue(SIZE)];
            case CLIENT_PHONE_NUMBER:
                return phoneNumber[generateValue(SIZE)];
            case DATE_OF_SIGNED:
                return dateOfSign[generateValue(SIZE)];
            case EXPIRATION_DATE:
                return expirationDate[generateValue(SIZE)];
        }
        return null;
    }

    public static int generateValue(InfoBase parameter){
        return (int)(Math.random() * parameter.num);
    }


    private static final String[] insuranceCompany = new String[]{
            "ViDi Insurance",
            "European Union Insurance",
            "INGO Ukraine",
            "Insurance Planet",
            "AKB Garant",
            "Alianz Ukraine",
            "Amg Group",
            "AXA Insurance",
            "PZU Ukraine",
            "Utiko"
    };

    private static final String[] address = new String[]{
            "Odessa,Balkovskaia,22a",
            "Kyiv,Kazymira Malevycha,31",
            "Kyiv,Iamska,28",
            "Kyiv,Peremogy,65",
            "Kyiv,Peremogy,67",
            "Zaporizhia,Motorobudivnykiv,56",
            "Kyiv,Saksaganskogo,7",
            "Kyiv,Myrnogo,69",
            "Kyiv,Degtiarivska,3",
            "Kyiv,Peremogy,12"
    };

    private static final String[] names = new String[]{
            "Andrii",
            "Oleksii",
            "Vitalii",
            "Oksana",
            "Nataliia",
            "Iaroslav",
            "Anna",
            "Liudmyla",
            "Iurii",
            "Galyna"
    };

    private static final String[] surnames = new String[]{
            "Onyshchenko",
            "Kliui",
            "Lytovchenko",
            "Stognii",
            "Drutsul",
            "Nykolaichuk",
            "Basarab",
            "Sauliak",
            "Boyko",
            "Stetsenko"
    };

    private static final String[] birthDates = new String[]{
            "12-10-1970",
            "23-11-1980",
            "28-02-1977",
            "30-06-1983",
            "21-03-1987",
            "06-09-1988",
            "01-08-1991",
            "12-11-1997",
            "14-10-1963",
            "18-12-2000"
    };

    private static final String[] dateOfSign = new String[]{
            "12-10-2016",
            "12-11-2016",
            "30-10-2017",
            "23-05-2017",
            "12-03-2015",
            "05-01-2016",
            "09-10-2016",
            "02-11-2017",
            "13-10-2017",
            "22-04-2016"
    };

    private static final String[] expirationDate = new String[]{
            "12-10-2018",
            "12-11-2018",
            "30-10-2018",
            "23-05-2019",
            "12-03-2020",
            "05-01-2018",
            "09-10-2019",
            "02-11-2018",
            "13-10-2021",
            "22-04-2018"
    };

    private static final String[] phoneNumber = new String[]{
            "+380969381214",
            "+380509381774",
            "+380969654214",
            "+380969388492",
            "+380959340914",
            "+380979130514",
            "+380639473014",
            "+380673928102",
            "+380669399271",
            "+380993235812"
    };
}
