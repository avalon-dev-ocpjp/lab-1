/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

/**
 *
 * @author java
 */
public class OneSorter implements Sort<int[]> {

    @Override
    public void run(int[] dataSet) {
        int tmp;
        for (int i = 0; i < dataSet.length; i++)
	for (int j = i + 1; j < dataSet.length; j++)
		if (dataSet[j] < dataSet[i]) {
			tmp = dataSet[i];
			dataSet[i] = dataSet[j];
			dataSet[j] = tmp;
		}
    }
    
}
