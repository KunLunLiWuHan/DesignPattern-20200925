package com.atguigu.responsibilitychain;
//1��ϵ����
public class DepartmentApprover extends Approver {
	public DepartmentApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getPrice() <= 5000) {
			System.out.println(" ������ id= " + purchaseRequest.getId() + " �� " + this.name + " ����");
		} else {
			//�����ˣ��ú����ȥ����
			approver.processRequest(purchaseRequest);
		}
	}
}
