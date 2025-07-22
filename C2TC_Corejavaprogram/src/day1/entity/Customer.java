package day1.entity;

public class Customer {

	
		public int cid;
		public String cname;
		public String city;
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String tostring() {
			return"customer [Customer id="+cid+", customer name=" + cname +",City=" + city +"]";
		}

	}


