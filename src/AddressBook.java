import java.util.ArrayList;

//Hello, I am changing this from within the GitHub website

public class AddressBook {
    private ArrayList<BuddyInfo> buddyList;
    public AddressBook(){
        buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy!=null){
            buddyList.add(buddy);
        }
    }
    public BuddyInfo getBuddy(int index){
        if(index >= 0 && index <= buddyList.size()){
            return buddyList.get(index);
        }
        return null;
    }
    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index <= buddyList.size()){
            return this.buddyList.remove(index);
        }
        return null;
    }
    public static void main(String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Daniel","Carleton","(123)456-7890");
        AddressBook myAddressBook = new AddressBook();
        myAddressBook.addBuddy(buddy);
        System.out.println(myAddressBook.getBuddy(0).getName());
        myAddressBook.getBuddy(0).setName("Not Daniel");

        myAddressBook.removeBuddy(0);

    }
}
