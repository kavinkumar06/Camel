# Camel
import java.io.*;
import java.util.*;
public class Camel
{
  public static void main(String args[])
  {
   if (init==null)
        return null;

    final StringBuilder ret = new StringBuilder(init.length());

    for (final String word : init.split(" ")) {
        if (!word.isEmpty()) {
            ret.append(word.substring(0, 1).toUpperCase());
            ret.append(word.substring(1).toLowerCase());
        }
        if (!(ret.length()==init.length()))
            ret.append(" ");
    }

    return ret.toString();
}
