## Q & A community

## info
[spring doc]https://spring.io/guides/gs/serving-web-content/
[Github OAuth]https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/

## tools
git

## script
```sql
CREATE TABLE USER
(
    ID int AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ACCOUNT_ID VARCHAR(100),
    NAME VARCHAR(50),
    TOKEN VARCHAR(36),
    GMT_CREATE BIGINT,
    GMT_MODIFIED BIGINT
);

```