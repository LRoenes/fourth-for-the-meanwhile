package utils;

public class Main extends ReflectionProxy {
    @Override
    public String getTargetClassName() {
        return "Main";
    }

    public int notQuiteLispResultA(String fileName) {
        return invokeMethod("notQuiteLispResultA", new Class[] { String.class }, fileName);
    }

    public int notQuiteLispResultB(String fileName) {
        return invokeMethod("notQuiteLispResultB", new Class[] { String.class }, fileName);
    }

    public int iWasToldThereWouldBeNoMathResultA(String fileName){
        return invokeMethod("iWasToldThereWouldBeNoMathResultA", new Class[] { String.class }, fileName);
    }

    public int iWasToldThereWouldBeNoMathResultB(String fileName){
        return invokeMethod("iWasToldThereWouldBeNoMathResultB", new Class[] { String.class }, fileName);
    }

    public int noTimeForTaxiCabResultA(String fileName){
        return invokeMethod("noTimeForTaxiCabResultA", new Class[] { String.class }, fileName);
    }

    public int noTimeForTaxiCabResultB(String fileName){
        return invokeMethod("noTimeForTaxiCabResultB", new Class[] { String.class }, fileName);
    }
}
