package br.com.controlefinanceiro.controlefinanceiro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lancamentos")
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
	private String amount;

	@Column(name = "date")
	private String date;

	@Column(name = "paid")
	private boolean paid;

	@ManyToOne
	@JoinColumn(name = "categoryId", referencedColumnName = "id")
	private Category  categoryId;

	public Entry() {

	}

	public Entry(Long id, String name, String description, String type, String amount, String date, boolean paid,
			Category categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.type = type;
		this.amount = amount;
		this.date = date;
		this.paid = paid;

		this. categoryId =  categoryId;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
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

	public Category getCategoryId() {
		return  categoryId;
	}

	public void setCategoryId(Category  categoryId) {
		this. categoryId =  categoryId;
	}

	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", name=" + name + ", description=" + description + ", type=" + type
				+ ", amount=" + amount + ", date=" + date + ", paid=" + paid + ",  categoryId=" +  categoryId + "]";
	}

	
	
}
