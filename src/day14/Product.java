package day14;

public class Product{
    private int prodid;
    private String prodcuttitle;
    private double prodcost;
    private String proddesc;
    private String prodcategory;
    private String prodimage;
    
    public Product() {}
	public Product(int prodid, String prodcuttitle, double prodcost, String proddesc, String prodcategory,
			String prodimage) {
		super();
		this.prodid = prodid;
		this.prodcuttitle = prodcuttitle;
		this.prodcost = prodcost;
		this.proddesc = proddesc;
		this.prodcategory = prodcategory;
		this.prodimage = prodimage;
	}
	
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdcuttitle() {
		return prodcuttitle;
	}
	public void setProdcuttitle(String prodcuttitle) {
		this.prodcuttitle = prodcuttitle;
	}
	public double getProdcost() {
		return prodcost;
	}
	public void setProdcost(double prodcost) {
		this.prodcost = prodcost;
	}
	public String getProddesc() {
		return proddesc;
	}
	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}
	public String getProdcategory() {
		return prodcategory;
	}
	public void setProdcategory(String prodcategory) {
		this.prodcategory = prodcategory;
	}
	public String getProdimage() {
		return prodimage;
	}
	public void setProdimage(String prodimage) {
		this.prodimage = prodimage;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodcuttitle=" + prodcuttitle + ", prodcost=" + prodcost + ", proddesc="
				+ proddesc + ", prodcategory=" + prodcategory + ", prodimage=" + prodimage + "]";
	}
 
}

