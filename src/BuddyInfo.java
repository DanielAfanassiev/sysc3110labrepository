public class BuddyInfo {
    public BuddyInfo(){
        this.name = "Default name";
        this.address = "Default address";
        this.phoneNumber = "Default phoneNumber";
    }
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String buddyName){
        this.name = buddyName;

    }
    public String getAddress(){
        return this.address;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    private String name;
    private String address;
    private String phoneNumber;
    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Daniel Afanassiev", "123 Address Drive", "(123) 456-7890");
        System.out.println("Hello " + buddy1.getName());
    }
}