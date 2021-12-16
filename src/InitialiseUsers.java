import java.io.*;
import java.util.ArrayList;

public class InitialiseUsers {

    //A static variable that holds the path to the text file for the products
    static File userFile = new File("c:/Users/henil.soni/Desktop/userFile.txt");

    public void createFileIfNotExists() {
        try {

            if (!userFile.isFile()) {
                userFile.createNewFile();
            }
        } catch (IOException ioEx) {
            System.out.println("Error has occured when trying to create file");
            ioEx.printStackTrace();
        }
    }

        public static void writeData(ArrayList<User> user) {
            try{
                //creates a new FileWriter object that will be used to write information to the file provided to it (productsFile)
                FileWriter writer = new FileWriter(userFile);


                //iterate over the arraylist of products that has been passed into the method. For Each.
                for (User u : user) {
                    //Similar to sout this will write the below string to the text file. Separating each value with a comma.
                    writer.write(u.username + "," + u.password + "," + u.forename
                    + "," + u.surname + "," + u.employeeID + "," + u.admin);
                    //add a new line so each product is on its own line and not all on one big line.
                    writer.write("\n");
                }
                writer.close();
            } catch (IOException ioex) {
                System.out.println("Failed to write to file");
                ioex.printStackTrace();
            }
        }


    public ArrayList<String> readFile (File file)  {
        //This is the first instance where we try to use the text file, as such we check if it exists first.
        createFileIfNotExists();

        //A new arraylist to store each line of the text file.
        ArrayList<String> lines = new ArrayList<>();
        try {
            //Create a new FileReader object that will read data from the file provided.
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            //A loop that will continue reading from the text file while there is another line in the file.
            while ((line = br.readLine()) != null) {
                //add the line that has been read to the arraylist.
                lines.add(line);
            }
            //close the connection to the file.
            reader.close();
        } catch ( IOException ioex) {
            System.out.println("Failed to read file");
            ioex.printStackTrace();
        }
        return lines;

    }

    private User getItemFromString (String userString) {
        //Create a new product variable.
        User p;
        //Create an array that will be populated with strings.
        //The line from the text file will be split at each comma found.
        //A string read in from the text file - 12,EVGA,RTX 3090Ti,1300.0,4
        //When this string is split at each comma the array will be populated as below
        //pd = {"1", "Nike", "Jordan 1, Travis scott", "1000", "5"}
        String[] pd = userString.split(",");
        //create a new product object using the constructor from the Product class with the values stored in the pd Array.
        p = new User(pd[0],pd[1],pd[2],pd[3],Integer.parseInt(pd[4]), Boolean.parseBoolean(pd[5]));
        //Return the Product object that has been created.
        return p;
    }

    public ArrayList<User> getUsers(ArrayList<String> userStrings) {
        //Create a new ArrayList of type Product
        ArrayList<User> user = new ArrayList<>();
        //For each String read in from the text file
        for(String s : userStrings) {
            //Create a new product Object using the getProductFromString() method
            //passing in the String currently assigned to 's' in the for each loop.
            //Add the Product object returned from the getProductFromString() method to the ArrayList 'products'
            user.add(getItemFromString(s));
        }
        //Return the ArrayList of Product objects that have been read into the program as Strings
        //and converted into Product objects.
        return user;
    }


}


