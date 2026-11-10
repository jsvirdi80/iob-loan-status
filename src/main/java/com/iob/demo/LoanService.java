package com.iob.demo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class LoanService {

    private final Map<String, Loan> loans = new LinkedHashMap<>();

    public LoanService() {
        add(new Loan("LN-1001", "Anitha R.", "Home loan", 4_500_000, "Approved"));
        add(new Loan("LN-1002", "Karthik S.", "Vehicle loan", 850_000, "Under review"));
        add(new Loan("LN-1003", "Meena V.", "Education loan", 1_200_000, "Disbursed"));
        add(new Loan("LN-1004", "Ravi K.", "MSME loan", 2_750_000, "Documents pending"));
    }

    private void add(Loan loan) {
        loans.put(loan.getId(), loan);
    }

    public Collection<Loan> all() {
        return loans.values();
    }

    public Optional<Loan> find(String id) {
        return Optional.ofNullable(loans.get(id));
    }
}
