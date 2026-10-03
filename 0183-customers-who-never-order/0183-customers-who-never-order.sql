# Write your MySQL query statement below
SELECT c.name AS Customers FROM Customers c
LEFT JOIN Orders o
ON c.id=o.customerId
WHERE o.customerId IS null;





-- SELECT name AS Customers
-- FROM Customers 
-- WHERE id NOT IN(
-- SELECT Customers.id
-- FROM Customers
-- JOIN Orders
-- ON Customers.id=Orders.customerId);