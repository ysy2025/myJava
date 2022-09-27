package com.glodon.mybatis.pojo;

public class Fifa {
    public int ID;
    private String Name;
    private String Age;
    private String Photo;
    private String Nationality;
    private String Flag;
    private String Overall;
    private String Potential;
    private String Club;
    private String Club_Logo;
    private String Value;
    private String Wage;
    private String Special;
    private String Preferred_Foot;
    private String International_Reputation;
    private String Weak_Foot;
    private String Skill_Moves;
    private String Work_Rate;
    private String Body_Type;
    private String Real_Face;
    private String Position;
    private String Jersey_Number;
    private String Joined;
    private String Loaned_From;
    private String Contract_Valid_Until;
    private String Height;
    private String Weight;
    private String LS;
    private String ST;
    private String RS;
    private String LW;
    private String LF;
    private String CF;
    private String RF;
    private String RW;
    private String LAM;
    private String CAM;
    private String RAM;
    private String LM;
    private String LCM;
    private String CM;
    private String RCM;
    private String RM;
    private String LWB;
    private String LDM;
    private String CDM;
    private String RDM;
    private String RWB;
    private String LB;
    private String LCB;
    private String CB;
    private String RCB;
    private String RB;
    private String Crossing;
    private String Finishing;
    private String HeadingAccuracy;
    private String ShortPassing;
    private String Volleys;
    private String Dribbling;
    private String Curve;
    private String FKAccuracy;
    private String LongPassing;
    private String BallControl;
    private String Acceleration;
    private String SprintSpeed;
    private String Agility;
    private String Reactions;
    private String Balance;
    private String ShotPower;
    private String Jumping;
    private String Stamina;
    private String Strength;
    private String LongShots;
    private String Aggression;
    private String Interceptions;
    private String Positioning;
    private String Vision;
    private String Penalties;
    private String Composure;
    private String Marking;
    private String StandingTackle;
    private String SlidingTackle;
    private String GKDiving;
    private String GKHandling;
    private String GKKicking;
    private String GKPositioning;
    private String GKReflexes;
    private String Release_Clause;

    public Fifa(int ID, String name, String age, String photo, String nationality, String flag, String overall, String potential, String club, String club_Logo, String value, String wage, String special, String preferred_Foot, String international_Reputation, String weak_Foot, String skill_Moves, String work_Rate, String body_Type, String real_Face, String position, String jersey_Number, String joined, String loaned_From, String contract_Valid_Until, String height, String weight, String LS, String ST, String RS, String LW, String LF, String CF, String RF, String RW, String LAM, String CAM, String RAM, String LM, String LCM, String CM, String RCM, String RM, String LWB, String LDM, String CDM, String RDM, String RWB, String LB, String LCB, String CB, String RCB, String RB, String crossing, String finishing, String headingAccuracy, String shortPassing, String volleys, String dribbling, String curve, String FKAccuracy, String longPassing, String ballControl, String acceleration, String sprintSpeed, String agility, String reactions, String balance, String shotPower, String jumping, String stamina, String strength, String longShots, String aggression, String interceptions, String positioning, String vision, String penalties, String composure, String marking, String standingTackle, String slidingTackle, String GKDiving, String GKHandling, String GKKicking, String GKPositioning, String GKReflexes, String release_Clause) {
        this.ID = ID;
        Name = name;
        Age = age;
        Photo = photo;
        Nationality = nationality;
        Flag = flag;
        Overall = overall;
        Potential = potential;
        Club = club;
        Club_Logo = club_Logo;
        Value = value;
        Wage = wage;
        Special = special;
        Preferred_Foot = preferred_Foot;
        International_Reputation = international_Reputation;
        Weak_Foot = weak_Foot;
        Skill_Moves = skill_Moves;
        Work_Rate = work_Rate;
        Body_Type = body_Type;
        Real_Face = real_Face;
        Position = position;
        Jersey_Number = jersey_Number;
        Joined = joined;
        Loaned_From = loaned_From;
        Contract_Valid_Until = contract_Valid_Until;
        Height = height;
        Weight = weight;
        this.LS = LS;
        this.ST = ST;
        this.RS = RS;
        this.LW = LW;
        this.LF = LF;
        this.CF = CF;
        this.RF = RF;
        this.RW = RW;
        this.LAM = LAM;
        this.CAM = CAM;
        this.RAM = RAM;
        this.LM = LM;
        this.LCM = LCM;
        this.CM = CM;
        this.RCM = RCM;
        this.RM = RM;
        this.LWB = LWB;
        this.LDM = LDM;
        this.CDM = CDM;
        this.RDM = RDM;
        this.RWB = RWB;
        this.LB = LB;
        this.LCB = LCB;
        this.CB = CB;
        this.RCB = RCB;
        this.RB = RB;
        Crossing = crossing;
        Finishing = finishing;
        HeadingAccuracy = headingAccuracy;
        ShortPassing = shortPassing;
        Volleys = volleys;
        Dribbling = dribbling;
        Curve = curve;
        this.FKAccuracy = FKAccuracy;
        LongPassing = longPassing;
        BallControl = ballControl;
        Acceleration = acceleration;
        SprintSpeed = sprintSpeed;
        Agility = agility;
        Reactions = reactions;
        Balance = balance;
        ShotPower = shotPower;
        Jumping = jumping;
        Stamina = stamina;
        Strength = strength;
        LongShots = longShots;
        Aggression = aggression;
        Interceptions = interceptions;
        Positioning = positioning;
        Vision = vision;
        Penalties = penalties;
        Composure = composure;
        Marking = marking;
        StandingTackle = standingTackle;
        SlidingTackle = slidingTackle;
        this.GKDiving = GKDiving;
        this.GKHandling = GKHandling;
        this.GKKicking = GKKicking;
        this.GKPositioning = GKPositioning;
        this.GKReflexes = GKReflexes;
        Release_Clause = release_Clause;
    }

