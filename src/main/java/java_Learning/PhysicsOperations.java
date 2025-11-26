package java_Learning;

public class PhysicsOperations {
	
	float gravity;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhysicsOperations obj = new PhysicsOperations();
		obj.Weight();
		obj.PotientialEnergy();
		obj.ForceDueToGravity();

	}
	
	public PhysicsOperations() {
		gravity = 9.18f;
		
	}
	    public void Weight() {
		float mass = 10.0f;
		float weight = mass * gravity;
		System.out.println("Weight " + weight + " N ");
		
	}
	
       public void PotientialEnergy() {
		float mass = 5f;
		float height = 10f;
		float potientialEnergy = mass * gravity * height;
		System.out.println("PotientialEnergy " + potientialEnergy + " j ");
	

}
       public void ForceDueToGravity() {
    	   float mass = 15f;
    	   float force = mass * gravity;
    	   System.out.println("ForcedueToGravity: " + force + " N ");
    	   
    	   
       }
}

