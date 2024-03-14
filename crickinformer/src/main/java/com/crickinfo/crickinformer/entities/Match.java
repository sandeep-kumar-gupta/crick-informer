package com.crickinfo.crickinformer.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "crick_matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long matchId;

    private String teamHeading;

    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlingTeamscore;

    private String bowlingTeam;

    private String textComplete;
    @Enumerated
    private MatchStatus status;

    private String matchLink;

    private String liveText;

    private Date date = new Date();

    public Match() {
    }

    //set the match status text complete

    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.status=MatchStatus.LIVE;
        }else{
            this.status = MatchStatus.COMPLETED;
        }
    }

    public Match(long matchId, String teamHeading, String matchNumberVenue, String battingTeam, String battingTeamScore, String bowlingTeamscore, String bowlingTeam, String textComplete, MatchStatus status, String matchLink, String liveText, Date date) {
        this.matchId = matchId;
        this.teamHeading = teamHeading;
        this.matchNumberVenue = matchNumberVenue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlingTeamscore = bowlingTeamscore;
        this.bowlingTeam = bowlingTeam;
        this.textComplete = textComplete;
        this.status = status;
        this.matchLink = matchLink;
        this.liveText = liveText;
        this.date = date;
    }

    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public String getBowlingTeamscore() {
        return bowlingTeamscore;
    }

    public void setBowlingTeamscore(String bowlingTeamscore) {
        this.bowlingTeamscore = bowlingTeamscore;
    }

    public String getBowlingTeam() {
        return bowlingTeam;
    }

    public void setBowlingTeam(String bowlingTeam) {
        this.bowlingTeam = bowlingTeam;
    }

    public String getTextComplete() {
        return textComplete;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public String getMatchLink() {
        return matchLink;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    public String getLiveText() {
        return liveText;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", teamHeading='" + teamHeading + '\'' +
                ", matchNumberVenue='" + matchNumberVenue + '\'' +
                ", battingTeam='" + battingTeam + '\'' +
                ", battingTeamScore='" + battingTeamScore + '\'' +
                ", bowlingTeamscore='" + bowlingTeamscore + '\'' +
                ", bowlingTeam='" + bowlingTeam + '\'' +
                ", textComplete='" + textComplete + '\'' +
                ", status=" + status +
                ", matchLink='" + matchLink + '\'' +
                ", liveText='" + liveText + '\'' +
                ", date=" + date +
                '}';
    }
}
