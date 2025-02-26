public inherited sharing class InheritedSharing {
	// method with identifier "get"
	public Object get(String name) {
		return name;
	}

	// standard getter property
	public Integer sharedProp {
		get {
			return 0;
		}
		set;
	}
}
