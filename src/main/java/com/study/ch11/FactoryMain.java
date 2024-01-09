package com.study.ch11;

import com.study.ch02.ConstantMain;
import com.study.ch03.Function2;

public class FactoryMain {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("삼성");
        company.showCompanyInfo();

        SamsungCompany.name = "apple";
        SamsungCompany.showCompanyInfo();

        Phone phone1 = new Phone(company);
        Phone phone2 = new Phone(company);
        Phone phone3 = new Phone(company);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

    }
}
