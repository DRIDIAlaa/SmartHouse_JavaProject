package BOL ;

import java.sql.Date;

/**
 *
 * @author hocin
 */
public class Member {
    
    
    String name,room,checkin,checkout ;

    public Member(String name, String room , String checkin, String checkout) {
        this.name = name;
        this.room = room;
        this.checkin = checkin;
        this.checkout = checkout;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin ;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    
    
    
}
