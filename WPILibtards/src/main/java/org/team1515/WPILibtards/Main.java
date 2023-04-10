// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.team1515.WPILibtards;

import edu.wpi.first.wpilibj.RobotBase;

public final class Main {
  private Main() {
    System.out.println("hello guys");
  }

  public static void main(String... args) {
    RobotBase.startRobot(Robot::new);
  }
}
