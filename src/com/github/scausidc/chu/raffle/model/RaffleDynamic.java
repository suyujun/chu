package com.github.scausidc.chu.raffle.model;
// Generated 2015-5-12 15:41:53 by Hibernate Tools 4.0.0



/**
 * RaffleDynamic generated by hbm2java
 */
public class RaffleDynamic  implements java.io.Serializable {


    protected Long id;
    protected Integer peerConsumed;
    protected Integer[] awardConsumed;
    protected Integer[] awardTorn;

    public RaffleDynamic() {
    }

    public RaffleDynamic(Raffle r)
    {
        this.id = r.getId();

        this.peerConsumed = 0;

        int length = r.getAwardName().length;

        this.awardConsumed = new Integer[length];
        for (int i=0; i<length; i++)
            this.awardConsumed[i] = 0;

        Integer[] shewing = r.getAwardShewing();
        Integer[] slicing = r.getAwardSlicing();
        this.awardTorn = new Integer[length];
        for (int i=0; i<length; i++)
            this.awardTorn[i] = shewing[i]+slicing[i];

        return;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getPeerConsumed() {
        return this.peerConsumed;
    }

    public void setPeerConsumed(Integer peerConsumed) {
        this.peerConsumed = peerConsumed;
    }
    public Integer[] getAwardConsumed() {
        return this.awardConsumed;
    }

    public void setAwardConsumed(Integer[] awardConsumed) {
        this.awardConsumed = awardConsumed;
    }
    public Integer[] getAwardTorn() {
        return this.awardTorn;
    }

    public void setAwardTorn(Integer[] awardTorn) {
        this.awardTorn = awardTorn;
    }

  // HASH
    @Override
    public int hashCode()
    {
        int hash = 17;

        if (this.id != null)
            hash = hash * 31 + this.id.hashCode();

        return(hash);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return(true);

        if (o==null || !this.getClass().equals(o.getClass()))
            return(false);

        RaffleDynamic c = (RaffleDynamic)o;

        return(
            (this.id == c.id) ||
            (this.id != null && this.id.equals(c.id))
        );
    }



}

