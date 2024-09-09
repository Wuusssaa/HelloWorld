/*
 * Coder: Vanessa Haynes
 * Project: Hello, world! First project for Coding III
 * Date: Sep. 2024
 * Description: Prints hello, world and has shapes floating on the screen with changing colors
 */

package com.processing_example;
import processing.core.*;

public class Main extends PApplet {

//sets up processing and prints the hello world message to the console
    public static void main(String[] args) {
        PApplet.main("com.processing_example.Main");
        System.out.println("Hello world!");
    }
//circle variables
    float circX;
    float circY;
    float circR;

//circle color components so that it can be a random color every time
    float circ_r = (int)random(255);
    float circ_g = (int)random(255);
    float circ_b = (int)random(255);
    int circle = color(circ_r, circ_g, circ_b);

//square variables for four squares and their starting locations of the four corners
    float x1 = 0;
    float y1 = 0;
    float x1speed;
    float y1speed;

    float x2 = 600;
    float y2 = 0;
    float x2speed;
    float y2speed;

    float x3 = 0;
    float y3 = 600;
    float x3speed;
    float y3speed;

    float x4 = 600;
    float y4 = 600;
    float x4speed;
    float y4speed;

//square color components so they can all be random as well
    float r1 = (int)random (255);
    float g1 = (int)random (255);
    float b1 = (int)random (255);
    int square1 = color(r1, g1, b1);

    float r2 = (int)random (255);
    float g2 = (int)random (255);
    float b2 = (int)random (255);
    int square2 = color(r2, g2, b2);

    float r3 = (int)random (255);
    float g3 = (int)random (255);
    float b3 = (int)random (255);
    int square3 = color(r3, g3, b3);

    float r4 = (int)random (255);
    float g4 = (int)random (255);
    float b4 = (int)random (255);
    int square4 = color(r4, g4, b4);

//background color components so that it can change to random colors every time the spacebar is pressed
    float backR = (int)random (255);
    float backG = (int)random (255);
    float backB = (int)random (255);
    int backgroundColor = color(backR, backG, backB);

//sets the size of the window   
    public void settings() {
        size (600, 600);
    }

//prints background color to console and assigns the size for the circle as well as assigning random speeds for moving squares
    public void setup() {
        println (backgroundColor); //though couldn't figure out how to print the RBG insteada of the int color value 

        circX = width/2;
        circY = height/2;
        circR = 50;

        x1speed = random (-3, 6);
        y1speed = random (-3, 6);
  
        x2speed = random (-3, 6);
        y2speed = random (-3, 6);

        x3speed = random (-3, 6);
        y3speed = random (-3, 6);

        x4speed = random (-3, 6);
        y4speed = random (-3, 6);
    }

//sets background color, draws and moves shapes
    public void draw() {
        background (backgroundColor);
        noStroke();
    
        //draws circle
        fill (circle);
        ellipse (circX , circY, circR * 2, circR * 2);

        //draws square 1 and moves it
        rectMode (CENTER);
        fill (square1);
        rect (x1, y1, 40, 40);
        x1 = x1 + x1speed;
        y1 = y1 + y1speed;

        //making sure square 1 bounces on all sides of the window
        if (x1 >= width - 20) {
            x1speed = x1speed * -1;
            x1 = width - 20;
        } else if (x1 <= 20) {
            x1speed = x1speed * -1;
            x1 = 20;
        } else if (y1 >= height - 20) {
            y1speed = y1speed * -1;
            y1 = height - 20;
        } else if (y1 <= 20) {
            y1speed = y1speed * -1;
            y1 = 20;
        }

        //repeat for square 2 but slightly bigger
        fill (square2);
        rect (x2, y2, 60, 60);
        x2 = x2 + x2speed;
        y2 = y2 + y2speed;
  
        if (x2 >= width - 30) {
            x2speed = x1speed * -1;
            x2 = width - 30;
        } else if (x2 <= 30) {
            x2speed = x2speed * -1;
            x2 = 30;
        } else if (y2 >= height - 30) {
            y2speed = y2speed * -1;
            y2 = height - 30;
        } else if (y2 <= 30) {
            y2speed = y2speed * -1;
            y2 = 30;
        }

        //repeat for square 3 but slightly bigger
        fill (square3);
        rect (x3, y3, 80, 80);
        x3 = x3 + x3speed;
        y3 = y3 + y3speed;
  
        if (x3 >= width - 40) {
            x3speed = x3speed * -1;
            x3 = width - 40;
        } else if (x3 <= 40) {
            x3speed = x3speed * -1;
            x3 = 40;
        } else if (y3 >= height - 40) {
            y3speed = y3speed * -1;
            y3 = height - 40;
        } else if (y3 <= 40) {
            y3speed = y3speed * -1;
            y3 = 40;
        }

        //repeat for square 4 but the biggest
        fill (square4);
        rect (x4, y4, 100, 100);  
        x4 = x4 + x4speed;
        y4 = y4 + y4speed;
  
        if (x4 >= width - 50) {
            x4speed = x4speed * -1;
            x4 = width - 50;
        } else if (x4 <= 50) {
            x4speed = x4speed * -1;
            x4 = 50;
        } else if (y4 >= height - 50) {
            y4speed = y4speed * -1;
            y4 = height - 50;
        } else if (y4 <= 50) {
            y4speed = y4speed * -1;
            y4 = 50;
        }    
    }

//press spacebar and everything will reset, as well as setting a new background color and printing new color to console
    public void keyPressed() {
        if (key == ' ') {
            x1 = 0;
            y1 = 0;
  
            x2 = 500;
            y2 = 0;
  
            x3 = 0;
            y3 = 500;
  
            x4 = 500;
            y4 = 500;
  
            backR = (int)random (255);
            backG = (int)random (255);
            backB = (int)random (255);
            backgroundColor = color(backR, backG, backB);
            println (backgroundColor);
        }
    }

//pressing mouse will change where the circle shows up as well as changing colors of all shapes
    public void mousePressed() {
        circ_r = (int)random (255);
        circ_g = (int)random (255);
        circ_b = (int)random (255);
        circle = color(circ_r, circ_g, circ_b);

        circX = random (width);
        circY = random (height);
        circR = random (10, 80);
  
        r1 = (int)random (255);
        g1 = (int)random (255);
        b1 = (int)random (255);
        square1 = color(r1, g1, b1);

        r2 = (int)random (255);
        g2 = (int)random (255);
        b2 = (int)random (255);
        square2 = color(r2, g2, b2);
  
        r3 = (int)random (255);
        g3 = (int)random (255);
        b3 = (int)random (255);
        square3 = color(r3, g3, b3);

        r4 = (int)random (255);
        g4 = (int)random (255);
        b4 = (int)random (255);
        square4 = color(r4, g4, b4);
    }
}