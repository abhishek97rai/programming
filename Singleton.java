/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
        System.out.println(string);
  }
}

//Usage - eg: DataSource, so that only once connection is maintained
class Singleton {
    private static Singleton instance;

    //protected so that it can be used by sub classes
    protected Singleton() {

    }

    //static so that we can directly call Singleton.getInstance(), like Logger.getLogger()
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
