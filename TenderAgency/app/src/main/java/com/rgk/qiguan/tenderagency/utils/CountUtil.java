package com.rgk.qiguan.tenderagency.utils;

/**
 * Description:
 * Copyright  : Copyright (c) 2016
 * Company    : RGK
 * Author     : qi.guan
 * Date       : 2017/7/19 11:02
 */

public class CountUtil {

    /**
     * 工程招标
     * @param money
     * @return
     */
    public static double projectCount(double money){
        double result = 0;
        if (money <= 100 ){
            result = money*0.01;
        } else if (money > 100 && money <= 500){
            double x = money - 100;
            double y = x*0.007;
            result = y + 1;
        } else if (money > 500 && money <= 1000){
            double x = money - 500;
            double y = x*0.0055;
            result = y + 1 + 2.8;
        } else if (money > 1000 && money <= 5000){
            double x = money - 1000;
            double y = x*0.0035;
            result = y + 1 + 2.8 + 2.75;
        } else if (money > 5000 && money <= 10000){
            double x = money - 5000;
            double y = x*0.002;
            result = y + 1 + 2.8 + 2.75 + 14;
        } else if (money > 10000 && money <= 100000){
            double x = money - 10000;
            double y = x*0.0005;
            result = y + 1 + 2.8 + 2.75 + 14 + 10;
        } else if (money > 100000){
            double x = money - 100000;
            double y = x*0.0001;
            result = y + 1 + 2.8 + 2.75 + 14 + 10 + 45;
        }
        return result;
    }

    /**
     * 货物招标
     * @param money
     * @return
     */
    public static double goodsCount(double money){

        double result = 0;

        if (money <= 100 ){
            result = money*0.015;
        } else if (money > 100 && money <= 500){
            double x = money - 100;
            double y = x*0.011;
            result = y + 1.5;
        } else if (money > 500 && money <= 1000){
            double x = money - 500;
            double y = x*0.008;
            result = y + 1.5 + 4.4;
        } else if (money > 1000 && money <= 5000){
            double x = money - 1000;
            double y = x*0.005;
            result = y + 1.5 + 4.4 + 4;
        } else if (money > 5000 && money <= 10000){
            double x = money - 5000;
            double y = x*0.0025;
            result = y + 1.5 + 4.4 + 4 + 20;
        } else if (money > 10000 && money <= 100000){
            double x = money - 10000;
            double y = x*0.0005;
            result = y + 1.5 + 4.4 + 4 + 20 + 12.5;
        } else if (money > 100000){
            double x = money - 100000;
            double y = x*0.0001;
            result = y + 1.5 + 4.4 + 4 + 20 + 12.5 + 45;
        }
        return result;
    }

    /**
     * 服务招标
     * @param money
     * @return
     */
    public static double serveCount(double money){

        double result = 0;

        if (money <= 100 ){
            result = money*0.015;
        } else if (money > 100 && money <= 500){
            double x = money - 100;
            double y = x*0.008;
            result = y + 1.5;
        } else if (money > 500 && money <= 1000){
            double x = money - 500;
            double y = x*0.0045;
            result = y + 1.5 + 3.2;
        } else if (money > 1000 && money <= 5000){
            double x = money - 1000;
            double y = x*0.0025;
            result = y + 1.5 + 3.2 + 2.25;
        } else if (money > 5000 && money <= 10000){
            double x = money - 5000;
            double y = x*0.001;
            result = y + 1.5 + 3.2 + 2.25 + 10;
        } else if (money > 10000 && money <= 100000){
            double x = money - 10000;
            double y = x*0.0005;
            result = y + 1.5 + 3.2 + 2.25 + 10 + 5;
        } else if (money > 100000){
            double x = money - 100000;
            double y = x*0.0001;
            result = y + 1.5 + 3.2 + 2.25 + 10 + 5 + 45;
        }
        return result;
    }

}
