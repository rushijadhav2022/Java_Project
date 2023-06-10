package com.arrayBy_object;

public class Movie {

	private int m_id;
	private String m_name;
	private float m_rating;

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public float getM_rating() {
		return m_rating;
	}

	public void setM_rating(float m_rating) {
		this.m_rating = m_rating;
	}

	@Override
	public String toString() {
		return "Movie [m_id=" + m_id + ", m_name=" + m_name + ", m_rating=" + m_rating + "]";
	}

}
