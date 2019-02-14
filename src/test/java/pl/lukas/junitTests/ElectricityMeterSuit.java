package pl.lukas.junitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pl.lukas.junitTests.electricity.ElectricityMeterTest;
import pl.lukas.junitTests.electricity.TwoElectricityMetersTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ElectricityMeterTest.class,
        TwoElectricityMetersTest.class
})
public class ElectricityMeterSuit {
}
