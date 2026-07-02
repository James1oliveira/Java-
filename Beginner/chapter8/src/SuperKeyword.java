/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33980
 */
public class SuperKeyword {

    abstract static class Report {
        void runReport() {
            System.out.println("Setting up report (superclass version)");
        }
        void printReport() {
            System.out.println("Printing report (superclass version)");
        }
    }

    static class BuzzwordsReport extends Report {
        @Override
        void runReport() {
            super.runReport();          // calls Report's runReport() first
            buzzwordCompliance();       // then adds subclass-specific behavior
            printReport();
        }
        void buzzwordCompliance() {
            System.out.println("Adding synergy, leverage, and disruption...");
        }
    }

    public static void main(String[] args) {
        BuzzwordsReport r = new BuzzwordsReport();
        r.runReport();
    }
}