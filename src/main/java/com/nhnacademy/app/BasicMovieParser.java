package com.nhnacademy.app;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;

public class BasicMovieParser implements MovieParser{
    @Override
    public List<Movie> parse() throws IOException {
        InputStream input = getMovieFileAsStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        List<Movie> movieList = new ArrayList();
        String record;
        int n = 0;
        while((record =reader.readLine())!=null){
            if(n==0){
                n++;
                continue;
            }
            Long movieId = Long.parseLong(record.split(",")[0]);
            String title = record.split(",")[1];
            Set<String> genres =  Arrays.stream(record.split(",")[2].split("\\|")).collect(Collectors.toSet());

            movieList.add(new Movie(movieId, title, genres));
        }
        return movieList;
    }
}
