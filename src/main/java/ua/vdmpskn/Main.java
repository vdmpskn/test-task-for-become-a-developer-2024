package ua.vdmpskn;

import java.util.List;
import ua.vdmpskn.service.FileService;
import ua.vdmpskn.service.SortService;
import ua.vdmpskn.service.impl.FileServiceImpl;
import ua.vdmpskn.service.impl.SortServiceImpl;

public class Main {

  static final String URL = "src/main/resources/fileWithNumbers.txt";


  public static void main(String[] args) {
    final FileService fileService = new FileServiceImpl();
    final SortService sortService = new SortServiceImpl();

   final List<Integer> numbers = fileService.readFile(URL);

    System.out.println("Longest increasing subsequence: " + sortService.findLongestIncreasingSubsequence(numbers));
    System.out.println("Longest decreasing subsequence: " + sortService.findLongestDecreasingSubsequence(numbers));

    System.out.println("Average: " + sortService.calculateAverage(numbers));
    System.out.println("Median: " + sortService.calculateMedian(numbers));

    System.out.println("Minimum value: " + sortService.findMinValue(numbers));
    System.out.println("Maximum value: " + sortService.findMaxValue(numbers));

  }
}