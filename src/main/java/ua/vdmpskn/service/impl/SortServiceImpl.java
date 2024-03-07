package ua.vdmpskn.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ua.vdmpskn.service.SortService;

public class SortServiceImpl implements SortService {

  @Override
  public int findMinValue(final List<Integer> numbers) {
    if (numbers.isEmpty()) {
      throw new IllegalArgumentException("List is empty");
    }

    int min = numbers.getFirst();
    for (int num : numbers) {
      if (num < min) {
        min = num;
      }
    }
    return min;
  }

  @Override
  public int findMaxValue(final List<Integer> numbers){
    if (numbers.isEmpty()) {
      throw new IllegalArgumentException("List is empty");
    }

    int max = numbers.getFirst();
    for (int num : numbers) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  @Override
  public double calculateAverage(final List<Integer> numbers) {
    if (numbers.isEmpty()) {
      throw new IllegalArgumentException("List is empty");
    }

    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }

    return (double) sum / numbers.size();
  }

  @Override
  public  double calculateMedian(final List<Integer> numbers) {
    if (numbers.isEmpty()) {
      throw new IllegalArgumentException("List is empty");
    }

    Collections.sort(numbers);

    final int size = numbers.size();
    if (size % 2 == 1) {
      return numbers.get(size / 2);
    } else {
      final int middle1 = numbers.get(size / 2 - 1);
      final int middle2 = numbers.get(size / 2);
      return (double) (middle1 + middle2) / 2;
    }
  }

  @Override
  public List<Integer> findLongestIncreasingSubsequence(final List<Integer> numbers) {
    if (numbers == null || numbers.isEmpty()) {
      return new ArrayList<>();
    }

    final List<Integer> currentSequence = new ArrayList<>();
    List<Integer> maxSequence = new ArrayList<>();

    for (int i = 0; i < numbers.size(); i++) {
      currentSequence.add(numbers.get(i));

      for (int j = i + 1; j < numbers.size(); j++) {
        if (numbers.get(j) > currentSequence.getLast()) {
          currentSequence.add(numbers.get(j));
        } else {
          break;
        }
      }

      if (currentSequence.size() > maxSequence.size()) {
        maxSequence = new ArrayList<>(currentSequence);
      }

      currentSequence.clear();
    }

    return maxSequence;
  }

  @Override
  public List<Integer> findLongestDecreasingSubsequence(final List<Integer> numbers) {
    if (numbers == null || numbers.isEmpty()) {
      return new ArrayList<>();
    }

    final List<Integer> currentSequence = new ArrayList<>();
    List<Integer> maxSequence = new ArrayList<>();

    for (int i = 0; i < numbers.size(); i++) {
      currentSequence.add(numbers.get(i));

      for (int j = i + 1; j < numbers.size(); j++) {
        if (numbers.get(j) < currentSequence.getLast()) {
          currentSequence.add(numbers.get(j));
        } else {
          break;
        }
      }

      if (currentSequence.size() > maxSequence.size()) {
        maxSequence = new ArrayList<>(currentSequence);
      }

      currentSequence.clear();
    }

    return maxSequence;
  }
}
