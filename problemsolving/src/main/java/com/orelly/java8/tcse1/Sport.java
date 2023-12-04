package com.orelly.java8.tcse1;

public class Sport implements HockeyTeam,FootballTeam{

	private int[] paramHockeyPlayers;
	private int[] paramFootBallPlayers;
	
	public Sport(int[] paramHockeyPlayers, int[] paramFootBallPlayers) {
		super();
		this.paramHockeyPlayers = paramHockeyPlayers;
		this.paramFootBallPlayers = paramFootBallPlayers;
	}

	@Override
	public int calculateFootballScore() {
		int sum = 0;
		for (int i : paramFootBallPlayers) {
			sum = sum+i;
		}
		return sum;
	}

	@Override
	public int findHighestGoalByIndividualInFootball() {
		int max = -1;
		for (int i : paramFootBallPlayers) {
			if (i > max )
			{
				max=i;
			}
		}		
		return max;
	}

	@Override
	public int calculateHockeycore() {
		int sum = 0;
		for (int i : paramHockeyPlayers) {
			sum = sum+i;
		}
		return sum;
	}

	@Override
	public int findHighestGoalByIndividualInHockey() {
		int max = -1;
		for (int i : paramHockeyPlayers) {
			if (i > max )
			{
				max=i;
			}
		}		
		return max;
	}

}
