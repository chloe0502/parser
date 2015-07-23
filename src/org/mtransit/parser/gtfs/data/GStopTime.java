package org.mtransit.parser.gtfs.data;

import org.mtransit.parser.Constants;

// https://developers.google.com/transit/gtfs/reference#stop_times_fields
public class GStopTime {

	public static final String FILENAME = "stop_times.txt";

	public static final String TRIP_ID = "trip_id";
	private String trip_id;
	public static final String STOP_ID = "stop_id";
	private String stop_id;
	public static final String STOP_SEQUENCE = "stop_sequence";
	private int stop_sequence;
	public static final String DEPARTURE_TIME = "departure_time";
	private String departure_time;

	public static final String STOP_HEADSIGN = "stop_headsign";
	private String stop_headsign;

	public GStopTime(String trip_id, String departure_time, String stop_id, int stop_sequence, String stop_headsign) {
		this.trip_id = trip_id;
		this.departure_time = departure_time;
		this.stop_id = stop_id;
		this.stop_sequence = stop_sequence;
		this.stop_headsign = stop_headsign;
	}

	public int getStopSequence() {
		return stop_sequence;
	}

	public String getStopId() {
		return stop_id;
	}

	public String getTripId() {
		return trip_id;
	}

	public String getDepartureTime() {
		return departure_time;
	}

	public String getStopHeadsign() {
		return stop_headsign;
	}

	public boolean hasStopHeadsign() {
		return this.stop_headsign != null && this.stop_headsign.length() > 0;
	}

	@Override
	public String toString() {
		return new StringBuilder() //
				.append(Constants.STRING_DELIMITER).append(this.trip_id).append(Constants.STRING_DELIMITER) //
				.append(Constants.COLUMN_SEPARATOR) //
				.append(Constants.STRING_DELIMITER).append(this.stop_id).append(Constants.STRING_DELIMITER) //
				.append(Constants.COLUMN_SEPARATOR) //
				.append(Constants.STRING_DELIMITER).append(this.stop_sequence).append(Constants.STRING_DELIMITER) //
				.append(Constants.COLUMN_SEPARATOR) //
				.append(Constants.STRING_DELIMITER).append(this.departure_time).append(Constants.STRING_DELIMITER) //
				.append(Constants.COLUMN_SEPARATOR) //
				.append(Constants.STRING_DELIMITER).append(this.stop_headsign).append(Constants.STRING_DELIMITER) //
				.append(Constants.COLUMN_SEPARATOR) //
				.toString();
	}
}
