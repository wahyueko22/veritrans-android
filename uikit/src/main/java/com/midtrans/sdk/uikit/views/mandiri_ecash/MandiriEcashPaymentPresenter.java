package com.midtrans.sdk.uikit.views.mandiri_ecash;

import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentPresenter;
import com.midtrans.sdk.uikit.abstracts.BasePaymentView;

/**
 * Created by Fajar on 31/10/17.
 */

public class MandiriEcashPaymentPresenter extends BasePaymentPresenter<BasePaymentView> {

    public MandiriEcashPaymentPresenter(BasePaymentView view) {
        super();
        this.view = view;
    }

    public void startPayment() {
        getMidtransSDK().paymentUsingMandiriEcash(getMidtransSDK().readAuthenticationToken(),
            new TransactionCallback() {
                @Override
                public void onSuccess(TransactionResponse response) {
                    transactionResponse = response;
                    view.onPaymentSuccess(response);
                }

                @Override
                public void onFailure(TransactionResponse response, String reason) {
                    transactionResponse = response;
                    view.onPaymentFailure(response);
                }

                @Override
                public void onError(Throwable error) {
                    view.onPaymentError(error);
                }
            });
    }

}
