package entity;

public class Lancamento {

	private Long id;
	private String name;
	private String description;
	private String type;
	private String amount;
	private String date;
	private boolean paid;
	private Long categoryId;

	public Lancamento() {
		super();
	}

	public Lancamento(Long id, String name, String description, String type, String amount, String date, boolean paid,
			Long categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.type = type;
		this.amount = amount;
		this.date = date;
		this.paid = paid;
		this.categoryId = categoryId;
	}

	public void despesa() {
	}

	public void receita() {
	}

	public void pago() {
	}

	public void pendente() {
	}

	public void dataDoAcontecimento() {
	}

	public void valor() {
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

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Lançamento [id = " + id + ", name = " + name + ", description = " + description + ", type = " + type
				+ ", amount = " + amount + ", date = " + date + ", paid = " + paid + ", categoryId = " + categoryId
				+ "]";
	}
	
}
