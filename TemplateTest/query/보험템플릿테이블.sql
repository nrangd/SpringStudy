CREATE TABLE insurance_product (
    p_id NUMBER PRIMARY KEY,
    title VARCHAR2(255),
    badge VARCHAR2(255),
    subtitle VARCHAR2(255),
    descriptions CLOB,
    breadcrumb VARCHAR2(255),
    main_button_text VARCHAR2(255),
    top_image VARCHAR2(500),
    tabs_json CLOB,
    sections_json CLOB,
    bottom_buttons_json CLOB
);

CREATE SEQUENCE insurance_product_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER trg_insurance_product_id
BEFORE INSERT ON insurance_product
FOR EACH ROW
BEGIN
  IF :NEW.p_id IS NULL THEN
    SELECT insurance_product_seq.NEXTVAL INTO :NEW.p_id FROM dual;
  END IF;
END;
