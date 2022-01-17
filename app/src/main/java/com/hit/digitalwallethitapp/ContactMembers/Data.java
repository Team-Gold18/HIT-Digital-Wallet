package com.hit.digitalwallethitapp.ContactMembers;

import com.hit.digitalwallethitapp.R;
import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<members> getMembersList() {
        List<members> MembersList = new ArrayList<>();

        members Samantha= new members ();
        Samantha.setName("Samantha");
        Samantha.setBank("Bank - 0987 3422 8756");
        Samantha.setImage(R.drawable.samantha);
        MembersList.add(Samantha);

        members  Rose = new members ();
        Rose.setName("Rose Hope");
        Rose.setBank("Bank - 0987 3422 8756");
        Rose.setImage(R.drawable.rose);
        MembersList.add(Rose);

        members  Angela = new members ();
        Angela.setName("Angela Smith");
        Angela.setBank("Bank - 0987 3422 8756");
        Angela.setImage(R.drawable.angela);
        MembersList.add(Angela);

        members  Andrea = new members ();
        Andrea.setName("Andrea Summer");
        Andrea.setBank("Bank - 0987 3422 8756");
        Andrea.setImage(R.drawable.andrea);
        MembersList.add(Andrea);

        members  Karen = new members ();
        Karen.setName("Karen Williom");
        Karen.setBank("Bank - 0987 3422 8756");
        Karen.setImage(R.drawable.karen);
        MembersList.add(Karen);

        members  Thomas = new members ();
        Thomas.setName("Thomas Wise");
        Thomas.setBank("Bank - 0987 3422 8756");
        Thomas.setImage(R.drawable.thomas);
        MembersList.add(Thomas);


        return MembersList;
    }

}
