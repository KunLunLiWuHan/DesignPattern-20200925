package com.atguigu.responsibilitychain;
//1、系主任
public class DepartmentApprover extends Approver {
	public DepartmentApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getPrice() <= 5000) {
			System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
		} else {
			//处理不了，让后继者去处理
			approver.processRequest(purchaseRequest);
		}
	}
}
