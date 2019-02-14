package com.example.demo;

public class Employee {
	
		private Long id;
		private String name;
		private String role;
		
		public Employee (Long id, String name, String role) {
			setId(id);
			setName(name);
			setRole(role);
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getRole() {
			return role;
		}
		
		public void setRole(String role) {
			this.role = role;
		}
		
		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id = id;
		}

}
