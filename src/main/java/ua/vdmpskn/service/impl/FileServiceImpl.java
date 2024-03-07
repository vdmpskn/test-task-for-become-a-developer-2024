package ua.vdmpskn.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ua.vdmpskn.service.FileService;

public class FileServiceImpl implements FileService {

  @Override
  public List<Integer> readFile(final String fileURL) {
    try {
      final File file = new File(fileURL);
      final Scanner scanner = new Scanner(file);
      final List<Integer> numbers = new ArrayList<>();

      while (scanner.hasNextInt()) {
        numbers.add(scanner.nextInt());
      }

      return numbers;
    } catch (final FileNotFoundException e) {
    System.out.println("File not found");
    return null;
    }
  }
}
