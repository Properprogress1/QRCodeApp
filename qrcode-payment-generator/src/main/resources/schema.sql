DROP TABLE IF EXISTS transactions;
DROP TABLE IF EXISTS merchants;
DROP TABLE IF EXISTS users;


CREATE TABLE users (
    id BIGINT PRIMARY KEY,
    balance DECIMAL(19,2) NOT NULL
);

CREATE TABLE merchants (
    id BIGINT PRIMARY KEY,
    balance DECIMAL(19,2) NOT NULL
);

CREATE TABLE transactions (
    id VARCHAR(36) PRIMARY KEY,
    amount DECIMAL(19,2) NOT NULL,
    currency VARCHAR(50) NOT NULL,
    merchant_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    description VARCHAR(255),
    status VARCHAR(20) NOT NULL,
    created_at TIMESTAMP NOT NULL
);