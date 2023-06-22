# Getting Started

### Reference Documentation

Run as a default MVN sprint boot application using "spring-boot:run"

This is not a Web application, no need to call any Endpoint. 
Result will be shown on default output console.

## Example Input

/*Example Categories
		 * Root || level 1
		 * Root -> Major appliances | Minor appliances | Law & Garden || level 2
		 * Major appliances -> Kitchen appliances | General Appliances || Minor appliances -> nothing (For testing) || Law & Garden -> Law | Garden | GardeningTools || level 3
		 * Garden -> ropes | water appliances
		 */

##Current Output for default testing scenario

*****
(0-->1 Base Category Name:root)	
(0-->2 Base Category Name:root)	
(0-->3 Base Category Name:root)	

(1-->0 Base Category Name:Major appliances)	
(1-->4 Base Category Name:Major appliances)	
(1-->5 Base Category Name:Major appliances)	

(2-->0 Base Category Name:Minor appliances)	

(3-->0 Base Category Name:Law & Garden)	
(3-->6 Base Category Name:Law & Garden)	
(3-->7 Base Category Name:Law & Garden)	
(3-->8 Base Category Name:Law & Garden)	

(4-->1 Base Category Name:Kitchen appliances)	

(5-->1 Base Category Name:General Appliances)	

(6-->3 Base Category Name:Law)	

(7-->3 Base Category Name:Garden)	
(7-->9 Base Category Name:Garden)	
(7-->10 Base Category Name:Garden)	

(8-->3 Base Category Name:GardeningTools)	

(9-->7 Base Category Name:ropes)	

(10-->7 Base Category Name:water appliances)	

*****
Keywords for category Law & Garden: 
root
Law
Garden
GardeningTools
*****
The category level is: 3
The category level is: 4
*******