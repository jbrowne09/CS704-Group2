package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
			case "NbottleLeft5":
				States.bottleLeft5 = true;
				break;
			case "Nmotor":
				//if(!States.bottlePos5 && !States.bottlePos1) {
					States.MOTOR = true;
				//}
				break;
			case "NbottlePos1":
				States.bottlePos1 = true;
				break;
			case "NbottlePos5":
				States.bottlePos5 = status;
				break;
			default:
				System.err.println("Wrong sig name : "+signame);
				System.exit(1);
		}
	}


	static final List<String> signames = Arrays.asList("NbottleLeft5","Nmotor","NbottlePos1","NbottlePos5");

	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
