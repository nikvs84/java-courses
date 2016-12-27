package ru.lesson.lessons;

public class Calculate {
  public static void main(String[] args) {
	System.out.println("Hello, World!");
	int first = Integer.valueOf(args[0]);
	int second = Integer.valueOf(args[1]);
	int summ = first + second;
	System.out.println(String.format("Summ (%d + %d) = %d", first, second, summ));
}
}