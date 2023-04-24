package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_ARRAY_SIZE = 12;
    public static final int EMPTY = -1;
    private final int[] numbers = new int[MAX_ARRAY_SIZE];

    private int total = -1;

    public int getTotal() {
		return total;
	}

	public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

	private int[] getNumbers() {
		return numbers;
	}

}
