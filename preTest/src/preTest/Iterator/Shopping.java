package inclasslecturedemo;

public class Shopping {
  private String iname;
  private double price;
  
  public Shopping(String iname, double price){
	  this.iname = iname;
	  this.price = price;
  }
  
  @Override
  public String toString(){
	  return iname + " " + price;
  }
  
 /* @Override
  public boolean equals(Object ob){
	  if(ob==null) return false;
	  if(ob==this) return true;
	  if(!(ob instanceof Shopping)){
		  return false;
	  }
	  
	  Shopping x = (Shopping) ob;
	  if(this.iname.equals(x.iname) && this.price == x.price)
		  return true;
	  else
		  return false;
  }*/

public String getIname() {
	return iname;
}

public void setIname(String iname) {
	this.iname = iname;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
}
