import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import utils.Main;

public class MainTest {
    final String notQuiteListTestFilesDir = "src/test/resources/notQuiteLisp/";
    final String iWasToldThereWouldBeNoMath = "src/test/resources/iWasToldThereWouldBeNoMath/";
    final String noTimeForTaxiCab = "src/test/resources/noTimeForTaxiCab/";

    @Test
    @Tag("task:1")
    @DisplayName("Implemented the NotQuiteLisp.getResultPartA method")
    public void implemented_expected_notQuiteLisp_getResultPartA() {
        assertThat(
            new Main().notQuiteLispResultA(notQuiteListTestFilesDir + "test_1.txt")
        ).isEqualTo(0);
        assertThat(
            new Main().notQuiteLispResultA(notQuiteListTestFilesDir + "test_2.txt")
        ).isEqualTo(138);
        assertThat(
            new Main().notQuiteLispResultA(notQuiteListTestFilesDir + "test_3.txt")
        ).isEqualTo(6);
        assertThat(
            new Main().notQuiteLispResultA(notQuiteListTestFilesDir + "test_4.txt")
        ).isEqualTo(3);
        assertThat(
            new Main().notQuiteLispResultA(notQuiteListTestFilesDir + "test_5.txt")
        ).isEqualTo(-2);
        assertThat(
            new Main().notQuiteLispResultA(notQuiteListTestFilesDir + "test_6.txt")
        ).isEqualTo(-6);
    }

    @Test
    @Tag("task:1")
    @DisplayName("Implemented the NotQuiteLisp.getResultPartB method")
    public void implemented_expected_notQuiteLisp_getResultPartB() {
        assertThat(
            new Main().notQuiteLispResultB(notQuiteListTestFilesDir + "test-0.txt")
        ).isEqualTo(1);
        assertThat(
            new Main().notQuiteLispResultB(notQuiteListTestFilesDir + "test-1.txt")
        ).isEqualTo(5);
        assertThat(
            new Main().notQuiteLispResultB(notQuiteListTestFilesDir + "test_2.txt")
        ).isEqualTo(1771);
        assertThat(
            new Main().notQuiteLispResultB(notQuiteListTestFilesDir + "test_4.txt")
        ).isEqualTo(1);
        assertThat(
            new Main().notQuiteLispResultB(notQuiteListTestFilesDir + "test_5.txt")
        ).isEqualTo(3);
        assertThat(
            new Main().notQuiteLispResultB(notQuiteListTestFilesDir + "test_6.txt")
        ).isEqualTo(1);
    }

    @Test
    @Tag("task:2")
    @DisplayName("Implemented the IWasToldThereWouldBeNoMath.getResultPartA method")
    public void implemented_expected_iWasToldThereWouldBeNoMath_getResultPartA() {
        assertThat(
            new Main().iWasToldThereWouldBeNoMathResultA(iWasToldThereWouldBeNoMath + "test_1.txt")
        ).isEqualTo(1586300);
        assertThat(
            new Main().iWasToldThereWouldBeNoMathResultA(iWasToldThereWouldBeNoMath + "test_2.txt")
        ).isEqualTo(58);
        assertThat(
            new Main().iWasToldThereWouldBeNoMathResultA(iWasToldThereWouldBeNoMath + "test_3.txt")
        ).isEqualTo(43);
        assertThat(
            new Main().iWasToldThereWouldBeNoMathResultA(iWasToldThereWouldBeNoMath + "test_4.txt")
        ).isEqualTo(101);
    }

    @Test
    @Tag("task:2")
    @DisplayName("Implemented the IWasToldThereWouldBeNoMath.getResultPartB method")
    public void implemented_expected_iWasToldThereWouldBeNoMath_getResultPartB() {
        assertThat(
            new Main().iWasToldThereWouldBeNoMathResultB(iWasToldThereWouldBeNoMath + "test_1.txt")
        ).isEqualTo(3737498);
        assertThat(
            new Main().iWasToldThereWouldBeNoMathResultB(iWasToldThereWouldBeNoMath + "test_2.txt")
        ).isEqualTo(34);
        assertThat(
            new Main().iWasToldThereWouldBeNoMathResultB(iWasToldThereWouldBeNoMath + "test_3.txt")
        ).isEqualTo(14);
        assertThat(
            new Main().iWasToldThereWouldBeNoMathResultB(iWasToldThereWouldBeNoMath + "test_4.txt")
        ).isEqualTo(48);
    }

    @Test
    @Tag("task:3")
    @DisplayName("Implemented the NoTimeForTaxiCab.getResultPartA method")
    public void implemented_expected_noTimeForTaxiCab_getResultPartA() {
        assertThat(
            new Main().noTimeForTaxiCabResultA(noTimeForTaxiCab + "test_1.txt")
        ).isEqualTo(17);
        assertThat(
            new Main().noTimeForTaxiCabResultA(noTimeForTaxiCab + "test_2.txt")
        ).isEqualTo(5);
        assertThat(
            new Main().noTimeForTaxiCabResultA(noTimeForTaxiCab + "test_3.txt")
        ).isEqualTo(2);
        assertThat(
            new Main().noTimeForTaxiCabResultA(noTimeForTaxiCab + "test_4.txt")
        ).isEqualTo(12);
        assertThat(
            new Main().noTimeForTaxiCabResultA(noTimeForTaxiCab + "test_5.txt")
        ).isEqualTo(271);
    }

    @Test
    @Tag("task:3")
    @DisplayName("Implemented the NoTimeForTaxiCab.getResultPartB method")
    public void implemented_expected_noTimeForTaxiCab_getResultPartB() {
        assertThat(
            new Main().noTimeForTaxiCabResultB(noTimeForTaxiCab + "test-1.txt")
        ).isEqualTo(4);
        assertThat(
            new Main().noTimeForTaxiCabResultB(noTimeForTaxiCab + "test-2.txt")
        ).isEqualTo(153);
        assertThat(
            new Main().noTimeForTaxiCabResultB(noTimeForTaxiCab + "test_1.txt")
        ).isEqualTo(17);
        assertThat(
            new Main().noTimeForTaxiCabResultB(noTimeForTaxiCab + "test_2.txt")
        ).isEqualTo(5);
        assertThat(
            new Main().noTimeForTaxiCabResultB(noTimeForTaxiCab + "test_3.txt")
        ).isEqualTo(2);
        assertThat(
            new Main().noTimeForTaxiCabResultB(noTimeForTaxiCab + "test_4.txt")
        ).isEqualTo(12);
        assertThat(
            new Main().noTimeForTaxiCabResultB(noTimeForTaxiCab + "test_5.txt")
        ).isEqualTo(153);
    }
}
