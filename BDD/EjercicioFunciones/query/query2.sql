SELECT *
FROM Invoice
WHERE YEAR(InvoiceDate) = 2024
AND MONTH(InvoiceDate) IN (1, 2, 3);