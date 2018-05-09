package com.holovinova.entity;

/**
 * Entity class for AnimalType type
 * 
 * @author Golovinova Oksana
 *
 */
public class AnimalType {
	/**
	 * Table name
	 */
	public static final String TABLE_NAME = "animal_type";
	/**
	 * Identifier (auto increment) field name
	 */
	public static final String ID = "id";
	/**
	 * Animal title field name
	 */
	public static final String TITLE = "title";
	/**
	 * Identifier
	 */
	private long id;
	/**
	 * Animal type title
	 */
	private String title;

	/**
	 * Constructor
	 */
	public AnimalType() {

	}

	/**
	 * Constructor with parameters
	 * 
	 * @param id
	 * @param title
	 */
	public AnimalType(String title) {
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		AnimalType other = (AnimalType) obj;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AnimalType [id=" + id + ", title=" + title + "]";
	}

}