    public Fifa() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getFlag() {
        return Flag;
    }

    public void setFlag(String flag) {
        Flag = flag;
    }

    public String getOverall() {
        return Overall;
    }

    public void setOverall(String overall) {
        Overall = overall;
    }

    public String getPotential() {
        return Potential;
    }

    public void setPotential(String potential) {
        Potential = potential;
    }

    public String getClub() {
        return Club;
    }

    public void setClub(String club) {
        Club = club;
    }

    public String getClub_Logo() {
        return Club_Logo;
    }

    public void setClub_Logo(String club_Logo) {
        Club_Logo = club_Logo;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public String getWage() {
        return Wage;
    }

    public void setWage(String wage) {
        Wage = wage;
    }

    public String getSpecial() {
        return Special;
    }

    public void setSpecial(String special) {
        Special = special;
    }

    public String getPreferred_Foot() {
        return Preferred_Foot;
    }

    public void setPreferred_Foot(String preferred_Foot) {
        Preferred_Foot = preferred_Foot;
    }

    public String getInternational_Reputation() {
        return International_Reputation;
    }

    public void setInternational_Reputation(String international_Reputation) {
        International_Reputation = international_Reputation;
    }

    public String getWeak_Foot() {
        return Weak_Foot;
    }

    public void setWeak_Foot(String weak_Foot) {
        Weak_Foot = weak_Foot;
    }

    public String getSkill_Moves() {
        return Skill_Moves;
    }

    public void setSkill_Moves(String skill_Moves) {
        Skill_Moves = skill_Moves;
    }

    public String getWork_Rate() {
        return Work_Rate;
    }

    public void setWork_Rate(String work_Rate) {
        Work_Rate = work_Rate;
    }

    public String getBody_Type() {
        return Body_Type;
    }

    public void setBody_Type(String body_Type) {
        Body_Type = body_Type;
    }

    public String getReal_Face() {
        return Real_Face;
    }

    public void setReal_Face(String real_Face) {
        Real_Face = real_Face;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getJersey_Number() {
        return Jersey_Number;
    }

    public void setJersey_Number(String jersey_Number) {
        Jersey_Number = jersey_Number;
    }

    public String getJoined() {
        return Joined;
    }

    public void setJoined(String joined) {
        Joined = joined;
    }

    public String getLoaned_From() {
        return Loaned_From;
    }

    public void setLoaned_From(String loaned_From) {
        Loaned_From = loaned_From;
    }

    public String getContract_Valid_Until() {
        return Contract_Valid_Until;
    }

    public void setContract_Valid_Until(String contract_Valid_Until) {
        Contract_Valid_Until = contract_Valid_Until;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getLS() {
        return LS;
    }

    public void setLS(String LS) {
        this.LS = LS;
    }

    public String getST() {
        return ST;
    }

    public void setST(String ST) {
        this.ST = ST;
    }

    public String getRS() {
        return RS;
    }

    public void setRS(String RS) {
        this.RS = RS;
    }

    public String getLW() {
        return LW;
    }

    public void setLW(String LW) {
        this.LW = LW;
    }

    public String getLF() {
        return LF;
    }

    public void setLF(String LF) {
        this.LF = LF;
    }

    public String getCF() {
        return CF;
    }

    public void setCF(String CF) {
        this.CF = CF;
    }

    public String getRF() {
        return RF;
    }

    public void setRF(String RF) {
        this.RF = RF;
    }

    public String getRW() {
        return RW;
    }

    public void setRW(String RW) {
        this.RW = RW;
    }

    public String getLAM() {
        return LAM;
    }

    public void setLAM(String LAM) {
        this.LAM = LAM;
    }

    public String getCAM() {
        return CAM;
    }

    public void setCAM(String CAM) {
        this.CAM = CAM;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getLM() {
        return LM;
    }

    public void setLM(String LM) {
        this.LM = LM;
    }

    public String getLCM() {
        return LCM;
    }

    public void setLCM(String LCM) {
        this.LCM = LCM;
    }

    public String getCM() {
        return CM;
    }

    public void setCM(String CM) {
        this.CM = CM;
    }

    public String getRCM() {
        return RCM;
    }

    public void setRCM(String RCM) {
        this.RCM = RCM;
    }

    public String getRM() {
        return RM;
    }

    public void setRM(String RM) {
        this.RM = RM;
    }

    public String getLWB() {
        return LWB;
    }

    public void setLWB(String LWB) {
        this.LWB = LWB;
    }

    public String getLDM() {
        return LDM;
    }

    public void setLDM(String LDM) {
        this.LDM = LDM;
    }

    public String getCDM() {
        return CDM;
    }

    public void setCDM(String CDM) {
        this.CDM = CDM;
    }

    public String getRDM() {
        return RDM;
    }

    public void setRDM(String RDM) {
        this.RDM = RDM;
    }

    public String getRWB() {
        return RWB;
    }

    public void setRWB(String RWB) {
        this.RWB = RWB;
    }

    public String getLB() {
        return LB;
    }

    public void setLB(String LB) {
        this.LB = LB;
    }

    public String getLCB() {
        return LCB;
    }

    public void setLCB(String LCB) {
        this.LCB = LCB;
    }

    public String getCB() {
        return CB;
    }

    public void setCB(String CB) {
        this.CB = CB;
    }

    public String getRCB() {
        return RCB;
    }

    public void setRCB(String RCB) {
        this.RCB = RCB;
    }

    public String getRB() {
        return RB;
    }

    public void setRB(String RB) {
        this.RB = RB;
    }

    public String getCrossing() {
        return Crossing;
    }

    public void setCrossing(String crossing) {
        Crossing = crossing;
    }

    public String getFinishing() {
        return Finishing;
    }

    public void setFinishing(String finishing) {
        Finishing = finishing;
    }

    public String getHeadingAccuracy() {
        return HeadingAccuracy;
    }

    public void setHeadingAccuracy(String headingAccuracy) {
        HeadingAccuracy = headingAccuracy;
    }

    public String getShortPassing() {
        return ShortPassing;
    }

    public void setShortPassing(String shortPassing) {
        ShortPassing = shortPassing;
    }

    public String getVolleys() {
        return Volleys;
    }

    public void setVolleys(String volleys) {
        Volleys = volleys;
    }

    public String getDribbling() {
        return Dribbling;
    }

    public void setDribbling(String dribbling) {
        Dribbling = dribbling;
    }

    public String getCurve() {
        return Curve;
    }

    public void setCurve(String curve) {
        Curve = curve;
    }

    public String getFKAccuracy() {
        return FKAccuracy;
    }

    public void setFKAccuracy(String FKAccuracy) {
        this.FKAccuracy = FKAccuracy;
    }

    public String getLongPassing() {
        return LongPassing;
    }

    public void setLongPassing(String longPassing) {
        LongPassing = longPassing;
    }

    public String getBallControl() {
        return BallControl;
    }

    public void setBallControl(String ballControl) {
        BallControl = ballControl;
    }

    public String getAcceleration() {
        return Acceleration;
    }

    public void setAcceleration(String acceleration) {
        Acceleration = acceleration;
    }

    public String getSprintSpeed() {
        return SprintSpeed;
    }

    public void setSprintSpeed(String sprintSpeed) {
        SprintSpeed = sprintSpeed;
    }

    public String getAgility() {
        return Agility;
    }

    public void setAgility(String agility) {
        Agility = agility;
    }

    public String getReactions() {
        return Reactions;
    }

    public void setReactions(String reactions) {
        Reactions = reactions;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String balance) {
        Balance = balance;
    }

    public String getShotPower() {
        return ShotPower;
    }

    public void setShotPower(String shotPower) {
        ShotPower = shotPower;
    }

    public String getJumping() {
        return Jumping;
    }

    public void setJumping(String jumping) {
        Jumping = jumping;
    }

    public String getStamina() {
        return Stamina;
    }

    public void setStamina(String stamina) {
        Stamina = stamina;
    }

    public String getStrength() {
        return Strength;
    }

    public void setStrength(String strength) {
        Strength = strength;
    }

    public String getLongShots() {
        return LongShots;
    }

    public void setLongShots(String longShots) {
        LongShots = longShots;
    }

    public String getAggression() {
        return Aggression;
    }

    public void setAggression(String aggression) {
        Aggression = aggression;
    }

    public String getInterceptions() {
        return Interceptions;
    }

    public void setInterceptions(String interceptions) {
        Interceptions = interceptions;
    }

    public String getPositioning() {
        return Positioning;
    }

    public void setPositioning(String positioning) {
        Positioning = positioning;
    }

    public String getVision() {
        return Vision;
    }

    public void setVision(String vision) {
        Vision = vision;
    }

    public String getPenalties() {
        return Penalties;
    }

    public void setPenalties(String penalties) {
        Penalties = penalties;
    }

    public String getComposure() {
        return Composure;
    }

    public void setComposure(String composure) {
        Composure = composure;
    }

    public String getMarking() {
        return Marking;
    }

    public void setMarking(String marking) {
        Marking = marking;
    }

    public String getStandingTackle() {
        return StandingTackle;
    }

    public void setStandingTackle(String standingTackle) {
        StandingTackle = standingTackle;
    }

    public String getSlidingTackle() {
        return SlidingTackle;
    }

    public void setSlidingTackle(String slidingTackle) {
        SlidingTackle = slidingTackle;
    }

    public String getGKDiving() {
        return GKDiving;
    }

    public void setGKDiving(String GKDiving) {
        this.GKDiving = GKDiving;
    }

    public String getGKHandling() {
        return GKHandling;
    }

    public void setGKHandling(String GKHandling) {
        this.GKHandling = GKHandling;
    }

    public String getGKKicking() {
        return GKKicking;
    }

    public void setGKKicking(String GKKicking) {
        this.GKKicking = GKKicking;
    }

    public String getGKPositioning() {
        return GKPositioning;
    }

    public void setGKPositioning(String GKPositioning) {
        this.GKPositioning = GKPositioning;
    }

    public String getGKReflexes() {
        return GKReflexes;
    }

    public void setGKReflexes(String GKReflexes) {
        this.GKReflexes = GKReflexes;
    }

    public String getRelease_Clause() {
        return Release_Clause;
    }

    public void setRelease_Clause(String release_Clause) {
        Release_Clause = release_Clause;
    }

    @Override
    public String toString() {
        return "Fifa{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Age='" + Age + '\'' +
                ", Photo='" + Photo + '\'' +
                ", Nationality='" + Nationality + '\'' +
                ", Flag='" + Flag + '\'' +
                ", Overall='" + Overall + '\'' +
                ", Potential='" + Potential + '\'' +
                ", Club='" + Club + '\'' +
                ", Club_Logo='" + Club_Logo + '\'' +
                ", Value='" + Value + '\'' +
                ", Wage='" + Wage + '\'' +
                ", Special='" + Special + '\'' +
                ", Preferred_Foot='" + Preferred_Foot + '\'' +
                ", International_Reputation='" + International_Reputation + '\'' +
                ", Weak_Foot='" + Weak_Foot + '\'' +
                ", Skill_Moves='" + Skill_Moves + '\'' +
                ", Work_Rate='" + Work_Rate + '\'' +
                ", Body_Type='" + Body_Type + '\'' +
                ", Real_Face='" + Real_Face + '\'' +
                ", Position='" + Position + '\'' +
                ", Jersey_Number='" + Jersey_Number + '\'' +
                ", Joined='" + Joined + '\'' +
                ", Loaned_From='" + Loaned_From + '\'' +
                ", Contract_Valid_Until='" + Contract_Valid_Until + '\'' +
                ", Height='" + Height + '\'' +
                ", Weight='" + Weight + '\'' +
                ", LS='" + LS + '\'' +
                ", ST='" + ST + '\'' +
                ", RS='" + RS + '\'' +
                ", LW='" + LW + '\'' +
                ", LF='" + LF + '\'' +
                ", CF='" + CF + '\'' +
                ", RF='" + RF + '\'' +
                ", RW='" + RW + '\'' +
                ", LAM='" + LAM + '\'' +
                ", CAM='" + CAM + '\'' +
                ", RAM='" + RAM + '\'' +
                ", LM='" + LM + '\'' +
                ", LCM='" + LCM + '\'' +
                ", CM='" + CM + '\'' +
                ", RCM='" + RCM + '\'' +
                ", RM='" + RM + '\'' +
                ", LWB='" + LWB + '\'' +
                ", LDM='" + LDM + '\'' +
                ", CDM='" + CDM + '\'' +
                ", RDM='" + RDM + '\'' +
                ", RWB='" + RWB + '\'' +
                ", LB='" + LB + '\'' +
                ", LCB='" + LCB + '\'' +
                ", CB='" + CB + '\'' +
                ", RCB='" + RCB + '\'' +
                ", RB='" + RB + '\'' +
                ", Crossing='" + Crossing + '\'' +
                ", Finishing='" + Finishing + '\'' +
                ", HeadingAccuracy='" + HeadingAccuracy + '\'' +
                ", ShortPassing='" + ShortPassing + '\'' +
                ", Volleys='" + Volleys + '\'' +
                ", Dribbling='" + Dribbling + '\'' +
                ", Curve='" + Curve + '\'' +
                ", FKAccuracy='" + FKAccuracy + '\'' +
                ", LongPassing='" + LongPassing + '\'' +
                ", BallControl='" + BallControl + '\'' +
                ", Acceleration='" + Acceleration + '\'' +
                ", SprintSpeed='" + SprintSpeed + '\'' +
                ", Agility='" + Agility + '\'' +
                ", Reactions='" + Reactions + '\'' +
                ", Balance='" + Balance + '\'' +
                ", ShotPower='" + ShotPower + '\'' +
                ", Jumping='" + Jumping + '\'' +
                ", Stamina='" + Stamina + '\'' +
                ", Strength='" + Strength + '\'' +
                ", LongShots='" + LongShots + '\'' +
                ", Aggression='" + Aggression + '\'' +
                ", Interceptions='" + Interceptions + '\'' +
                ", Positioning='" + Positioning + '\'' +
                ", Vision='" + Vision + '\'' +
                ", Penalties='" + Penalties + '\'' +
                ", Composure='" + Composure + '\'' +
                ", Marking='" + Marking + '\'' +
                ", StandingTackle='" + StandingTackle + '\'' +
                ", SlidingTackle='" + SlidingTackle + '\'' +
                ", GKDiving='" + GKDiving + '\'' +
                ", GKHandling='" + GKHandling + '\'' +
                ", GKKicking='" + GKKicking + '\'' +
                ", GKPositioning='" + GKPositioning + '\'' +
                ", GKReflexes='" + GKReflexes + '\'' +
                ", Release_Clause='" + Release_Clause + '\'' +
                '}';
    }
}
