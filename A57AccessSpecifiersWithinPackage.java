//A57- WAP on Access specifiers outside the package by becoming the subclass for methods

package ab52;

import Package2.SampleAccessSpecifier;

public class A57AccessSpecifiersWithinPackage extends SampleAccessSpecifier
{

	public static void main(String[] args) 
	{
		SampleAccessSpecifier.publicmethod1(); // able to access because its Public.
		SampleAccessSpecifier.protectedmethod1(); // able to access because its Protected.
		//SampleAccessSpecifier.pvtmethod1(); // pvtmethod1 is Private so don't access it because it became outside package.
		//SampleAccessSpecifier.defaultmethod1();// defaultmethod1 is default package so don't access it because it became outside package.
		
	

	   }


	}


