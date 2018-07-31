package com.startup.daddyschool.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "sports_facilities")
@EntityListeners(AuditingEntityListener.class)
public class SportsFacilitiesEntity implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -4699851632728471196L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
	
	@Column(name = "swimming_pool") 
	private boolean swimmingPool;
	
	@Column(name = "badminton_court")
	private boolean badmintonCourt;
	
	@Column(name = "basket_ball_court")
	private boolean basketBallCourt;
	
	@Column(name = "play_ground")
	private boolean playGround;
	
	@Column(name = "yoga_hall")
	private boolean yogaHall;
	
	@Column(name = "indoor_games")
	private boolean indoorGames;

	public boolean isSwimmingPool() {
		return swimmingPool;
	}

	public void setSwimmingPool(boolean swimmingPool) {
		this.swimmingPool = swimmingPool;
	}

	public boolean isBadmintonCourt() {
		return badmintonCourt;
	}

	public void setBadmintonCourt(boolean badmintonCourt) {
		this.badmintonCourt = badmintonCourt;
	}

	public boolean isBasketBallCourt() {
		return basketBallCourt;
	}

	public void setBasketBallCourt(boolean basketBallCourt) {
		this.basketBallCourt = basketBallCourt;
	}

	public boolean isPlayGround() {
		return playGround;
	}

	public void setPlayGround(boolean playGround) {
		this.playGround = playGround;
	}

	public boolean isYogaHall() {
		return yogaHall;
	}

	public void setYogaHall(boolean yogaHall) {
		this.yogaHall = yogaHall;
	}

	public boolean isIndoorGames() {
		return indoorGames;
	}

	public void setIndoorGames(boolean indoorGames) {
		this.indoorGames = indoorGames;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
