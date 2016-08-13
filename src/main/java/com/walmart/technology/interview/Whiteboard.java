package com.walmart.technology.interview;

import java.util.HashSet;
import java.util.Set;

/**
 * An empty class where logic will be implemented
 */
public class Whiteboard {

	private static class Store {
		private int	x;
		private int	y;

		/**
		 * @param x
		 * @param y
		 */
		public Store(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		/**
		 * @return the x
		 */
		public int getX() {
			return x;
		}

		/**
		 * @param x
		 *            the x to set
		 */
		public void setX(int x) {
			this.x = x;
		}

		/**
		 * @return the y
		 */
		public int getY() {
			return y;
		}

		/**
		 * @param y
		 *            the y to set
		 */
		public void setY(int y) {
			this.y = y;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Store other = (Store) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

	}

	public int getNumberOfStores(String direction) {
		if (direction == null || direction.equals(""))
			return 0;
		Set<Store> stores = new HashSet<Store>();

		Store store = new Store(0, 0);
		stores.add(store);

		Store newStore = null;
		char[] steps = direction.toCharArray();
		for (char step : steps) {
			switch (step) {
			case '<':
				newStore = new Store(store.getX() - 1, store.getY());
				store = newStore;
				break;
			case '>':
				newStore = new Store(store.getX() + 1, store.getY());
				store = newStore;
				break;
			case '^':
				newStore = new Store(store.getX(), store.getY() + 1);
				store = newStore;
				break;
			case 'v':
				newStore = new Store(store.getX(), store.getY() - 1);
				store = newStore;
				break;
			default:
				newStore = null;
				break;
			}
			if (newStore != null)
				stores.add(newStore);

		}
		return stores.size();
	}

}
