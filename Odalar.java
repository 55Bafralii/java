package HOTEL;

public class Odalar {

	public String odanumarası;

	public boolean status;

	public Odalar(String odanumarası, Boolean status)

	{
		this.odanumarası = odanumarası;
		this.status = true;

	}

	public void setOdanumarası(String odanumarası) {
		this.odanumarası = odanumarası;
	}

	public String getOdanumarası() {
		return odanumarası;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
