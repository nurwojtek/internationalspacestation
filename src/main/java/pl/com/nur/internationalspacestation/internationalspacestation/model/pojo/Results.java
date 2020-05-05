
package pl.com.nur.internationalspacestation.internationalspacestation.model.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sunrise",
    "sunset",
    "solar_noon",
    "day_length",
    "civil_twilight_begin",
    "civil_twilight_end",
    "nautical_twilight_begin",
    "nautical_twilight_end",
    "astronomical_twilight_begin",
    "astronomical_twilight_end"
})
public class Results {

    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("solar_noon")
    private String solarNoon;
    @JsonProperty("day_length")
    private String dayLength;
    @JsonProperty("civil_twilight_begin")
    private String civilTwilightBegin;
    @JsonProperty("civil_twilight_end")
    private String civilTwilightEnd;
    @JsonProperty("nautical_twilight_begin")
    private String nauticalTwilightBegin;
    @JsonProperty("nautical_twilight_end")
    private String nauticalTwilightEnd;
    @JsonProperty("astronomical_twilight_begin")
    private String astronomicalTwilightBegin;
    @JsonProperty("astronomical_twilight_end")
    private String astronomicalTwilightEnd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Results() {
    }

    @JsonProperty("sunrise")
    public String getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    @JsonProperty("sunset")
    public String getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    @JsonProperty("solar_noon")
    public String getSolarNoon() {
        return solarNoon;
    }

    @JsonProperty("solar_noon")
    public void setSolarNoon(String solarNoon) {
        this.solarNoon = solarNoon;
    }

    @JsonProperty("day_length")
    public String getDayLength() {
        return dayLength;
    }

    @JsonProperty("day_length")
    public void setDayLength(String dayLength) {
        this.dayLength = dayLength;
    }

    @JsonProperty("civil_twilight_begin")
    public String getCivilTwilightBegin() {
        return civilTwilightBegin;
    }

    @JsonProperty("civil_twilight_begin")
    public void setCivilTwilightBegin(String civilTwilightBegin) {
        this.civilTwilightBegin = civilTwilightBegin;
    }

    @JsonProperty("civil_twilight_end")
    public String getCivilTwilightEnd() {
        return civilTwilightEnd;
    }

    @JsonProperty("civil_twilight_end")
    public void setCivilTwilightEnd(String civilTwilightEnd) {
        this.civilTwilightEnd = civilTwilightEnd;
    }

    @JsonProperty("nautical_twilight_begin")
    public String getNauticalTwilightBegin() {
        return nauticalTwilightBegin;
    }

    @JsonProperty("nautical_twilight_begin")
    public void setNauticalTwilightBegin(String nauticalTwilightBegin) {
        this.nauticalTwilightBegin = nauticalTwilightBegin;
    }

    @JsonProperty("nautical_twilight_end")
    public String getNauticalTwilightEnd() {
        return nauticalTwilightEnd;
    }

    @JsonProperty("nautical_twilight_end")
    public void setNauticalTwilightEnd(String nauticalTwilightEnd) {
        this.nauticalTwilightEnd = nauticalTwilightEnd;
    }

    @JsonProperty("astronomical_twilight_begin")
    public String getAstronomicalTwilightBegin() {
        return astronomicalTwilightBegin;
    }

    @JsonProperty("astronomical_twilight_begin")
    public void setAstronomicalTwilightBegin(String astronomicalTwilightBegin) {
        this.astronomicalTwilightBegin = astronomicalTwilightBegin;
    }

    @JsonProperty("astronomical_twilight_end")
    public String getAstronomicalTwilightEnd() {
        return astronomicalTwilightEnd;
    }

    @JsonProperty("astronomical_twilight_end")
    public void setAstronomicalTwilightEnd(String astronomicalTwilightEnd) {
        this.astronomicalTwilightEnd = astronomicalTwilightEnd;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Results{" +
                "sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                ", solarNoon='" + solarNoon + '\'' +
                ", dayLength='" + dayLength + '\'' +
                ", civilTwilightBegin='" + civilTwilightBegin + '\'' +
                ", civilTwilightEnd='" + civilTwilightEnd + '\'' +
                ", nauticalTwilightBegin='" + nauticalTwilightBegin + '\'' +
                ", nauticalTwilightEnd='" + nauticalTwilightEnd + '\'' +
                ", astronomicalTwilightBegin='" + astronomicalTwilightBegin + '\'' +
                ", astronomicalTwilightEnd='" + astronomicalTwilightEnd + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
