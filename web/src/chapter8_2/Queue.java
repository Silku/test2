package chapter8_2;

/**
 * 
 * Queue(ť)
 * FIFO(first in first out)
 * ���̰� ó�� �� ���� ���� ���� ���´�.
 * �������� ���� : enQueue
 * �������� ���� : deQueue
 */

public interface Queue {
	void enQueue(String title);
	String deQueue();
	int getQueueSize();
}