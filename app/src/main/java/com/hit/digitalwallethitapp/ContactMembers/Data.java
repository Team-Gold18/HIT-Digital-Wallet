package com.hit.digitalwallethitapp.ContactMembers;

import com.hit.digitalwallethitapp.R;
import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<members> getMembersList() {
        List<members> MembersList = new ArrayList<>();

        members Avocado = new members ();
        Samantha.setName("Samantha");
        Samantha.setImage(R.drawable.samantha);
        MembersList.add(Samantha);

        members  Banana = new members ();
        Rose.setName("Rose Hope");
        Rose.setImage(R.drawable.rose);
        MembersList.add(Rose);

        members  Coconut = new members ();
        Angela.setName("Angela Smith");
        Angela.setImage(R.drawable.angela);
        MembersList.add(Angela);

        members  Guava = new members ();
        Andrea.setName("Andrea Summer");
        Andrea.setImage(R.drawable.andrea);
        MembersList.add(Andrea);

        members  Lemon = new members ();
        Karen.setName("Karen Williom");
        Karen.setImage(R.drawable.karen);
        MembersList.add(Karen);

        members  Mango = new members ();
        Thomas.setName("Thomas Wise");
        Thomas.setImage(R.drawable.thomas);
        MembersList.add(Thomas);


        return MembersList;
    }

}
