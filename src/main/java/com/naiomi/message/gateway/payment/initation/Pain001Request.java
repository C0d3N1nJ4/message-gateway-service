package com.naiomi.message.gateway.payment.initation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public record Pain001Request (
     @Id UUID messageIdentification,
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
