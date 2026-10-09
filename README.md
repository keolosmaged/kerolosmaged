# Employee Management System

**Name:** kerolos maged
**Student ID:** 2302032

## Description
Java implementation of a UML class diagram for an employee management system.
`Employee` is an abstract class extended by `CommissionEmployee`, `MonthlyEmployee`
and `HourlyEmployee`. A `Department` holds a manager and a list of employees.
`Gender` is an enum.

## How to run
```bash
mkdir out
javac -d out $(find src -name "*.java")
java -cp out Main
```
(Requires JDK 11+.)
