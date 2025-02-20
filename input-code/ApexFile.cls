public with sharing class ProposalController {
    private static final String PROPOSAL_SERVICE = new ProposalService();

    @AuraEnabled
    public int totalPlanets { get; set; }
    @AuraEnabled
    public String country { get; set; }
	@AuraEnabled
	public Id proposalId;
	@AuraEnabled
	public Date proposalStartDate;
	@AuraEnabled
    public Int count;
    @AuraEnabled
    public int count2;
	@AuraEnabled
    public String[] supportedCountries;
    @AuraEnabled
    public List<String> supportedPlanets;
    @AuraEnabled
    public Map<String, String[]> countriesToPlanet;
    @AuraEnabled
    public Map<String, CityLocation[]> countryToCities;
    @AuraEnabled
    public Map<String, Map<String, CityLocation[]>> planetCountryCities;
    @AuraEnabled
    public Map<String, Map<String, List<CityLocation>>> planetCountryCityLocations;
    @AuraEnabled
    public MyClass.InnerType customTypeVar;

    // parser should stub out this method in typescript
	@AuraEnabled
	public static Boolean isAccountValid(String accountId) {
		return PROPOSAL_SERVICE.accountIsValid(accountId);
	}

    // parser should ignore this method
	public static Boolean isProposal(String recordId) {
		SObjectType proposalType = Proposal__c.sObjectType;
		return recordId.getSObjectType() == proposalType;
	}
}
