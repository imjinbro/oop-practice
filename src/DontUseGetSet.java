import java.util.ArrayList;

// 객체의 상태값을 바깥으로 가져가서 어떤 처리를 하지말고 객체에 요청하도록(객체지향)
public class DontUseGetSet {

}

class Car {
    private int pos; //상태값을 유출시키지않는 것이 캡슐화

    public boolean isMaxPosition(int maxPosition) {
        return this.pos == maxPosition;
    }

}

class ResultBuilder {
    private static final int MAX_POSITION = 100;
    private static ArrayList<Car> cars = new ArrayList<>();

    public static Car[] getMaxPostionCars() {
        ArrayList<Car> maxPositionCars = new ArrayList<>();

        for (Car car : cars) {
            addToMaxPositionsCars(maxPositionCars, car);
        }

        return convertFormat(maxPositionCars);
    }

    private static Car[] convertFormat(ArrayList<Car> convertTarget) {
        Car[] cars = new Car[convertTarget.size()];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = convertTarget.get(i);
        }

        return cars;
    }

    private static void addToMaxPositionsCars(ArrayList<Car> maxPositionCars, Car car) {
        if (car.isMaxPosition(MAX_POSITION)) {
            maxPositionCars.add(car);
        }
    }

}
