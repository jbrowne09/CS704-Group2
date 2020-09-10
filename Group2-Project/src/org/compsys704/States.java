package org.compsys704;

public class States {

	public static volatile boolean MOTOR = false;
	public static volatile boolean bottleLeft5 = false;
	public static volatile boolean bottlePos1 = false;
	public static volatile boolean bottlePos2 = false;
	public static volatile boolean bottlePos3 = false;
	public static volatile boolean bottlePos4 = false;
	public static volatile boolean bottlePos5 = false;
	public static volatile boolean rotate = false;
	public static volatile boolean gripperLifted = true;
	public static volatile boolean gripperLowered = !gripperLifted;
	public static volatile boolean gripperInit = true;
	public static volatile boolean gripperTurned = !gripperInit;
	public static volatile boolean canBottom = true;
	public static volatile boolean canTop = !canBottom;
	public static volatile boolean inletIsOn = false;
	public static volatile boolean injectorIsOn = false;
	public static volatile boolean aligned = false;
	public static volatile boolean capPos1 = false;

}

