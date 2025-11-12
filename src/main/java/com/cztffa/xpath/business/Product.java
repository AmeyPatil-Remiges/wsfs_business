package com.cztffa.xpath.business;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Product {

  NONPROFITCHECKING("NonProfitChecking",
      "//tfcz-product-card[.//div[text()='Non-Profit Checking']]//button[contains(text(), 'Add to Cart')]");

  private String name;

  private String xpath;

  public static Product getByName(String name) {

      if (name.equalsIgnoreCase("NonProfitChecking")) {
      return NONPROFITCHECKING;}
      return null;
  }
}
