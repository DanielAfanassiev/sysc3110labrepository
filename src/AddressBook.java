import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    ArrayList<BuddyInfo> buddyList;
    public AddressBook(){
        buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddyList.add(buddy);
    }
    public BuddyInfo getBuddy(int index){
        return buddyList.get(index);
    }
    public void removeBuddy(BuddyInfo buddyToRemove) {
        this.buddyList.remove(buddyToRemove);
    }
    public static void main(String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Daniel","Carleton","(123)456-7890");
        AddressBook myAddressBook = new AddressBook();
        myAddressBook.addBuddy(buddy);
        System.out.println(myAddressBook.getBuddy(0).getName());
        myAddressBook.removeBuddy(buddy);

    }
}
