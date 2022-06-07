package com.example.fabitDemo.utils;

public class GPSHelper {
    // ПИ
    public static final double PI = 3.14159265358979324;
    // Экваториальный радиус (м)
    private static final  double EARTH_RADIUS = 6378137;

    /**
     * Преобразовано в радианы (рад)
     * */
    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }
    /**
     * На основе алгоритма в googleMap для получения расстояния между двумя широтой и долготой,
     * Точность расчета аналогична точности расстояния в Google Maps, а диапазон разницы составляет менее 0,2 метра.
     * @param lon1 Долгота первой точки
     * @param lat1 Широта первой точки
     * @param lon2 Долгота второй точки
     * @param lat3 Широта второй точки
     * @return возвращает расстояние в км
     * */
    public static double GetDistance(double lon1,double lat1,double lon2, double lat2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lon1) - rad(lon2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2)+Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
        s = s * EARTH_RADIUS;
        //s = Math.round(s * 10000) / 10000;
        return s;
    }
}
