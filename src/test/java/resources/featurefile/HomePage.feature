Feature: Home Page Test
  As a user i want to be on homepage in cv-library website and search jobs

  @regression
  Scenario Outline:  I should search different jobs from cv-library website
    Given I am on homepage
    When  I accept privacy
    And   I enter JobTitle in the jobTitle Field "<jobTitle>"
    And   I enter Location in the Location Field "<location>"
    And   I select distance from DropDown List "<Distance>"
    And   I click on more search option
    And   I enter MinSalary "<SalaryMin>"
    And   I enter MaxSalary "<SalaryMax>"
    And   I select Salary Type "<SalaryType>"
    And   I select Job Type "<jobType>"
    And  I click On Find Job Button
    Then I verify the Result "<Result>"
    Examples:
      | jobTitle        | location       | Distance      | SalaryMin | SalaryMax | SalaryType | jobType   | Result                                      |
      | Tester          | Harrow         | up to 5 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill |
      | Delivery Driver | Luton          | up to 1 mile  | 10000     | 25000     | Per annum  | Part Time | Part Time Delivery Driver jobs in Luton     |
      | Driver          | Leicestershire | up to 3 miles | 10000     | 25000     | Per annum  | Permanent | Permanent Driver jobs in Leicestershire     |
      | Dentist         | Northampton    | up to 5 miles | 10000     | 25000     | Per annum  | Permanent | Permanent Dentist jobs in Northampton       |
      | Manager         | London         | up to 2 miles | 10000     | 25000     | Per annum  | Part Time | Part Time Manager jobs in London            |
      | Hr Officer      | Milton Keynes  | up to 2 miles | 10000     | 25000     | Per annum  | Permanent | Permanent Hr Officer jobs in Milton Keynes  |
      | Sales Executive | Surrey         | up to 3 miles | 10000     | 25000     | Per annum  | Part Time | Part Time Sales Executive jobs in Surrey    |















