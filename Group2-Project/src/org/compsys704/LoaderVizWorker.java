package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
			case "bottleLeft5":
				States.bottleLeft5 = true;
				break;
			case "request":
				if(!States.bottlePos5 && !States.bottlePos1)
					States.MOTOR = true;
				break;
			case "bottlePos1":
				States.bottlePos1 = true;
				break;
			case "bottlePos5":
				States.bottlePos5 = status;
				break;
			default:
				System.err.println("Wrong sig name : "+signame);
				System.exit(1);
		}
	}


	static final List<String> signames = Arrays.asList("NbottleLeft5","requestConveyer","NbottlePos1","NbottlePos5");

	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
