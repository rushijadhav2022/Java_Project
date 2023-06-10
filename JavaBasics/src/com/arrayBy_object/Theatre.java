package com.arrayBy_object;

import java.util.*;

public class Theatre {

	public static void main(String[] args) {
		Theaterpoj[] r = new Theaterpoj[2];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < r.length; i++) {
			System.out.println("Enter the theatre id");
			int t_id = sc.nextInt();
			System.out.println("Pls enter the theatre name");
			String t_name = sc.next();
			System.out.println("pls enter the movie id");
			int m_id = sc.nextInt();
			System.out.println("Pls enter the movie name");
			String m_name = sc.next();
			System.out.println("Enter Movie ratings");
			float m_rating = sc.nextFloat();
			r[i] = new Theaterpoj();
			Movie m = new Movie();
			r[i].setT_id(t_id);
			r[i].setT_name(t_name);
			r[i].setM(m);
			r[i].getM().setM_id(m_id);
			r[i].getM().setM_name(m_name);
			r[i].getM().setM_rating(m_rating);

		}

		for (int i = 0; i < r.length; i++) {

			System.out.println(r[i]);

		}

	}

}
