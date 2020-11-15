package org.csu.klu.persistence;

import java.util.List;

import org.csu.klu.domain.LineItem;

public interface LineItemMapper {

  List<LineItem> getLineItemsByOrderId(int orderId);

  void insertLineItem(LineItem lineItem);

}
