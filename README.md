# Java practice

### Email Application
- Generate the `email` with the following syntax *firstname.lastname@department.company.com*
- Determine the `department` (**sales**, **development**, **accounting**), if **none** leave it blank
- Generate random string for a `password`
- Provide **set** methods to `change the password`, `set the mail box capacity`, and `define an alternate email address`
- Provide **get** method to `display the name`, `email`, and `mailbox capacity`

### Student Database Application
- Ask the user how many **new students** will be added to the database
- The user should be promoted to enter **name** and **year** of each student
- The student should have **5-digit unique ID**, with the first number being their **grade level**
- A student can enroll in the following **courses**:
    - *Histrory 101*
    - *Mathematics 101*
    - *English 101*
    - *Chemistry 101*
    - *Computer Science 101*
- Each course costs **$600** to enroll
- The students should be able to view their **balance** and **pay the tution**
- To see the status of student, we should see their **name**, **ID**, **course**, **enrolled**, and **balance**

### New Bank Account Application

##### Scenario: You are back-end developer and need to create an application to handle new customer bank account request.

- Read **.csv** file of *name*, *social security numbers*, *account type*, and *initial deposit*
- Use proper **data structure** to hold all these accounts
- Both saving and checking accounts share the following properties:
    - *deposit()*
    - *withdraw()*
    - *transfer()*
    - *showInfo()*

    - *11-Digit Account Number (generated with following process: 1 or 2 depending on Saving or Checking, last two digits of SSN, unique 5-digit number, and random 3-digit number)*
- **Saving Account** holders are given a **Safety Deposit Box**, identified by a *3-digit number* and accessed with *4-digit code*
- **Checking Account** holders are assigned a **Debit Card** with *12-digit number* and *4-digit PIN*
- Both accounts will use an interface that determines the **base interest rate**
    - *Saving accounts will use **.25 points** less than a base rate*
    - *Checking accounts will use **15%** of the base rate*
- The **ShowInfo** method should reveal relevant account information as well as information specific to the Checking account or Saving account


License
----

MIT