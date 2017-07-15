package Module2_2;

import java.util.*;


class QueueSize {


    Queue<Integer> getMyQueue() {
        return myQueue;
    }

    private Queue<Integer> myQueue = new LinkedList<Integer>() {

    };

    private int queueSize = 16;
    private boolean isInitialSize = true;
    private static Scanner in = new Scanner(System.in);

    int getQueueSize() {
        return queueSize;
    }

    void changeQueueSize(Queue<Integer> queue) {
        if (!isInitialSize) {
            System.out.println("Queue size is already not initial! It is " + queueSize);
        } else {
            System.out.println("Queue size is " + queueSize);
            System.out.println("Enter new size: ");

            try {
                queueSize = getIntFromScanner();
                if (queueSize < queue.size()) {
                    throw new QueueSizeException();
                }
                isInitialSize = false;
            } catch (QueueSizeException e) {
                System.out.println("Queue is already bigger than the size you entered!");
                queueSize = 16;
            }
        }
        printQueue(queue);
    }
    class QueueSizeException extends Exception {
        QueueSizeException() {
        }
    }

    void addElement(Queue<Integer> queue) {
        System.out.print("Enter an element to add: ");
        if (queue.size() == queueSize) {
            queue.remove();
        }
        queue.add(getIntFromScanner());
        printQueue(queue);
    }

    private void printQueue(Queue<Integer> queue) {
        Queue<Integer> myQueueCopy = new LinkedList<>();
        myQueueCopy.addAll(queue);
        for (int i = 0; i < queue.size(); i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(myQueueCopy.poll());
        }
        System.out.println();
    }

    static int getIntFromScanner() {
        int i;
        try {
            i = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input! Please try again!");
            in.next();
            i = getIntFromScanner();
        }
        return i;
    }
}
