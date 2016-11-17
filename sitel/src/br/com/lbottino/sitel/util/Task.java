/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lbottino.sitel.util;

import java.awt.Toolkit;
import java.util.Random;
import javax.swing.SwingWorker;

/**
 *
 * @author luis
 */
public class Task extends SwingWorker<Void, Void> {

    @Override
    protected Void doInBackground() throws Exception {
        Random random = new Random();
        int progress = 0;
        //Initialize progress property.
        setProgress(0);
        while (progress < 100) {
            //Sleep for up to one second.
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException ignore) {
            }
            //Make random progress.
            progress += random.nextInt(10);
            setProgress(Math.min(progress, 100));
        }
        return null;
    }
}
