package censusanalyser;

public class IndiaCensusDTO {
    public String state;
    public long population;
    public long areaInSqKm;
    public long densityPerSqKm;

    public IndiaCensusDTO(IndiaCensusCSV indiaCensusCSV) {
        state = indiaCensusCSV.state;
        population = indiaCensusCSV.population;
        areaInSqKm = indiaCensusCSV.areaInSqKm;
        densityPerSqKm = indiaCensusCSV.densityPerSqKm;

    }


}
