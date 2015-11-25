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
	private String name;
	private int weight;
	
	public Person(String n) {
		name = n; weight = 0;
	}
	
	public String toString() {
		return "Person(\"" + name + "\","
		+ weight + ")";
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void addKgs(int kgs) {
		if (kgs >= 0) {
			weight += kgs;
		} else {
			throw new IllegalArgumentException();
		}
	}
}