package tester;

import java.util.Scanner;

import core.CircularQueue;

public class CircularQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("enter size of circular queue : ");
			CircularQueue queue = new CircularQueue(sc.nextInt());

			Boolean exit = false;
			while (!exit) {
				System.out.println("Select any option \n1)Is Empty list\n"
						+ "2)Is full empty\n3)Add in Circular queue\n4)Remove from circular queue\n"
						+ "5)Get total number of element(size) present in queue\n" + "6)Display Circular queue\n"
						+ "0)Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Is queue Empty : " + queue.isEmpty());
						break;
					case 2:
						System.out.println("Is queue Full : " + queue.isFull());
						break;
					case 3:
						System.out.println("enter element to add in circular queue : ");
						String element = sc.next();
						System.out.println("Is element add : " + queue.add(element));
						break;
					case 4:
						System.out.println("Remove element is : " + queue.remove());
						break;
					case 5:
						System.out.println("Total number of elements are : " + queue.size());
						break;
					case 6:
						System.out.println("Display circular queue : ");
						System.out.println(queue.toString());
						break;
					case 0:
						System.out.println("Thank you!!!");
						exit = true;
						break;
					default:
						System.out.println("Invalid choice!!");
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
