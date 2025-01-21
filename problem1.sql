/**
 *   employee table
 *   |  id  |   first_name   |   last_name   |  salary  |
 *   --------------------------------------------------
 *   |1     |'Steve'         |'Garcia'       |67400.00  |
 *   |2     |'Alexa'         |'Smith'        |42500.00  |
 *   |3     |'Steve'         |'Jones'        |99890.99  |
 *   |4     |'Brandon'       |'Smith'        |120000    |
 *   |5     |'Adam'          |'Jones'        |55050.50  |
 *
 */

/**
* Problem 1: use the SUM() aggregate function to output the total of all salaries found in the table.
* Note: the output should not contain any other info but the sum.
*/

SELECT SUM(salary) FROM employee;
