package com.holovinova.entity;

/**
 * Entity class for Animal type
 * 
 * @author Golovinova Oksana
 *
 */
public class Animal {
	/**
	 * Table name
	 */
	public static final String TABLE_NAME = "animal";
	/**
	 * Identifier (auto increment) field name
	 */
	public static final String ID = "id";
	/**
	 * Animal name field name
	 */
	public static final String NAME = "name";
	/**
	 * Animal age field name
	 */
	public static final String AGE = "age";
	/**
	 * Animal type id name
	 */
	public static final String ID_ANIMAL_TYPE = "id_animal_type";
	/**
	 * Identifier
	 */
	private long id;
	/**
	 * Animal name
	 */
	private String name;
	/**
	 * Animal Age
	 */
	private int age;
	/**
	 * Animal type
	 */
	private long animalType;

	/**
	 * Constructor
	 */
	public Animal() {

	}

	/**
	 * Constructor with parameters
	 * 
	 * @param name
	 * @param age
	 * @param animalType
	 */
	public Animal(String name, int age, long animalType) {
		this.name = name;
		this.age = age;
		this.animalType = animalType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getAnimalType() {
		return animalType;
	}

	public void setAnimalType(long animalType) {
		this.animalType = animalType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (int) (animalType ^ (animalType >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (animalType != other.animalType)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nAnimal [id=" + id + ", name=" + name + ", age=" + age + ", animalType=" + animalType + "]";
	}
}
