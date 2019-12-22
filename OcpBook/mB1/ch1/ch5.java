package mB1.ch1;
private static class GetSet {
int first = 5;
static int second = DEFAULT_VALUE;
}
// enum is like a type  like a class or interface that fixed list of values

public enum ch5 {
    HIGH(100) {
       public void printValue() {
           System.out.println("** Highest value**");
       }
       public void printDescription() {
           System.out.println("High Volume");
       }
    }, MEDIUM(50) {
        public void printDescription() {
           System.out.println("Medium Volume");
        }
    }, LOW(20) {
        public void printDescription() {
            System.out.println("Low Volume");
        }
    };
    private int value;

    private ch5(int value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println(value);
    }
    public abstract void printDescription();
}