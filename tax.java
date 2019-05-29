class tax{
	private String type;
	private BigDecimal rate;
      public  tax(String type,BigDecimal rate) {
    	  this.type = type;
    	  this.rate = rate;
    	  
      }
      public BigDecimal getRate() {
    	  return this.rate;
      }
}
