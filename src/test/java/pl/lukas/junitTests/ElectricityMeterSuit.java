package pl.lukas.junitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pl.lukas.junitTests.electricity.ExistElectricityMeterTest;
import pl.lukas.junitTests.electricity.NewElectricityMeterTest;
import pl.lukas.junitTests.electricity.TwoElectricityMetersTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ExistElectricityMeterTest.class,
        NewElectricityMeterTest.class,
        TwoElectricityMetersTest.class
})
public class ElectricityMeterSuit {
}
