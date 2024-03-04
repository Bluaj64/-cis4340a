/* 
//Noncompliant Code 


public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt(); 
}


//Compliant Solution 

public static long getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}


*/