package Module2_2;

public class Main {



    public static void main(String[] args) {
        QueueSize queueHolder = new QueueSize();
        int decision;
        do {
            System.out.println("Maximum queue size is " + queueHolder.getQueueSize() + "\n" +
                    "Choose what to do: \n" +
                    "1) Change queue size;\n" +
                    "2) Add an element;\n" +
                    "3) Quit program");
            decision = QueueSize.getIntFromScanner();
            switch (decision) {
                case 1: {
                    queueHolder.changeQueueSize(queueHolder.getMyQueue());
                    break;
                }

                case 2: {
                    queueHolder.addElement(queueHolder.getMyQueue());
                    break;
                }
                case 3: {
                    System.out.println("Program closed");
                    break;
                }
                default: {
                    System.out.println("Incorrect input! Please try again!");
                }
            }
        } while (decision != 3);

    }


}
