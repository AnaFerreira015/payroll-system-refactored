package br.ufal.main;

import java.util.Date;
import java.util.Scanner;

import br.ufal.main.database.DatabaseConnection;
import br.ufal.main.model.Commissioned;
import br.ufal.main.model.Employee;
import br.ufal.main.model.Hourly;
import br.ufal.main.model.Salaried;
import br.ufal.main.model.Sale;
import br.ufal.main.model.Timecard;

public class Main {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		menu.menuOptions();
	}

}
