package com.java.examples;

/*-
 * int 			4 bytes –2,147,483,648 to 2,147,483,647 (just over 2 billion)
 * short		2 bytes –32,768 to 32,767
 * long 		8 bytes –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 * byte 		1 byte –128 to	127
 * float 		4 bytes Approximately ±3.40282347E+38F (6–7 significant decimal digits)
 * double		8 bytes Approximately ±1.79769313486231570E+308 (15 significant decimal digits)
 * char			2	bytes
 */
public class V1CH03DataTypes {

  private int numberOfDaysInJanuary = 31;
  private long numberOfInhabitants = 999999L; // note 'L' at the end
  private long numberOfStars = 999999l; // note 'l' at the end
  private long hexNumber = 0XD800; // hexadecimal numbers as long note '0X' as prefix
  private long hexNum = 0xD800; // hexadecimal numbers as long note '0x' as prefix

  // Starting with java 7 you can represent binary numbers
  private int binaryNumber = 0B1000; // binary number note '0B'
  private int bunaryNum = 0b1010; // Binary number note '0b'

  // Starting with java 7 you can add underscores to numbers
  private long oneMillionWithUnderscore = 1_000_000;
  private int oneMillionInbinary = 0b1111_0100_0010_0100_0000;

  /**
   * The name double refers to the fact that these numbers have twice the precision of the float
   * type.
   */
  private double banckCalculation = 9_000_000.1234_5678_1234;

  private double banckCalculationWithSuffix$d = 9_000_000.1234_5678_1234d;

  private double banckCalculationWithSuffix$D = 9_000_000.1234_5678_1234D;

  /**
   * Floating-point numbers are not suitable for financial calculations in which roundoff errors
   * cannot be tolerated. For example, the command System.out.println(2.0 - 1.1) prints
   * 0.8999999999999999, not 0.9 as you would expect. Such roundoff errors are caused by the fact
   * that floating-point numbers are represented in the binary number system. There is no precise
   * binary representation of the fraction 1/10, just as there is no accurate representation of the
   * fraction 1/3 in the decimal system. If you need precise numerical computations without roundoff
   * errors, use the BigDecimal class
   */
  private float piValue_asFloat = 3.14F;

  /**
   * The boolean type has two values, false and true. It is used for evaluating logical conditions.
   * You cannot convert between integers and boolean values.
   */
  private boolean trueValue = true;

  private boolean falseValue = false;

  public static void main(String[] args) {
    V1CH03DataTypes dataTypes = new V1CH03DataTypes();
    System.out.println(dataTypes.toString());
    dataTypes.calculateWithStrictFloatingPointComputation(8, 1, 3);
  }

  /**
   * If you work with integer values that can never be negative and you really need an additional
   * bit, you can, with some care, interpret signed integer values as unsigned. For example, instead
   * of having a byte value b represent the range from –128 to 127, you may want a range from 0 to
   * 255. You can store it in a byte. Due to the nature of binary arithmetic, addition, subtraction,
   * and multiplication will work provided they don’t overflow. For other operations, call
   * Byte.toUnsignedInt(b) to get an int value between 0 and 255, then process the integer value and
   * cast back to byte. The Integer and Long classes have methods for unsigned division and
   * remainder
   */
  private byte byteAbove127Value = (byte) 250;

  private int unsigned_int_FromByte = Byte.toUnsignedInt(byteAbove127Value);
  private int singed_int_FromByte = byteAbove127Value;

  /**
   * The char type was originally intended to describe individual characters. However, this is no
   * longer the case. Nowadays, some Unicode characters can be described with one char value, and
   * other Unicode characters require two char values
   */
  private char character = 'C';

  /** char can be expressed as hex value */
  private char pi = '\u03C0'; // hex value for Greek letter pi

  /**
   * One of the stated goals of the Java programming language is portability. A computation should
   * yield the same results no matter which virtual machine executes it. For arithmetic computations
   * with floating-point numbers, it is surprisingly difficult to achieve this portability. The
   * double type uses 64 bits to store a numeric value, but some processors use 80-bit
   * floating-point registers. These registers yield added precision in intermediate steps of a
   * computation. For example, consider the following computation: double w = x * y / z; Many Intel
   * processors compute x * y, leave the result in an 80-bit register, then divide by z, and finally
   * truncate the result back to 64 bits. That can yield a more accurate result, and it can avoid
   * exponent overflow. But the result may be different from a computation that uses 64 bits
   * throughout. For that reason, the initial specification of the Java virtual machine mandated
   * that all intermediate computations must be truncated. The numeric community hated it. Not only
   * can the truncated computations cause overflow, they are actually slower than the more precise
   * computations because the truncation operations take time. For that reason, the Java programming
   * language was updated to recognize the conflicting demands for optimum performance and perfect
   * reproducibility. By default, virtual machine designers are now permitted to use extended
   * precision for intermediate computations. However, methods tagged with the strictfp keyword must
   * use strict floating-point operations that yield reproducible results.
   */
  private strictfp void calculateWithStrictFloatingPointComputation(double x, double y, double z) {
    double w = x * y / z;
    System.out.println("Computation:  " + w);
  }

  @Override
  public String toString() {
    return "V1CH03DataTypes [numberOfDaysInJanuary="
        + numberOfDaysInJanuary
        + ", numberOfInhabitants="
        + numberOfInhabitants
        + ", numberOfStars="
        + numberOfStars
        + ", hexNumber="
        + hexNumber
        + ", hexNum="
        + hexNum
        + ", binaryNumber="
        + binaryNumber
        + ", bunaryNum="
        + bunaryNum
        + ", oneMillionWithUnderscore="
        + oneMillionWithUnderscore
        + ", oneMillionInbinary="
        + oneMillionInbinary
        + ", banckCalculation="
        + banckCalculation
        + ", banckCalculationWithSuffix$d="
        + banckCalculationWithSuffix$d
        + ", banckCalculationWithSuffix$D="
        + banckCalculationWithSuffix$D
        + ", piValue_asFloat="
        + piValue_asFloat
        + ", trueValue="
        + trueValue
        + ", falseValue="
        + falseValue
        + ", byteAbove127Value="
        + byteAbove127Value
        + ", unsigned_int_FromByte="
        + unsigned_int_FromByte
        + ", singed_int_FromByte="
        + singed_int_FromByte
        + ", character="
        + character
        + ", pi="
        + pi
        + "]";
  }
}
