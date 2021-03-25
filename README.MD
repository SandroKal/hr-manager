# HR Manager

Fork this project to get started.

## Introduction
This Application is used to manage the Employees of the company Monosis Ltd. <br/>
The HR Manager supports by default the following functions:
- Adding an Employee to the Database
- Editing the information of an Employee
- Deleting an Employee
- Listing all Employees

## Assignment
We prepared the very basic structure of the HR Manager.<br/>
Now we need you to complete the application.<br/>
We left some methods empty with the following remark: `//TODO: implement`. You need to implement them.<br/>
We also left some comments in already existing code like: `//TODO: add error handling`. Here you need to complete the method.
You will need to add some methods by your own.

## End of the Coding Challenge
It's not important if you can finish the challenge or not. We just want to see you coding skills and styles. So please commit all your changes even if you have errors or just some methods implemented.<br/>
In the end of the coding challenge please make sure you committed you code to [GitLab](https://gitlab.ubs.net/).<br/>
You can do this by executing the following command: `git add -A && git commit -m"implemented methodes of the coding challenge" && git push origin master`.<br/>
And be sure you shared your project with [Leon Krug](https://gitlab.net/leon.krug), [Emanuel Sedlacek](https://gitlab.net/emanuel.sedlacek) and [Enma Ronquillo](https://gitlab.net/enma.ronquillo).

## Run the application
Make sure you have Java JDK 1.8^ installed. <br/>
We recommend using IntelliJ or Eclipse as your IDE.

## Additional tasks
You can implement additional functions to the HR Manager if you are finished with the other ones:

### Order employees by salary
List the employees by there salary. asc and desc<br/>
Make sure to also calculate the monthly salary and show it in the list.

**_Goody:_**<br/>
Print out the average income of the Monosis Ltd.

### Order employees by age
List the employees by there age. asc and desc<br/>
Make sure to also show there age, not just the Birthday.

### Order employees alphabetically 
List the employees alphabetically by surname asc and desc.

### List all employees who are about to retire
List all employees who are 63 or older.<br/>
Make sure to also show when they will retire (in days).

### List all employees who have an anniversary to celebrate
List all employees who are 5, 10, 15, 20, 25 etc.. years at Monosis Ltd.<br/>
Make sure to show the anniversary of the employee.

### Export all employees as CSV
Export the list to a CSV File.

### Export all employees as JSON Array
Export the employees as an JSON File.

## Example results:

### List employees
TEST FROM HACKMACOVOCRACK
```------------------------------------------------------------------------------------------------------------------------------------------------------------
           ID                           NAME             BIRTH DATE                          JOB DESCRIPTION     SALARY        EMPLOYMENT DATE
   ------------------------------------------------------------------------------------------------------------------------------------------------------------
     1b92f30c                     Max Muster             16.11.1980                               IT Analyst    30000.0             01.03.2001
     78dfeae5                    Rora Farish             12.12.1988                              HR Employee    64000.0             01.02.2005
     a60b6200                     Gena Pudan             28.01.1990                          Junior Designer    35000.0             01.04.2001
     4652be2b                   Benji Caress             30.05.1992      Senior Visual Merchandise Associate    42000.0             01.07.2010
     a3209a50                 Windham Duggan             24.07.2002                               IT Trainee    12000.0             01.08.2018
     b9f8a929                  Nessa Sizland             19.09.2000                     Full Stack Developer    32540.0             01.08.2020
     2402591f                    Mead Hunton             27.07.1971         Entry Level - Associate Designer   45678.26             01.07.1990
     557d5a60                 Jeniffer Sevin             30.04.1983                      Front End Developer    86473.3             01.06.1999
     ed995e50                Clayborn Redler             31.03.1951                                 Director   126980.0             23.06.1970
     ffa2d24b                   Wandis Ellit             03.06.1953                   Strategic Data Analyst   14532.16             01.02.1970
     377d2549                    Rolph Liven             09.07.1966                         Product Designer    50640.0             16.01.1989
     c546728d                 Lotta Buncombe             18.11.1993          Banking Relationship Specialist   12345.67             01.07.2012
     8da162bd                Thaddus Gergler             16.10.1997     Wealth Management Banking Specialist   98765.12             01.04.2016
     c4e237fb               Huntlee McMurtyr             05.08.1997                                   Intern    12120.0             01.09.2019
     35a73dc9                 Leonelle Diben             01.02.1990            Electronic Banking Specialist  100000.11             01.08.2009
     b9b89024                Stanislaus Carp             23.04.1981        Consumer Banking Global Analytics    85421.0             01.10.2005
     5e4484ee                     Wynn Oriel             12.05.1985               Virtual Banking Specialist    98453.0             14.12.1999
     4190b67a               Galvin Babington             01.05.1966                                      CEO   250000.0             01.11.1985
     1f1a9569                 Annie MacAskie             25.08.1969                     Financial Specialist   29000.45             01.07.1988
     742a8a72                 Thedrick Bruun             01.12.2000                           HR Coordinator   55000.99             01.07.2020
   ------------------------------------------------------------------------------------------------------------------------------------------------------------
```

*Hint:*<br/>
You can format your table by using `System.out.printf("%10s %30s %22s %40s %10s %22s", "ID", "NAME", "BIRTH DATE", "JOB DESCRIPTION", "SALARY", "EMPLOYMENT DATE");`
