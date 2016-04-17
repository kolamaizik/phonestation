/*
CREATE DATABASE phonestation
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Russian_Russia.1251'
       LC_CTYPE = 'Russian_Russia.1251'
       CONNECTION LIMIT = -1;

--*/
CREATE TABLE "user_profile" (
	"id" int NOT NULL,
	"first_name" character varying(100) NOT NULL,
	"last_name" character varying(100) NOT NULL,
	"address" character varying(255) NOT NULL,
	"blocked" bit NOT NULL DEFAULT '0',
	"lock_date" DATE NOT NULL,
	"created" TIMESTAMP NOT NULL,
	CONSTRAINT user_profile_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "use_detail" (
	"id" serial NOT NULL,
	"service_2_contract_id" int NOT NULL,
	"quantity" numeric NOT NULL,
	"date_use_service" TIMESTAMP NOT NULL,
	CONSTRAINT use_detail_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "price" (
	"id" serial NOT NULL,
	"service_id" int NOT NULL,
	"date_begin" DATE NOT NULL,
	"date_end" DATE NOT NULL,
	"price" numeric NOT NULL,
	"measures_id" int NOT NULL,
	CONSTRAINT price_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "services_2_contract" (
	"id" serial NOT NULL,
	"service_id" int NOT NULL,
	"contract_id" int NOT NULL,
	"blocked" bit NOT NULL DEFAULT '0',
	CONSTRAINT services_2_contract_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "service" (
	"id" serial NOT NULL,
	"name" character varying(255) NOT NULL,
	"date_end" DATE NOT NULL,
	CONSTRAINT service_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "payment" (
	"id" serial NOT NULL,
	"service_2_contract_id" int NOT NULL,
	"period" DATE NOT NULL,
	"total_sum" numeric NOT NULL,
	"date_payment" DATE NOT NULL,
	"paid" bit NOT NULL,
	CONSTRAINT payment_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "user" (
	"id" int NOT NULL,
	"email" character varying(100) NOT NULL UNIQUE,
	"password" character varying(100) NOT NULL,
	"role" int NOT NULL,
	CONSTRAINT user_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "measures" (
	"id" serial NOT NULL,
	"name" character varying(100) NOT NULL,
	"value" numeric NOT NULL,
	CONSTRAINT measures_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "contract" (
	"id" serial NOT NULL,
	"user_id" int NOT NULL,
	"phone_number" int NOT NULL UNIQUE,
	"date_begin" DATE NOT NULL,
	"date_end" DATE NOT NULL,
	CONSTRAINT contract_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);


ALTER TABLE "user_profile" ADD CONSTRAINT "user_profile_fk0" FOREIGN KEY ("id") REFERENCES "user"("id");

ALTER TABLE "use_detail" ADD CONSTRAINT "use_detail_fk0" FOREIGN KEY ("service_2_contract_id") REFERENCES "services_2_contract"("id");

ALTER TABLE "price" ADD CONSTRAINT "price_fk0" FOREIGN KEY ("service_id") REFERENCES "service"("id");
ALTER TABLE "price" ADD CONSTRAINT "price_fk1" FOREIGN KEY ("measures_id") REFERENCES "measures"("id");

ALTER TABLE "services_2_contract" ADD CONSTRAINT "services_2_contract_key0" UNIQUE("contract_id", "service_id");
ALTER TABLE "services_2_contract" ADD CONSTRAINT "services_2_contract_fk0" FOREIGN KEY ("service_id") REFERENCES "service"("id");
ALTER TABLE "services_2_contract" ADD CONSTRAINT "services_2_contract_fk1" FOREIGN KEY ("contract_id") REFERENCES "contract"("id");

ALTER TABLE "payment" ADD CONSTRAINT "payment_fk0" FOREIGN KEY ("service_2_contract_id") REFERENCES "services_2_contract"("id");

ALTER TABLE "user" ADD CONSTRAINT "user_fk0" FOREIGN KEY ("id") REFERENCES "user_profile"("id");

ALTER TABLE "contract" ADD CONSTRAINT "contract_fk0" FOREIGN KEY ("user_id") REFERENCES "user_profile"("id");