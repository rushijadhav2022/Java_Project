package com.collection;

import java.util.*;

public class Movie implements Comparable<Movie> {

	int id;
	String m_name;
	Float rating;

	public Movie(int id, String m_name, Float rating) {
		super();
		this.id = id;
		this.m_name = m_name;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", m_name=" + m_name + ", rating=" + rating + "]";
	}

	public static void main(String[] args) {

		HashSet<Movie> hs = new HashSet<>();

		hs.add(new Movie(1, "rrr", 8.5f));
		hs.add(new Movie(2, "raone", 9.5f));
		hs.add(new Movie(3, "Extraction", 7.2f));

		TreeSet<Movie> ts = new TreeSet<>(hs);

		System.out.println(ts);
//		}

	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return o.rating.compareTo(this.rating);
	}

}
