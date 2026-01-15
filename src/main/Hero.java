package main;

class Hero {
	private String superName;
	private String powers;
	private int age;
	private String city;
	public Hero(String superName, String powers, int age, String city) {
		super();
		this.superName = superName;
		this.powers = powers;
		this.age = age;
		this.city = city;
	}
	public String getSuperName() {
		return superName;
	}
	public void setSuperName(String superName) {
		this.superName = superName;
	}
	public String getPowers() {
		return powers;
	}
	public void setPowers(String powers) {
		this.powers = powers;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Hero [superName= " + superName + ", powers= " + powers + ", age= " + age + ", city= " + city + "]";
	}
}
