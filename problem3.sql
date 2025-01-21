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
* Problem 3: use the MIN() aggregate function to return the lowest salary.
* Note: the output should not contain any other info but the salary.
*/

SELECT MIN(salary) FROM employee;