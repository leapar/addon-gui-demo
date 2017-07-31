-- begin AGD_PRODUCT
create table AGD_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    MIN_DISCOUNT double precision,
    MAX_DISCOUNT double precision,
    --
    primary key (ID)
)^
-- end AGD_PRODUCT
