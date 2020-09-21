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
			case "gripCapS":
				States.gripCap = status;
				break;
			case "bottleClampedS":
				States.bottleClamped = status;
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
			//Loading
			case "posBS":
				States.armtoB = status; //to loading point
				break;
			case "posCS":
				States.armtoC = status; //To the conveyer
				break;
			case "posDS":
				States.armtoD = status;
				break;
			case "posAS":
				States.armtoA = status; //Original loading position
				break;
			case "closeGripperS":
				States.gripContainer = status;
				break;
			case "openGripperS":
				States.releaseContainer = status;
				break;
			//Unloading
			case "posB2S":
				States.armtoB2 = status; //to unloading point
				break;
			case "posC2S":
				States.armtoC2 = status; //To the end point/shipping container
				break;
			case "posD2S":
				States.armtoD2 = status;
				break;
			case "posA2S":
				States.armtoA2 = status; //Original unloading position
				break;
			case "closeGripper2S":
				States.gripContainer2 = status;
				break;
			case "openGripper2S":
				States.releaseContainer2 = status;
				break;
			default:
				System.err.println("Wrong sig name : "+signame);
				System.exit(1);
		}
	}  
	
	static final List<String> signames = Arrays.asList("bottleLeft5S","motorS","bottlePos1S", "bottlePos2S", "bottlePos3S", "bottlePos4S", "bottlePos5S", "gripperLoweredS", "gripperLiftedS", "gripperInitS", "gripperTurnedS", "gripCapS", "bottleClampedS", "canBottomS", "canTopS", "inletIsOnS", "injectorIsOnS", "alignedS", "capPos1S", "rotateS", "posBS", "posCS", "posDS", "posAS", "closeGripperS", "openGripperS", "posB2S", "posC2S", "posD2S", "posA2S", "closeGripper2S", "openGripper2S");
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
