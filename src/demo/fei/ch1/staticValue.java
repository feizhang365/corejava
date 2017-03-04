package demo.fei.ch1;

public class staticValue {

	public static void main(String[] args) {
		Voter v1 = new Voter();
		System.out.println(v1.getVoterCount());
		Voter v2 = new Voter();
		System.out.println(v2.getVoterCount());
		
		System.out.println(Voter.voterCount);

	}

}


class Voter {
	static int voterCount = 0;

	public Voter() {
		voterCount++;
	}

	public static int getVoterCount() {
		return voterCount;
	}
}