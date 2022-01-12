package com.hit.digitalwallethitapp.ContactMembers;

import com.hit.digitalwallethitapp.R;
import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Members> getFruitList() {
        List<Members> MembersList = new ArrayList<>();

        Members Avocado = new Members();
        Samantha.setName("Samantha");
        Samantha.setImage(R.drawable.samantha);
        MembersList.add(Samantha);

        Members Banana = new Members();
        Rose.setName("Rose Hope");
        Rose.setImage(R.drawable.rose);
        MembersList.add(Rose);

        Members Coconut = new Members();
        Angela.setName("Angela Smith");
        Angela.setImage(R.drawable.angela);
        MembersList.add(Angela);

        Members Guava = new Members();
        Andrea.setName("Andrea Summer");
        Andrea.setImage(R.drawable.andrea);
        MembersList.add(Andrea);

        Members Lemon = new Members();
        Karen.setName("Karen Williom");
        Karen.setImage(R.drawable.karen);
        MembersList.add(Karen);

        Members Mango = new Members();
        Thomas.setName("Thomas Wise");
        Thomas.setImage(R.drawable.thomas);
        MembersList.add(Thomas);

        Members Orange = new Members();
        Orange.setName("Orange");
        Orange.setImage(R.drawable.orange);
        MembersList.add(Orange);

        return MembersList;
    }

}
