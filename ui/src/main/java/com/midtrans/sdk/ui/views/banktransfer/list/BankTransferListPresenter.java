package com.midtrans.sdk.ui.views.banktransfer.list;

import com.midtrans.sdk.ui.MidtransUi;
import com.midtrans.sdk.ui.abtracts.BasePaymentPresenter;

/**
 * Created by ziahaqi on 3/31/17.
 */
public class BankTransferListPresenter extends BasePaymentPresenter {

    public BankTransferListPresenter() {
        midtransUiSdk = MidtransUi.getInstance();
    }

}