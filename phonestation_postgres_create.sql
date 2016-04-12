CREATE TABLE "user_profile" (
	"id" serial NOT NULL,
	"first_name" character varying(100) NOT NULL,
	"last_name" character varying(100) NOT NULL,
	"address" character varying(255) NOT NULL,
	"blocked" bit NOT NULL DEFAULT '0',
	"created" TIMESTAMP NOT NULL,
	CONSTRAINT user_profile_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "use_detail" (
	"id" serial NOT NULL,
	"contract_id" int NOT NULL,
	"service_id" int NOT NULL,
	"period" DATE NOT NULL,
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
	"contract_id" int NOT NULL,
	"service_id" int NOT NULL,
	"blocked" bit NOT NULL DEFAULT '0'
) WITH (
  OIDS=FALSE
);



CREATE TABLE "phone_number" (
	"id" serial NOT NULL,
	"phone_number" numeric NOT NULL UNIQUE,
	"ats_id" int NOT NULL,
	CONSTRAINT phone_number_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "service" (
	"id" serial NOT NULL,
	"name" character varying(255) NOT NULL,
	"date_blocked" DATE NOT NULL,
	CONSTRAINT service_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "payment" (
	"id" serial NOT NULL,
	"contract_id" int NOT NULL,
	"service_id" int NOT NULL,
	"period" DATE NOT NULL,
	"total_sum" numeric NOT NULL,
	"date_payment" DATE NOT NULL,
	"pay_sum" numeric NOT NULL,
	CONSTRAINT payment_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "ats" (
	"id" serial NOT NULL,
	"name" character varying(100) NOT NULL,
	"code_ats" int NOT NULL,
	"district" character varying(255) NOT NULL,
	"count_number" int NOT NULL,
	CONSTRAINT ats_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "user" (
	"id" int NOT NULL,
	"login" character varying(100) NOT NULL,
	"email" character varying(100) NOT NULL,
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
	"phone_number_id" int NOT NULL,
	"date_begin" DATE NOT NULL,
	"date_end" DATE NOT NULL,
	CONSTRAINT contract_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "penalty" (
	"id" serial NOT NULL,
	"payment_id" int NOT NULL,
	"sum_no_pay" numeric NOT NULL,
	"percent" numeric NOT NULL,
	CONSTRAINT penalty_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



ALTER TABLE "user_profile" ADD CONSTRAINT "user_profile_fk0" FOREIGN KEY ("id") REFERENCES "user"("id");

ALTER TABLE "use_detail" ADD CONSTRAINT "use_detail_fk0" FOREIGN KEY ("contract_id") REFERENCES "contract"("id");
ALTER TABLE "use_detail" ADD CONSTRAINT "use_detail_fk1" FOREIGN KEY ("service_id") REFERENCES "service"("id");

ALTER TABLE "price" ADD CONSTRAINT "price_fk0" FOREIGN KEY ("service_id") REFERENCES "service"("id");
ALTER TABLE "price" ADD CONSTRAINT "price_fk1" FOREIGN KEY ("measures_id") REFERENCES "measures"("id");

ALTER TABLE "services_2_contract" ADD CONSTRAINT "services_2_contract_contract_id_service_id_key" UNIQUE("contract_id", "service_id");
ALTER TABLE "services_2_contract" ADD CONSTRAINT "services_2_contract_fk0" FOREIGN KEY ("contract_id") REFERENCES "contract"("id");
ALTER TABLE "services_2_contract" ADD CONSTRAINT "services_2_contract_fk1" FOREIGN KEY ("service_id") REFERENCES "service"("id");

ALTER TABLE "phone_number" ADD CONSTRAINT "phone_number_fk0" FOREIGN KEY ("ats_id") REFERENCES "ats"("id");

ALTER TABLE "payment" ADD CONSTRAINT "payment_fk0" FOREIGN KEY ("contract_id") REFERENCES "use_detail"("contract_id");
ALTER TABLE "payment" ADD CONSTRAINT "payment_fk1" FOREIGN KEY ("service_id") REFERENCES "use_detail"("service_id");
ALTER TABLE "payment" ADD CONSTRAINT "payment_fk2" FOREIGN KEY ("period") REFERENCES "use_detail"("period");


ALTER TABLE "user" ADD CONSTRAINT "user_fk0" FOREIGN KEY ("id") REFERENCES "user_profile"("id");


ALTER TABLE "contract" ADD CONSTRAINT "contract_fk0" FOREIGN KEY ("user_id") REFERENCES "user_profile"("id");
ALTER TABLE "contract" ADD CONSTRAINT "contract_fk1" FOREIGN KEY ("phone_number_id") REFERENCES "phone_number"("id");

ALTER TABLE "penalty" ADD CONSTRAINT "penalty_fk0" FOREIGN KEY ("payment_id") REFERENCES "payment"("id");