package pl.lukas.junitTests.electricity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TariffElectricityMeter {

    ElectricityMeter electricityMeter;

    @Before
    public void setUp(){
        electricityMeter = new ElectricityMeter();
        electricityMeter.setTariffOn(true);
        electricityMeter.setElectricityTariffStartHour(12);
        electricityMeter.setElectricityTariffEndHour(14);
    }

    @Test
    public void GivenOnTariffWhenKwhAdditionThenCounterTariffIsIncreased(){
        // Given
        // todo setTariff Time mock isTariffNow()
        // When
        electricityMeter.addKwh(100);
        // Then
        Assert.assertEquals(100, electricityMeter.getKwhTariff(), 0.01);
    }
    @Test
    public void GivenNotOnTariffWhenKwhAdditionThenCounterTariffIsIncreased(){
        // Given
        // todo setTariff Time mock isTariffNow() NOT TARIFF
        // When
        electricityMeter.addKwh(100);
        // Then
        Assert.assertEquals(100, electricityMeter.getKwhTariff(), 0.01);
    }

}
