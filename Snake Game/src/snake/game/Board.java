/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake.game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




/**
 *
 * @author amberdawn50
 */
public class Board extends JPanel implements ActionListener {
    
    private final int boardWidth = 700;
    private final int boardHeight = 700; 
    private final int squareWidth = 25;
    private final int squareHeight = 25;
    
    // The number of squares on the board is (700*700)/25 = 28 x 28 = 784 Sqrs
    
    private int snakeLength;
    private int appleXCoord;
    private int appleYCoord;
    
    //  Movement booleans
    private boolean moveRight = false;
    private boolean moveLeft = false;
    private boolean moveUp = false;
    private boolean moveDown = false;
    
    private boolean playGame = true;
    
    
    public Board() {
         
        setSize(boardWidth, boardHeight);
        setVisible (true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
