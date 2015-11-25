// @(#)$Id: Person.java 1199 2009-02-17 19:42:32Z smshaner $

// Copyright (C) 2003 Iowa State University

// This file is part of JML

// JML is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2, or (at your option)
// any later version.

// JML is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with JML; see the file COPYING.  If not, write to
// the Free Software Foundation, 675 Mass Ave, Cambridge, MA 02139, USA.


public class Person {
	private /*@ spec_public non_null @*/ String name;
	private /*@ spec_public @*/ int weight;
	
	/*@ requires n != null;
	 @ ensures name == n && weight == 0; @*/
	public Person(String n) {
		name = n; weight = 0;
	}
	
	/*@ ensures \result != null; @*/
	public String toString() {
		return "Person(\"" + name + "\","
		+ weight + ")";
	}
	
	//@ ensures \result == weight;
	public /*@ pure @*/ int getWeight() {
		return weight;
	}
	
	/*@ requires kgs >= 0;
	 @ requires weight + kgs >= 0;
	 @ ensures weight == \old(weight + kgs);
	 @ also
	 @ requires kgs < 0;
	 @ signals_only IllegalArgumentException;
	 @*/
	public void addKgs(int kgs) {
		if (kgs >= 0) {
			weight += kgs;
		} else {
			throw new IllegalArgumentException();
		}
	}
}