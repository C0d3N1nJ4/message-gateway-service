package com.naiomi.messagegateway.pain001;

import java.util.UUID;

public record Pain001Request (
     UUID messageIdentification,
     String creationDateTime,
     String numberOfTransactions,
     String controlSum,
     String initiatorName,
     String initiatorId,
     String initiatorIdScheme,
     String requestedExecutionDate,
     String debtorName,
     String debtorAccount,
     String debtorAccountCurrency,
     String debtorAgent,
     String debtorAgentScheme,
     String debtorAgentName,
     String debtorAgentAddress,
     String debtorAgentAddressLine1,
     String debtorAgentAddressLine2,
     String debtorAgentAddressLine3) {}
