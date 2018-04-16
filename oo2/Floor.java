package oo2;

public class Floor {
	private Boolean upbutton;
	private Boolean downbutton;
	
	public Boolean getUpbutton() {
		return upbutton;
	}

	public Boolean getDownbutton() {
		return downbutton;
	}

	public void setUpbutton(Boolean upbutton) {
		this.upbutton = upbutton;
	}

	public void setDownbutton(Boolean downbutton) {
		this.downbutton = downbutton;
	}

	Floor()
	{
		this.upbutton = false;
		this.downbutton = false;
	}
	
}
