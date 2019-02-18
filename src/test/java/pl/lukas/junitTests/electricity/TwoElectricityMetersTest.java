package pl.lukas.junitTests.electricity;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

// @Ignore // ignore all package
public class TwoElectricityMetersTest {

    @Test
    public void addKwh_newMeter_properAddition() {
        ElectricityMeter electricityMeter1 = new ElectricityMeter();
        electricityMeter1.addKwh(1);
        Assert.assertTrue("",electricityMeter1.getKwh() == 1);
    }

//    @Ignore("not implemented yet")
    @Test
    public void addKwh_newMeter2_properAddition() {
        ElectricityMeter electricityMeter1 = new ElectricityMeter();
        electricityMeter1.addKwh(1);
        electricityMeter1.addKwh(3);
        Assert.assertTrue(electricityMeter1.getKwh() == 5);
    }

    @Test
    public void addKwh_newMeter5_properAddition() {
        ElectricityMeter electricityMeter1 = new ElectricityMeter();
        electricityMeter1.addKwh(1);
        electricityMeter1.addKwh(4);
        electricityMeter1.addKwh(4);
        electricityMeter1.addKwh(4);
        electricityMeter1.addKwh(4);
        Assert.assertTrue(electricityMeter1.getKwh() == 17);
    }

//    @Test
//    public void kwhCounterIncreaseIfNew() {
//        ElectricityMeter electricityMeter1 = new ElectricityMeter();
//        electricityMeter1.addKwh(1);
//        Assert.assertTrue(electricityMeter1.getKwh() == 1);
//    }
//
//    @Test
//    public void kwhCounterIncreaseIfSecond() {
//        ElectricityMeter electricityMeter1 = new ElectricityMeter();
//        electricityMeter1.addKwh(1);
//        electricityMeter1.addKwh(1);
//        Assert.assertTrue(electricityMeter1.getKwh() == 2);
//    }

    @Test
    public void givenNewMeterWhenFirsAdditionThenProperCounter() {
        // given
        ElectricityMeter electricityMeter1 = new ElectricityMeter();
        // when // we can use labels e.g. When:, but cannot be use in declare of a new variable
        electricityMeter1.addKwh(1);
        // then
        Assert.assertTrue(electricityMeter1.getKwh() == 1);
        // given, when, then = arrange, act, assert; bette use G-W-T signature
    }

    @Test(expected = ArithmeticException.class)
    public void getHowMoreExpensiveNormalIs() {
        ElectricityMeter electricityMeter1 = new ElectricityMeter();
        electricityMeter1.setCentsForKwh(90);
        electricityMeter1.getHowMoreExpensiveNormalIs();
    }
}