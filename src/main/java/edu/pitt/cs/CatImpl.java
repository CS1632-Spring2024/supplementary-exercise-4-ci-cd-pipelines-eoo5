package edu.pitt.cs;

public class CatImpl implements Cat {

	private int id;
	private String name;
	private boolean rented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		this.rented = false;
	}

	/**
	 * Rent cat. Simply sets the rented flag to true.
	 */
	public void rentCat() {
		this.rented = true;
	}

	/**
	 * Return cat. Simply sets the rented flag to false.
	 */
	public void returnCat() {
		this.rented = false;
	}

	/**
	 * Rename cat. Simply sets the name to the new name.
	 * 
	 * @param String name New name of the cat
	 */
	public void renameCat(String name) {
		this.name = name;
	}

	/**
	 * Accessor for name variable. Returns the name of this cat.
	 * 
	 * @return String name of cat
	 */

	public String getName() {
		return this.name;
	}

	/**
	 * Accessor for id variable. Returns the ID of this cat.
	 * 
	 * @return int ID of this cat
	 */

	public int getId() {
		return this.id;
	}

	/**
	 * Accessor for rented variable. Returns if cat is rented.
	 * 
	 * @return boolean - true if rented, false otherwise
	 */

	public boolean getRented() {
		return this.rented;
	}

	/**
	 * Returns string version of this cat, in form: "ID *idnum*. *name*" Example
	 * for cat of ID 1, name Jennyanydots: "ID 1. Jennyanydots"
	 * 
	 * @return String string version of cat
	 */

	public String toString() {
		String catString = "ID " + this.id + ". " + this.name;
		return catString;
	}

}