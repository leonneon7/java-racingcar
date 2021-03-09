package racinggame.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    public void 이동() {
        Car car = new Car("pobi");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }

    @Test
    public void 정지() {
        Car car = new Car("pobi");
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(new Position(0));
    }

    @Test
    void create() {
        assertThat(new Car("pobi", 2)).isEqualTo(new Car("pobi", 2));
    }
}