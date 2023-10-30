# API

## Сущности

1. Vacancy - (вакансия)

## Описание сущности Vacancy

1. Info
   1. Title (6-128 символов)
   2. Description (100-10000 символов)
   3. Type (home-office, office etc.)
   4. Salary (может быть пустым)
2. Company (CompanyId) - идентификатор компании, которая предлагает работу
3. Country (CountryId) - идентификатор страны, в которой предлагается работа

## Функции (эндпониты)

1. Vacancy CRUDS
   1. create
   2. read
   3. update
   4. delete
   5. search - поиск по фильтрам
2. Vacancy Дополнительные 
   1. vacancies (поиск подходящих вакансий)
