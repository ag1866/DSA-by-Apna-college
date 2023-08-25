public class strings {
    public static void main(String[] args) {
        String name = "Harry";
    
    //  System.out.println(name);
    //    int value = name.length();
    //    System.out.println(value);
    //    String lstring = name.toLowerCase();
    //    System.out.println(lstring);
    //    String ustring = name.toUpperCase();
    //    System.out.println(ustring);
    //    String tstring = name.trim();
    //    System.out.println(tstring);// it reduces all the spaces in the line
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('r','p'));
        System.out.println(name.startsWith("ha"));
        System.out.println(name.endsWith("ry"));
        System.out.println(name.charAt(1));
// aur agr hme sabhi char ko ek sath access krna ho
        // for(int i=0; i<name.length(); i++){
        //     System.out.println(name.charAt(i));
        // }
        System.out.println(name.indexOf("ry"));
        System.out.println(name.indexOf("r"));
        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry",4));
        System.out.println(modifiedName.lastIndexOf("rry",7));
        System.out.println(name.equalsIgnoreCase("harry"));

        


    }
}
// we can also do concatenation
// String firstName = "tony";
// String lastName = "Stark";
// String fullName = firstName + lastName;
// System.out.println(fullName);