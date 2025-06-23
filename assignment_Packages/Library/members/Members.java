package assignment_Packages.Library.members;

public class Members {
	private String name;
    private int memberId;

    public Members(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
    	return name; 
    }

    public int getMemberId() { 
    	return memberId; 
    }

    @Override
    public String toString() {
        return "Member: " + name + "\nID: " + memberId+" ";
    }
}
