package censusanalyser;

public class censusDTO {
    public String state;
    public long population;
    public long areaInSqKm;
    public long densityPerSqKm;
    public String stateCode;
    public String stateId;
    public double totalArea;
    public double populationDensity;

    public censusDTO(IndiaCensusCSV indiaCensusCSV) {
        state = indiaCensusCSV.state;
        population = indiaCensusCSV.population;
        areaInSqKm = indiaCensusCSV.areaInSqKm;
        densityPerSqKm = indiaCensusCSV.densityPerSqKm;
    }

    public censusDTO(USCensusData usCensusData) {
        state = usCensusData.state;
        stateId = usCensusData.stateId;
        population = usCensusData.population;
        totalArea = usCensusData.totalArea;
        populationDensity = usCensusData.populationDensity;
    }

}
