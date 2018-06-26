package th.co.cdgs.jpa.entity;

// default package
// Generated Jun 25, 2018 3:10:49 PM by Hibernate Tools 5.2.10.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Country generated by hbm2java
 */
@Entity
@Table(name = "country")
public class Country implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long countryId;
	private String countryName;
	private Date lastUpdate;
	private Set<City> cities = new HashSet<City>(0);

	public Country() {
	}

	public Country(String countryName, Date lastUpdate) {
		this.countryName = countryName;
		this.lastUpdate = lastUpdate;
	}

	public Country(String countryName, Date lastUpdate, Set<City> cities) {
		this.countryName = countryName;
		this.lastUpdate = lastUpdate;
		this.cities = cities;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "country_id", unique = true, nullable = false)
	public Long getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	@Column(name = "country_name", nullable = false, length = 50)
	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Column(name = "last_update", nullable = false, length = 19)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	public Set<City> getCities() {
		return this.cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

}
