class Car { // 기본 연료 자동차
    private int gasolineGauge;

    Car(int gasolineGauge) {
        this.gasolineGauge = gasolineGauge;
    }
    public int getGasolineGauge() {
        return gasolineGauge;
    }
}

class HybridCar extends Car { // 하이브리드 자동차
    private int electricGauge;

    HybridCar(int electricGauge, int gasolineGauge) {
        super(gasolineGauge);
        this.electricGauge = electricGauge;
    }
    public int getElectricGauge() {
        return electricGauge;
    }
}

class HybridWaterCar extends HybridCar { // 하이브리드 워터카
    private int waterGauge;

    HybridWaterCar(int waterGauge, int electricGauge, int gasolineGauge) {
        super(electricGauge, gasolineGauge);
        this.waterGauge = waterGauge;
    }
    public void showCurrentGauge() {
        System.out.println("잔여 가솔린 : " + getGasolineGauge());
        System.out.println("잔여 전기량 : " + getElectricGauge());
        System.out.println("잔여 워터량 : " + waterGauge);
    }
}

class CarMain {
    public static void main(String[] args) {
        HybridWaterCar hw = new HybridWaterCar(1, 2, 3);
        hw.showCurrentGauge();
    }
}
