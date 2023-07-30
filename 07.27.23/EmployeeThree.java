EmployeeThree e = new DerivedFour();

1.Object o = (EmployeeOne)e;//invalid because of rule number One
2.Object o = (EmployeeTwo)e;//invalid because of rule number one
3.Object o = (DerivedSix)e;//invalid because of rule number 2 of the compiler
4.Object o = (EmployeeThree)e;//invalid because of the rule number 1 of JVM . fail during runtime
5.Object o = (DerivedTwo)e;//invalid because of rule number 1
6.Object o = (DerivedOne)e;//invalid because of rule 1
7.Object o = (DerivedFive)e;//invalid because of rule number 2 
8.Object o = (DerivedFour)e;//invalid because of rule number 1
