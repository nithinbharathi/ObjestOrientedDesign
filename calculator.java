class calculator{
   static HashMap<String,tax> tax;
   static ArrayList<String>excempt =  new ArrayList<>();
	public calculator(){
		tax = new HashMap<>();
	}
	public void add(String nameOfTax,tax t) {
		tax.put(nameOfTax,t);
	}
	public void addExcemptions(String str) {
		excempt.add(str);
	}
	public BigDecimal calc_tax(Product p) {
		BigDecimal price = p.getPrice();
		BigDecimal total = new BigDecimal(0.0);
		if(p.getisImported()) {
			tax to_be_applied = tax.get("import");
			BigDecimal after_apply = (calc_tax(price,to_be_applied));
			total = total.add(after_apply);
			
		}
		if(!is_excempt(p)) {
			tax to_be_applied = tax.get("basic");
			BigDecimal after_apply = (calc_tax(price,to_be_applied));
			total = total.add(after_apply);
		}
		return total;
		
	}
	private BigDecimal calc_tax(BigDecimal price ,tax t) {
		return price.multiply(t.getRate());
	}
	public static boolean is_excempt(Product p) {
		 String type = p.getType();
		 for(String types:excempt) {
			 if(type.equals(types)) {
				 return true;
			 }
		 }
		return false;
	}
	
}
