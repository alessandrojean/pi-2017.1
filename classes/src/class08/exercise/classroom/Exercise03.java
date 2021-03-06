/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class08.exercise.classroom;

import javax.swing.JOptionPane;

/**
 *
 * @author alessandro.jean
 */
public class Exercise03 {

    private static double[][] m1 = new double[4][4], m2 = new double[4][4], r = new double[4][4];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fillMatrix(m1, "A");
        fillMatrix(m2, "B");

        multiplyMatrix();

        System.out.println(generateString(r));
    }

    private static void fillMatrix(double[][] m, String name) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("<html>Número %s<sub>%dx%d</dub>:</html>", name, i, j)));
            }
        }
    }

    private static void multiplyMatrix() {
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                for (int k = 0; k < r[i].length; k++) {
                    r[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
    }

    private static String generateString(double[][] m) {
        String f = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                f += String.format("%5.2f %s", m[i][j], j == m[i].length - 1 ? "\n" : "");
            }
        }
        return f;
    }

}
