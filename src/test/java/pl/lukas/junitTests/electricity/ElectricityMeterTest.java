package pl.lukas.junitTests.electricity;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
// @Ignore // ignore all package
public class ElectricityMeterTest {

    @Test
    public void addKwh_newMeter_properAddition() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        Assert.assertTrue("",electricityMeter.getKwh() == 1);
    }

    @Ignore("not implemented yet")
    @Test
    public void addKwh_newMeter2_properAddition() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(3);
        Assert.assertTrue(electricityMeter.getKwh() == 5);
    }

    @Test
    public void addKwh_newMeter5_properAddition() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        Assert.assertTrue(electricityMeter.getKwh() == 17);
    }

    @Test
    public void kwhCounterIncreaseIfNew() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 1);
    }

    @Test
    public void kwhCounterIncreaseIfSecond() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 2);
    }

    @Test
    public void givenNewMeterWhenFirsAdditionThenProperCounter() {
        // given
        ElectricityMeter electricityMeter = new ElectricityMeter();
        // when // we can use labels e.g. When:, but cannot be use in declare of a new variable
        electricityMeter.addKwh(1);
        // then
        Assert.assertTrue(electricityMeter.getKwh() == 1);
        // given, when, then = arrange, act, assert; bette use G-W-T signature
    }

    @Test(expected = ArithmeticException.class)
    public void getHowMoreExpensiveNormalIs() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.setCentsForKwh(90);
        electricityMeter.getHowMoreExpensiveNormalIs();
    }
}