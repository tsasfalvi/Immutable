package com.immutable;

import com.google.common.collect.ImmutableList;

import java.util.Date;
import java.util.List;

public class Planet {

	private final String name;

	private final Date dateOfDiscovery;

	private final List<Moon> moons;

	private Planet(String name, Date dateOfDiscovery, List<Moon> moons) {
		this.name = name;
		this.dateOfDiscovery = dateOfDiscovery;
		this.moons = moons;
	}

	public static Planet newInstance(String name, Date dateOfDiscovery, List<Moon> moons) {
		Date dateOfDiscoveryClone = (Date) dateOfDiscovery.clone();
		ImmutableList<Moon> moonsCopy = ImmutableList.copyOf(moons);

		return new Planet(name, dateOfDiscoveryClone, moonsCopy);
	}

	public String getName() {
		return name;
	}

	public Date getDateOfDiscovery() {
		return (Date) dateOfDiscovery.clone();
	}

	public List<Moon> getMoons() {
		return moons;
	}

}
