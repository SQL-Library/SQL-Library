# [DEPRECATED] SQL Library (currently under development)

# How to use: (add to docs)
Set up username, password and url for db by instantiating a Secrets <br />
object using Secrets.java methods. Use Secrets setters at the beginning of your application <br />
`Secrets credentials = new Secrets(username_goes_here, username_goes_here, url_goes_here);` <br />
Also be sure to set class with throws IOException for error handling

## Create methods:
- void createNewTable(String tableName, String[] columns, String[] dataTypes, Secrets credentials) throws exception
- void insertIntoTable(String tableName, String[] columns, String[] dataTypes, String[] values, Secrets credentials) throws exception
- void createNewColumn(String tableName, String columnName, String dataType, Secrets credentials) throws exception

## Relational SQL services support:
#### - Postgres
#### - Spring
#### - MariaDB
#### - MongoDB
#### - MySQL
#### - SQLite
#### - SQL Server
#### - Oracle Database
#### - Tomcat
#### - Spring Boot Starter
#### - Hive

### Disclaimer of Software Warranty. <br />
THIS LIBRARY PROVIDES THE SOFTWARE TO YOU "AS IS" AND WITHOUT WARRANTY OF ANY KIND, EXPRESS, <br />
STATUTORY, IMPLIED OR OTHERWISE, INCLUDING WITHOUT LIMITATION ANY WARRANTY OF MERCHANTABILITY, <br />
FITNESS FOR A PARTICULAR PURPOSE OR INFRINGEMENT. NO ORAL OR WRITTEN INFORMATION OR ADVICE GIVEN <br />
TO YOU BY ANY EMPLOYEE, REPRESENTATIVE OR DISTRIBUTOR WILL CREATE A WARRANTY FOR THE SOFTWARE, <br />
AND YOU MAY NOT RELY ON ANY SUCH INFORMATION OR ADVICE.

### Licenses
- [Apache License](Licenses/Apache_License)
- [GNU AGPLv3 License](Licenses/GNU_AGPLv3)

Notes:
    - continuing development at a later date after full java fundamentals learned
