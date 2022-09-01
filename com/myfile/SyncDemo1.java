package designpatternjava.com.myfile;

class BookThreator {
	
	int totalSeat=10;
	
	
	public void bookoseat(int seats,String value) {
		
		if (totalSeat >= seats) {
			totalSeat=totalSeat-seats;
			System.out.println(Thread.currentThread().getName()+"--"+"Seat booked succesfully By "+ value);
			
		}else {
			System.out.println(Thread.currentThread().getName()+"--"+"Seat Not Booked"+value);
		}
		
	}


	@Override
	public String toString() {
		return "BookThreator [totalSeat=" + totalSeat + "]";
		
	}
	
	
	
	
}

public class SyncDemo1 implements Runnable{

	static BookThreator bookThreator;
	int seats;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bookThreator.bookoseat(seats,bookThreator.toString());

	}
	
	
	public static void main(String[] args) {
		bookThreator= new BookThreator();
		SyncDemo1 nikhil = new SyncDemo1();
		Thread t =new Thread(nikhil,"nikhil");
		nikhil.seats=10;
		t.start();
		
        SyncDemo1 pankaj = new SyncDemo1();
		Thread t1 =new Thread(pankaj,"pankaj");
		pankaj.seats=6;
		t1.start();
		
	}
}



