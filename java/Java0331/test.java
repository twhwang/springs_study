class Power {
    public int kick;
    public int getKick() {
		return kick;
	}
	public void setKick(int kick) {
		this.kick = kick;
	}
	
	public int punch;
	public int getPunch() {
		return punch;
	}
	public void setPunch(int punch) {
		this.punch = punch;
	}

	
    
    Power (int kick, int punch){
    	this.kick = kick;
    	this.punch = punch;
    }
    
    void Action() {
    	System.out.println(kick);
    	System.out.println(punch);
    }
    
    
}

public class test {
	public static void main(String [] args) { 
		
        Power robot = new Power(10, 20);
        robot.Action();
        robot.setKick(30);
        robot.setPunch(20); 
        System.out.println(robot.getKick());
        System.out.println(robot.getPunch());
	}
}
