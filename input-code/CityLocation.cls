public with sharing class CityLocation {
    @AuraEnabled
    public int name { get; set; }

    @AuraEnabled
    public int state { get; set; }
}
