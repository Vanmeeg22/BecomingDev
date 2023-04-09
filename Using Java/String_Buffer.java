public class String_Buffer {
    public static void main(String[] args){

        StringBuffer str = new StringBuffer("Vanmeeg");
        System.out.println("Given String value: "+str);
        System.out.println("Length of the string = "+str.length());
        System.out.println("Capacity of the String_Buffer = "+(str.capacity()-str.length()));
        System.out.println("Capacity of the String_Buffer and the String value combined = "+str.capacity());
        System.out.println("Appending a string value to the string: "+str.append(" RKTV"));
        System.out.println("Deleting a character from the string: "+str.deleteCharAt(11));
        System.out.println("Inserting a string in the existing string: "+str.insert(7, "anathan"));

        String str2 = str.toString();   //Converting string_buffer to string
    }
}
