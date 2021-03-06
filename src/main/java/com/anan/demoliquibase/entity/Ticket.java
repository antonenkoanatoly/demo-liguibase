package com.anan.demoliquibase.entity;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "payout")
    private Double payout;

    @Column(name = "external_state")
    @Enumerated(EnumType.STRING)
    private ExternalState externalState;

    @Column(name = "is_paid_out")
    private boolean isPaidOut;

    protected Ticket() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPayout() {
        return payout;
    }

    public void setPayout(Double payout) {
        this.payout = payout;
    }

    public ExternalState getExternalState() {
        return externalState;
    }

    public void setExternalState(ExternalState externalState) {
        this.externalState = externalState;
    }

    public boolean isPaidOut() {
        return isPaidOut;
    }

    public void setPaidOut(boolean paidOut) {
        isPaidOut = paidOut;
    }
}
