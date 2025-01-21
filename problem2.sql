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
* Problem 2: use the COUNT() aggregate function to output the number of employees with the last name "Smith".
* Note: the output should not contain any other info but the count.
*/

SELECT COUNT(last_name) FROM employee WHERE last_name = 'Smith';