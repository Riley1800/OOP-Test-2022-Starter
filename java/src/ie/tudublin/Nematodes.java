package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Nematodes {

	private String name;
	private float length;
	private boolean limbs;
	private String gender;
	private boolean eyes; 



	@Override
    public String toString() {
        return "Nematode [Name" + name + ", =" + length + ", limbs" + limbs + ", gender" + gender
                + ", eyes=" + eyes + "]";
    }

	public Nematodes(TableRow tr)
    {
        this(
            tr.getString("Name"), 
            tr.getFloat("Length"), 
            tr.getInt("Limbs") == 1,
            tr.getString("Gender"),
            tr.getInt("Eyes") ==1
        );
    }

	public Nematodes(String name, float length, boolean limbs, String gender, boolean eyes) {
		this.name = name;
		this.length = length;
		this.limbs = limbs;
		this.gender = gender;
		this.eyes = eyes;
	}

	public String getName() {
        return name;
    }
    public void setDisplayName(String name) {
        this.name = name;
    }

	public float getLength() {
        return length;
    }
    public void setDistance(float length) {
        this.length = length;
    }

	public boolean isLimbs() {
        return limbs;
    }

	public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

	public boolean HasEyes() {
        return eyes;
    }

}