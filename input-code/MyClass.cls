public with sharing class MyClass {
    @AuraEnabled
    public List<String> properties { get; set; }

    public with sharing class InnerType {
        @AuraEnabled
    	public String id;
    }
}
