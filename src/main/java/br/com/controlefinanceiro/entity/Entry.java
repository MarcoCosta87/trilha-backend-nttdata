package br.com.controlefinanceiro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Entry")
public class Entry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "type")
	private String type;

	@Column(name = "amount")
	private double amount;

	@Column(name = "date")
	private String date;

	@Column(name = "paid")
	private boolean paid;

	@ManyToOne
	@JoinColumn(name = "categoryId", referencedColumnName = "id")
	private Category category;

	public Entry() {

	}

	public Entry(Long id, String name, String description, String type, double amount, String date, boolean paid,
			Category category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.type = type;
		this.amount = amount;
		this.date = date;
		this.paid = paid;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategoryId(Category categoryId) {
		this.category = categoryId;
	}

	@Override
	public String toString() {
		return "Entry [id=" + id + ", name=" + name + ", description=" + description + ", type=" + type + ", amount="
				+ amount + ", date=" + date + ", paid=" + paid + ", category=" + category + "]";
	}

}
