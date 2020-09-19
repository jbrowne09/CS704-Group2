package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
			case "bottleLeft5S":
				States.bottleLeft5 = status;
				break;
			case "motorS":
				//if(!States.bottlePos5 && !States.bottlePos1) {
					States.MOTOR = status;
				//}
				break;
			case "bottlePos1S":
				States.bottlePos1 = status;
				break;
			case "bottlePos2S":
				States.bottlePos2 = status;
				break;
			case "bottlePos3S":
				States.bottlePos3 = status;
				break;
			case "bottlePos4S":
				States.bottlePos4 = status;
				break;
			case "bottlePos5S":
				States.bottlePos5 = status;
				break;
			case "gripperLoweredS":
				States.gripperLowered = status;
				break;
			case "gripperLiftedS":
				States.gripperLifted = status;
				break;
			case "gripperInitS":
				States.gripperInit = status;
				break;
			case "gripperTurnedS":
				States.gripperTurned = status;
				break;
			case "canBottomS":
				States.canBottom = status;
				break;
			case "canTopS":
				States.canTop = status;
				break;
			case "inletIsOnS":
				States.inletIsOn = status;
				break;
			case "injectorIsOnS":
				States.injectorIsOn = status;
				break;
			case "alignedS":
				States.aligned = status;
				break;
			case "capPos1S":
				States.capPos1 = status;
				break;
			case "rotateS":
				States.rotate = status;
				break;
			case "posBS":
				States.armtoB = status;
				break;
			case "posCS":
				States.armtoC = status;
				break;
			case "posDS":
				States.armtoD = status;
				break;
			case "posAS":
				States.armtoA = status;
				break;
			case "closeGripperS":
				States.gripContainer = status;
				break;
			case "openGripperS":
				States.releaseContainer = status;
				break;
			default:
				System.err.println("Wrong sig name : "+signame);
				System.exit(1);
		}
	}  

	static final List<String> signames = Arrays.asList("bottleLeft5S","motorS","bottlePos1S", "bottlePos2S", "bottlePos3S", "bottlePos4S","bottlePos5S", "gripperLoweredS", "gripperLiftedS", "gripperInitS", "gripperTurnedS", "canBottomS", "canTopS", "inletIsOnS", "injectorIsOnS", "alignedS", "capPos1S", "rotateS", "signal posBS", "posCS", "posDS", "posAS", "closeGripperS", "openGripperS");
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
