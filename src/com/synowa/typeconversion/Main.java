package com.synowa.typeconversion;

public class Main {

    public static void main(String[] args) {
	float floatVal = 1.0f;
	double doubleVal = 4.0d;
	byte byteVal = 7;
	short shortVal = 7;
	long longVal = 5;

	//short result1 = byteVal; //result is Success
	//short result1 = longVal; //result is Error
	//short result1 = (short)longVal; //result is Success
	//short result1 = (short)byteVal; //result is Success, but there's no reason to do that
	//short result2 = byteVal - longVal; //result is Error
	//short result2 = (short) (byteVal - longVal); //result is Success

		//long result3 = longVal - floatVal; //result is Error
		//float result3 = longVal - floatVal; //result is Success
		//float result3 = longVal - doubleVal; //result is Error
		//double result3 = longVal - doubleVal; //result is Success
		//long result4 = shortVal - longVal + floatVal +doubleVal; //result is Error
		long result4 = (long) (shortVal - longVal + floatVal +doubleVal); //result is Success


	System.out.println("Success");
    }
}
