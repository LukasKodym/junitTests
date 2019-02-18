package pl.lukas.junitTests.electricity;

import org.junit.*;

// @Ignore // ignore all package
public class ExistElectricityMeterTest {

    private static ElectricityMeter electricityMeter;


    @BeforeClass
    public static void init() {
        // computation expensive steps before starting test class
        ExistElectricityMeterTest.electricityMeter = new ElectricityMeter();
    }

    @Before
    public void setUp() {
        // assure deterministic start environment
        electricityMeter.addKwh(100);
    }

    @AfterClass
    public static void release() {
        // release connections/files etc.
    }

    @After
    public void tearDown() {
        electricityMeter.reset();
    }


    @Test
    public void addKwh_newMeter_properAddition() {
        electricityMeter.addKwh(1);
        Assert.assertTrue("", electricityMeter.getKwh() == 101);
    }

    //    @Ignore("not implemented yet")
    @Test
    public void addKwh_newMeter2_properAddition() {



        electricityMeter.addKwh(1);
        electricityMeter.addKwh(3);
        Assert.assertTrue(electricityMeter.getKwh() == 104);
    }

    @Test
    public void addKwh_newMeter5_properAddition() {
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        Assert.assertTrue(electricityMeter.getKwh() == 117);
    }

    @Test
    public void kwhCounterIncreaseIfNew() {
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 101);
    }

    @Test
    public void kwhCounterIncreaseIfSecond() {
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 102);
    }

    @Test
    public void givenNewMeterWhenFirsAdditionThenProperCounter() {
        // given
        // when // we can use labels e.g. When:, but cannot be use in declare of a new variable
        electricityMeter.addKwh(1);
        // then
        Assert.assertTrue(electricityMeter.getKwh() == 101);
        // given, when, then = arrange, act, assert; bette use G-W-T signature
    }

    @Test(expected = ArithmeticException.class)
    public void getHowMoreExpensiveNormalIs() {
        electricityMeter.setCentsForKwh(90);
        electricityMeter.getHowMoreExpensiveNormalIs();
    }
}