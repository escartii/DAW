# Consultas sobre la tabla pedidos

-- Obtener el total de pedidos
SELECT COUNT(*) AS total_pedidos
FROM pedidos;

-- Obtener el importe total de los pedidos
SELECT SUM(precio_total) AS total_importe
FROM pedidos
JOIN detalles_pedidos ON pedidos.codigo_pedido = detalles_pedidos.codigo_pedido
JOIN productos ON detalles_pedidos.codigo_producto = productos.codigo_producto;

--Obtener el pedido con mayor importe
SELECT *
FROM pedidos
JOIN detalles_pedidos ON pedidos.codigo_pedido = detalles_pedidos.codigo_pedido
JOIN productos ON detalles_pedidos.codigo_producto = productos.codigo_producto
ORDER BY precio_total DESC
LIMIT 1;

-- Obtener los pedidos realizados por el cliente con nombre 'Juan Pérez'
SELECT p.codigo_pedido, p.fecha_pedido, p.estado, p.comentarios, c.nombre_cliente
FROM pedidos p
JOIN clientes c ON p.codigo_cliente = c.codigo_cliente
WHERE c.nombre_cliente = 'Juan Pérez';

-- Obtener los pedidos realizados entre el 1 y el 14 de mayo de 2024
SELECT *
FROM pedidos
WHERE fecha_pedido BETWEEN '2024-05-01' AND '2024-05-14';


# Consultas sobre la tabla productos

--Obtener el listado de productos con su precio de venta y precio de proveedor
SELECT productos.codigo_producto, productos.nombre, productos.precio_venta, productos.precio_proveedor
FROM productos;

-- Obtener el listado de productos que se encuentran en stock
SELECT *
FROM productos
WHERE cantidad_en_stock > 0;

--Obtener el listado de productos ordenador por precio de venta de forma descendente
SELECT *
FROM productos
ORDER BY precio_venta DESC;

-- Ordenar los productos por cantidad en stock de forma descendente y obtener el producto con mayor cantidad en stock
SELECT *
FROM productos
ORDER BY cantidad_en_stock DESC
LIMIT 1;

-- Obtener el listado de productos de proveedor especifico
SELECT p.codigo_producto, p.nombre, p.precio_venta, p.precio_proveedor, pr.nombre_proveedor
FROM productos p
JOIN proveedores pr ON p.codigo_proveedor = pr.codigo_proveedor
WHERE pr.nombre_proveedor = 'Proveedor A';







