SELECT e1.FirstName, e1.LastName
FROM Employee AS e1
LEFT JOIN Employee AS e2 
ON e1.EmployeeId = e2.ReportsTo
GROUP BY e1.EmployeeId
ORDER BY e1.BirthDate DESC
LIMIT 5;