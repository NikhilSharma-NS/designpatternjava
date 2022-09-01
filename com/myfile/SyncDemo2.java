package designpatternjava.com.myfile;

import java.util.concurrent.ConcurrentHashMap;

class BookThreator1 {
	
	int totalSeat=10;
	
	
	public 
 void  bookoseat(int seats,String value) {
		
		if (totalSeat >= seats) {
			totalSeat=totalSeat-seats;
			System.out.println(Thread.currentThread().getName()+"--"+"Seat booked succesfully By "+ "current " +totalSeat);
			
		}else {
			System.out.println(Thread.currentThread().getName()+"--"+"Seat Not Booked"+value+"current " +totalSeat);
		}
		
	}


	@Override
	public String toString() {
		return "BookThreator [totalSeat=" + totalSeat + "]";
		
	}
	
	
	
	
}

public class SyncDemo2 implements Runnable{

	static BookThreator1 bookThreator1;
	int seats;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bookThreator1.bookoseat(seats,bookThreator1.toString());

	}
	
	
	public static void main(String[] args) {
		bookThreator1= new BookThreator1();
		SyncDemo2 nikhil = new SyncDemo2();
		Thread t =new Thread(nikhil,"nikhil");
		nikhil.seats=9;
		t.start();
		
        SyncDemo2 pankaj = new SyncDemo2();
		Thread t1 =new Thread(pankaj,"pankaj");
		pankaj.seats=6;
		t1.start();
		
		
		ConcurrentHashMap<String, String> m=new ConcurrentHashMap<>();
		m.put("a", "b");
	}
}



