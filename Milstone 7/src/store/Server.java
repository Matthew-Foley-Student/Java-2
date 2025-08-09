package store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	/**
	 * Matthew Foley
	 * @author
	 * June/July 2025
	 */
	public void start(int port) throws IOException{
		
		int trueexit = 0;
		int exit = 0;
		while (trueexit==0) {
			try (Scanner scnr = new Scanner(System.in)) {
				System.out.println("Please select 1 to see weapons, 2 to see potions, 3 to see armor, 4 to cancel the entire edit, or 5 to confirm final edit");
				int choice = scnr.nextInt();
				if(choice < 6 || choice>0) {
					exit = choice;
				}else {
					System.out.println("Please only select one of the provided options");
				}while (exit== 1) {
					for (int x=0;x<weapons.length;++x) {
						System.out.print("In spot " +(x) + " is ");
						displayName(weapons[x]);
						System.out.print(" The number in stock is ");
						displayStock(weapons[x]);
						System.out.print(" and the total amount per item is ");
						displayPrice(weapons[x]);
						System.out.println();
					}
					System.out.println();
					System.out.println("Please select the spot of the item you wish to edit is in, or click "+ weapons.length+" to go back");
					choice = scnr.nextInt();
					if(choice < weapons.length && choice !=weapons.length) {
						vari = choice;
						System.out.println();
						System.out.print("How many ");
						displayName(weapons[vari]);
						System.out.print(" would you like to purchase");
						choice = scnr.nextInt();
						if (choice > weapons[vari].getQuant()) {
							System.out.println("There are not enough in stock. Select any number to go back");
							choice = scnr.nextInt();					}
					else {
						System.out.print("are you sure you want " +choice + " ");
						temp = choice;
						displayName(weapons[vari]);
						System.out.print(" as it is the total number that will be in yout kart regaurdless of how many are currently in it click 1 for yes anything else for no ");
						choice = scnr.nextInt();
						if (choice ==1) {
						 weapons[vari].setTempQuant(temp);
						 System.out.println(weapons[vari].getTempQuant() + " will be put into the kart");
						}
					}
				}
					
				}

			}//End Of Try Loop
			
		}
	}
	
	public void cleanup() throws IOException{
		in.close();
		out.close();
		clientSocket.close();
		serverSocket.close();
	}

	public static void main(String[] args) throws IOException{
		Server server = new Server();
		server.start(8614);
		server.cleanup();
	}

}
