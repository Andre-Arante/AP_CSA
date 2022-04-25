# Assignment 41

Now that we know a little bit about searching and sorting, we will put it to use with a program that acts as a contacts list.

In class we will design the class and work on setting up some methods. Then you will fill in the rest.

For this project we will implement Binary Search because we will have a "large" list, which means we have to sort the contacts
before searching for someone. Here we will use insertion sort. The code introduced in class was for integers, but you will have to
adapt it to work for `Person` objects (which really is going to be Strings). I suggest looking at the Java Documentation for `String` to
figure out which method will help you sort alphabetically.

This project will have three classes: `Contacts`, `Person`, and `Main`.

Refer to the files created in class for more details about the individual classes and their instance variables, constructors, and methods.

### Specifications

In the class `Contacts`, implement the `grabName`, `grabNum`, `grabEmail`, `getContact`, and `sortContacts` methods.

**Note:** for `grabName`, `grabNum`, and `grabEmail`, assume the parameter will be a line from the file in the format "name, number, email" (e.g. William Jefferson Clinton, 6055555555, wclinton@whitehouse.gov)

Adapt the `getContact()` and `sortContacts()` to work with `Person` objects/Strings instead of ints as shown in the `SearchAndSort.java` file.

### Sample Outputs

Make sure you thoroughly test all four functions (get contact, add contact, delete contact, and list contacts).

```
1: Find contact
2: Add contact
3: List contacts 2
Enter name, then number, then email.
Gary Johnson
9891114545
gjohnson@libertarian.org
Enter 0 to quit or 1 to complete another action. 1

1: Find contact
2: Add contact
3: List contacts 1
Enter the name: James Madison
James Madison
Number:  4085555555
Email:  jmadison@whitehouse.gov
Enter 0 to quit or 1 to complete another action. 1

1: Find contact
2: Add contact
3: List contacts 3
Abraham Lincoln,  7145555555,  alincoln@whitehouse.gov
Andrew Jackson,  4085555555,  ajackson@whitehouse.gov
Andrew Johnson,  7145555555,  ajohnson@whitehouse.gov
Barack Hussein Obama,  6055555555,  bobama@whitehouse.gov
Benjamin Harrison,  7145555555,  bharrison@whitehouse.gov
Calvin Coolidge,  7145555555,  ccoolidge@whitehouse.gov
Chester Alan Arthur,  7145555555,  carthur@whitehouse.gov
Donald J. Trump,  6055555555,  dtrump@whitehouse.gov
Dwight David Eisenhower,  6055555555,  deisenhower@whitehouse.gov
Franklin Delano Roosevelt,  6055555555,  froosevelt@whitehouse.gov
Franklin Pierce,  4085555555,  fpierce@whitehouse.gov
Gary Johnson, 9891114545, gjohnson@libertarian.org
George Herbert Walker Bush,  6055555555,  gbush@whitehouse.gov
George Walker Bush,  6055555555,  gwbush@whitehouse.gov
George Washington,  4085555555,  gwashington@potus.gov
Gerald Rudolph Ford,  6055555555,  gford@whitehouse.gov
Grover Cleveland,  7145555555,  gcleveland@whitehouse.gov
Grover Cleveland,  7145555555,  gcleveland@whitehouse.gov
Harry S. Truman,  6055555555,  htruman@whitehouse.gov
Herbert Clark Hoover,  6055555555,  hhoover@whitehouse.gov
James Abram Garfield,  7145555555,  jgarfield@whitehouse.gov
James Buchanan,  4085555555,  jbuchanan@whitehouse.gov
James Earl Carter Jr.,  6055555555, jcarter@whitehouse.gov
James Knox Polk,  4085555555,  jpolk@whitehouse.gov
James Madison,  4085555555,  jmadison@whitehouse.gov
James Monroe,  4085555555,  jmonroe@whitehouse.gov
Joseph Biden, 5705555555, jbiden@whitehouse.gov
John Adams,  4085555555,  jadams@whitehouse.gov
John Fitzgerald Kennedy,  6055555555,  jkennedy@whitehouse.gov
John Quincy Adams,  4085555555,  jqadams@whitehouse.gov
John Tyler,  4085555555,  jtyler@whitehouse.gov
Lyndon Baines Johnson,  6055555555,  ljohnson@whitehouse.gov
Martin Van Buren,  4085555555,  mvanburen@whitehouse.gov
Millard Fillmore,  4085555555,  mfillmore@whitehouse.gov
Richard Milhous Nixon,  6055555555,  rnixon@whitehouse.gov
Ronald Wilson Reagan,  6055555555,  rreagan@whitehouse.gov
Rutherford Birchard Hayes,  7145555555,  rhayes@whitehouse.gov
Theodore Roosevelt,  7145555555,  troosevelt@whitehouse.gov
Thomas Jefferson,  4085555555,  tjefferson@whitehouse.gov
Ulysses S. Grant,  7145555555,  ugrant@whitehouse.gov
Warren Gamaliel Harding,  7145555555,  wharding@whitehouse.gov
William Henry Harrison,  4085555555,  wharrison@whitehouse.gov
William Howard Taft,  7145555555,  wtaft@whitehouse.gov
William Jefferson Clinton,  6055555555,  wclinton@whitehouse.gov
William McKinley,  7145555555,  wmckinley@whitehouse.gov
Woodrow Wilson,  7145555555,  wwilson@whitehouse.gov
Zachary Taylor,  4085555555,  ztaylor@whitehouse.gov

Enter 0 to quit or 1 to complete another action. 4
Unknown command.
Enter 0 to quit or 1 to complete another action. 0
Goodbye!
```

### Grading

Please make sure you have comments for every method you create. As always, your program will be graded on its functionality according to the project specifications and proper code style.
