public with sharing class ProposalController {
    private static final String PROPOSAL_SERVICE = new ProposalService();

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
