package me.wolfii;

import me.wolfii.implementations.AutoSolver;

import java.util.logging.Logger;

public class Main {
    public static Logger LOGGER = Logger.getLogger("adventOfCodeSolver");
    public static void main(String[] args) {
        AutoSolver.solve(1, AutoSolve.BOTH);
    }
}