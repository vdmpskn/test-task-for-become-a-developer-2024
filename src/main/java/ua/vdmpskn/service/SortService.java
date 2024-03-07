package ua.vdmpskn.service;

import java.util.List;

public interface SortService {

  int findMinValue(List<Integer> numbers);

  int findMaxValue(List<Integer> numbers);

  double calculateAverage(List<Integer> numbers);

  double calculateMedian(List<Integer> numbers);

  List<Integer> findLongestIncreasingSubsequence(List<Integer> numbers);

  List<Integer> findLongestDecreasingSubsequence(List<Integer> numbers);

}
