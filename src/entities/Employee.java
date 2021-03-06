package entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee objectToCompare) {
		// retorna numero positivo se o objeto base for MAIOR que o objeto a comparar
		// retorna numero negativo se o objeto base for MENOR que o objeto a comparar
		// retorna 0 se forem iguais
		return salary.compareTo(objectToCompare.getSalary());
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}
