// class Assignment_28 = Trip
public class Assignment_28 {

    private ArrayList<Integer> flights;

    public Assignment_28(ArrayList<Integer> f)
    {
        this.flights = f;
    }

    /**
     * @return the smallest number of minutes between the arrival of a flight and the departure
     *         of the flight immediately after it, if there are two or more flights in the trip;
     *         -1, if there are fewer than two flights in the trip
     */
    public int getDuration(int a, int b) {
        // Create time object for ease of comparison

        Time t1 = new Time(flights.get(a).getDepartureTime());
        Time t2 = new Time(flights.get(b).getDepartureTime());
        return Math.abs(t1.minutesUntil(t2));
    }

    /**
     * @return the number of minutes from departure of the first flight to the arrival of
     *         the last flight if there are one or more flights in the trip;
     *         0, if there are no flights in the trips
     */
    public int getShortestLayover() 
    {
        int smallest = 999;
            for (int i = 0; i < flights.size()-1; i++)
            {
                int j = i + 1;
                if (this.getDuration(i, j) < smallest) { smallest = this.getDuration(i, j); }
            }
            return smallest;
    }
}
