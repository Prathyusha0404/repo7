Find max or min object by object property
List<Employee> employees = new ArrayList<Employee>();

//add few employees
 
Comparator<Employee> comparator = Comparator.comparing( Employee::getAge );
 
// Get Min or Max Object
Employee minObject = employees.stream().min(comparator).get();
Employee maxObject = employees.stream().max(comparator).get();
