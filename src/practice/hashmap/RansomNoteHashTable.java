package practice.hashmap;

import java.util.HashMap;
import java.util.Hashtable;

public class RansomNoteHashTable {





    static void checkMagazine(String[] magazine, String[] note) {

        if(note==null){
            System.out.println("No");
            return;
        }
        //corner case 2.
        if(note.length > magazine.length){
            System.out.println("No");
            return;
        }

        HashMap<String, Integer> mgz = new HashMap<>();
        for(int i=magazine.length-1; i>=0; i--) {
            if(mgz.containsKey(magazine[i])) {
                mgz.put(magazine[i], mgz.get(magazine[i]) + 1);
            }
            else {
                mgz.put(magazine[i], 1);
            }
        }

        for(int j=note.length-1;j>=0;j-- ){
            if(mgz.containsKey(note[j])){
                mgz.put(note[j], mgz.get(note[j])-1);
                    if(mgz.get(note[j]) < 0){
                        System.out.println("No");
                        return;
                    }
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");


    }

    public static void main(String[] args) {

        /**
         * Test Yes
         */

        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give",  "one", "grand", "today"};

        /**
         * Tests No
         */

        String[] magazine2 = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String[] note2 = {"ive",  "got", "some", "coconuts"};

        String[] magazine3 = {"two", "times", "three", "is", "not", "four"};
        String[] note3 = {"two",  "times", "two", "is", "four"};


       checkMagazine(magazine, note);
       checkMagazine(magazine2, note2);
       checkMagazine(magazine3, note3);



    }
}
