SELECT s.supplier_name AS supplier,
    p.price as price
FROM supplier s
    JOIN supply sp ON s.supplier_code = sp.supplier_code
    JOIN part p ON sp.part_code = p.part_code
    JOIN car c ON sp.car_code = c.car_code
WHERE UPPER(s.city) = 'VITORIA'
    AND UPPER(p.name_part) = 'MOTOR'
    AND UPPER(c.name_car) = 'KOMBI';