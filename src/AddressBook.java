import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<BuddyInfo> buddyList;
    public AddressBook(){
    }
    List<BuddyInfo> Add;

    public void addBuddy(BuddyInfo buddy){
        buddyList.add(buddy);
    }
    public BuddyInfo getBuddy(){
        return buddyList.get(0);
    }
    public void removeBuddy(BuddyInfo buddyToRemove) {
        this.buddyList.remove(buddyToRemove);
    }
    public static void main(String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Daniel","Carleton","(123)456-7890");
        AddressBook myAddressBook = new AddressBook();
        myAddressBook.addBuddy(buddy);
        myAddressBook.removeBuddy(buddy);

    }
}
