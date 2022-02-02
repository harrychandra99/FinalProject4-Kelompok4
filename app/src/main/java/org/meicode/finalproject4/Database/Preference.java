package org.meicode.finalproject4.Database;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Preference {
   public static final DatabaseReference DATABASE_REFERENCE = FirebaseDatabase.getInstance().getReferenceFromUrl("https://finalproject4-39b77-default-rtdb.firebaseio.com/");

}
