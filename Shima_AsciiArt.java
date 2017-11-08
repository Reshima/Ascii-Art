/*************************************************************************************************************************************
*	file: Shima_AsciiArt.java
*	author: Rachael Shima
*	class: CS 141 - Programming and Problem Solving
*
*	assignment: program 1
*	date last modified: 29 April 2016
*
*	purpose: This program accepts a file and creates an 2D array with the rows and colomns indicated in the first line of the file.
*	It then files the text into these arrays and manipulates it and prints out a transformed version.
***************************************************************************************************************************************/
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class Shima_AsciiArt
{
  public static void main(String[] args) throws IOException
  {
    File mon = new File("monelisa.txt");
    Scanner input = new Scanner(mon);
    String first = input.nextLine();
    StringTokenizer num = new StringTokenizer(first);
    String horizontal  = num.nextToken();
    String vertical = num.nextToken();
    int r = Integer.parseInt(horizontal);
    int c = Integer.parseInt(vertical);
    char[][] jumble = new char[r][c];
    for(int row = 0; row < r; row++)
    {
      String line = input.nextLine();
      for(int column = 0; column < c; column++)
      {
        jumble[row][column] = line.charAt(column);
      }
    }
    System.out.println("Original Text:");
    for(int row = 0; row < jumble.length; row++)
    {
      for(int column = 0; column < jumble[row].length; column++)
      {
        System.out.print(jumble[row][column]);
      }
      System.out.println();
    }
    System.out.println("Transformations:");
    for(int row = jumble.length - 1; row >= 0; row--)
    {
      for(int column = 0; column < jumble[row].length; column++)
      {
        System.out.print(jumble[row][column]);
      }
      System.out.println();
    }
    System.out.println();
    for(int row = 0; row < jumble.length; row++)
    {
      for(int column = jumble[row].length - 1; column >= 0; column--)
      {
        System.out.print(jumble[row][column]);
      }
      System.out.println();
    }
    System.out.println();
    for(int row = jumble.length - 1; row >= 0; row--)
    {
      for(int column = jumble[row].length - 1; column >= 0; column--)
      {
        System.out.print(jumble[row][column]);
      }
      System.out.println();
    }
    input.close();
  }
}
