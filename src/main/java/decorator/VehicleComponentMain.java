package decorator;

public class VehicleComponentMain {
    public static void main(String[] args) {
    	VehicleComponent v = new Vehicle("Optra", 100);
    	
    	VehicleComponent vgps = new GPSVehicleDecorator(v);
    	VehicleComponent vgpsmp3 = new MP3VehicleDecorator(vgps);
    
    	VehicleComponent vmp3 = new MP3VehicleDecorator(v);
    	VehicleComponent vmp3gps = new GPSVehicleDecorator(vmp3);
    	
    	System.out.println("Description:\n " + v.finalDescription());
    	System.out.println("Price: " + v.finalPrice());
    	System.out.println("=========");

    	System.out.println("Description:\n " + vgps.finalDescription());
    	System.out.println("Price: " + vgps.finalPrice());
    	System.out.println("=========");
    	
    	System.out.println("Description:\n " + vgpsmp3.finalDescription());
    	System.out.println("Price: " + vgpsmp3.finalPrice());
    	System.out.println("=========");
    	
    	System.out.println("Description:\n " + vmp3.finalDescription());
    	System.out.println("Price: " + vmp3.finalPrice());
    	System.out.println("=========");
    	
    	System.out.println("Description:\n " + vmp3gps.finalDescription());
    	System.out.println("Price: " + vmp3gps.finalPrice());
    	System.out.println("=========");
    }
}
