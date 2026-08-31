public class Car {
    int code;
    Route route;
    int maxCapacity;

    public Car(int code,Route route, int maxCapacity) {
        this.code = code;
        this.maxCapacity = maxCapacity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "code=" + code +
                ", route=" + route +
                ", maxCapacity=" + maxCapacity +
                '}';
    }
}
