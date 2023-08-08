package product.model;

public class Branch {
private int branchID;
private String branchName;

    public Branch() {
    }

    public Branch(int branchID, String branchName) {
        this.branchID = branchID;
        this.branchName = branchName;
    }

    public int getBranchID() {
        return branchID;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
