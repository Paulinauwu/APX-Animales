package com.bbva.mzic.dto.project4;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The AnimalesDTO class...
 */
public class DogDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;


	private String id;
	private String name;

	List<CatDTO> cat = new ArrayList<>();
	List<FelinoDTO> felino= new ArrayList<>();


	public String getName() {
		return this.name;
	}

	
	public void setName(final String name) {
		this.name = name;
	}

	
	public String getId() {
		return this.id;
	}

	/**
	 * Set the surname attribute
	 */
	public void setId(final String id) {
		this.id = id;
	}

	
	public ArrayList<CatDTO> getCats() {
        return this.cats;
    }


    public void setCat(final ArrayList<CatDTO> cats) {
        this.cats = cat;
    }


    public ArrayList<FelinoDTO> getFelino() {
        return this.felino;
    }


    public void setFelinos(final ArrayList<FelinoDTO> felinos) {
        this.felinos = felinos;
    }

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final AnimalesDTO rhs = (AnimalesDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(name, rhs.name)
					.append(surname, rhs.id)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.name)
			.append(this.id)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("name", name)
			.append("id", id)
			.toString();
	}
}
