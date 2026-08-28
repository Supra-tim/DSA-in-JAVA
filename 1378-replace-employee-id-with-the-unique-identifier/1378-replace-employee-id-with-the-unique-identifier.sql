# Write your MySQL query statement below
select eu.unique_id As unique_id , e.name As name
from employees e
Left Join employeeuni eu
on e.id=eu.id