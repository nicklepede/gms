package com.google.android.gms.wallet.paymentmethods;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.R;
import com.google.android.gms.wallet.firstparty.bootstrap.PaymentMethodsWidgetOptions;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.arwm;
import defpackage.diez;
import defpackage.difa;
import defpackage.ding;
import defpackage.dite;
import defpackage.emen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PaymentMethodsChimeraActivity extends diez {
    Toolbar h;

    public static Intent Z(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.paymentmethods.PaymentMethodsActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_PAYMENT_METHODS");
        return intent2;
    }

    @Override // defpackage.diez
    public final void A(WalletExitResult walletExitResult) {
        dite diteVar = (dite) m();
        if (diteVar != null) {
            diteVar.by();
        } else {
            z(null, false);
        }
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        byte[] byteArrayExtra;
        byte[] bArr;
        dite N;
        Intent intent = getIntent();
        BuyFlowConfig l = l();
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_AUTH_TOKEN");
        if (ding.O(l)) {
            ding.C(this, l, ding.h, false);
        } else {
            ding.C(this, l, ding.g, false);
        }
        q(bundle, true, 6, emen.FLOW_TYPE_PAYMENT_METHODS);
        super.onCreate(bundle);
        difa.b(this);
        setContentView(R.layout.wallet_activity_common);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.h = toolbar;
        d(toolbar);
        kJ().o(true);
        findViewById(R.id.wallet_root);
        if (((dite) m()) == null) {
            Bundle extras = intent.getExtras();
            if (extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
                bArr = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
                byteArrayExtra = null;
            } else {
                if (!extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS")) {
                    throw new IllegalArgumentException("PaymentMethodsChimeraActivity requires either encrypted or unencrypted params");
                }
                byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
                bArr = null;
            }
            String[] strArr = new String[0];
            PendingIntent[] pendingIntentArr = new PendingIntent[0];
            if (extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_ACTION_ID") && extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PENDING_INTENT")) {
                strArr = intent.getStringArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_ACTION_ID");
                pendingIntentArr = ding.R(intent.getParcelableArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PENDING_INTENT"));
            }
            String[] strArr2 = strArr;
            PendingIntent[] pendingIntentArr2 = pendingIntentArr;
            boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.wallet.firstparty.EXTRA_LAUNCH_ADD_INSTRUMENT_WHEN_NO_FOP", false);
            if (!booleanExtra) {
                Parcelable parcelableExtra = intent.getParcelableExtra("com.google.android.gms.wallet.firstparty.EXTRA_WIDGET_OPTIONS");
                if (parcelableExtra instanceof PaymentMethodsWidgetOptions) {
                    booleanExtra = ((PaymentMethodsWidgetOptions) parcelableExtra).a;
                }
            }
            boolean z = booleanExtra;
            if (extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                byte[] byteArrayExtra3 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                if (bArr != null) {
                    BuyFlowConfig l2 = l();
                    String str = this.a;
                    LogContext logContext = this.b;
                    arwm.t(byteArrayExtra3, "Initialization token must not be null");
                    N = dite.N(l2, bArr, null, byteArrayExtra3, byteArrayExtra2, strArr2, pendingIntentArr2, z, str, logContext);
                } else {
                    BuyFlowConfig l3 = l();
                    String str2 = this.a;
                    LogContext logContext2 = this.b;
                    arwm.t(byteArrayExtra, "Unencrypted params must not be null");
                    arwm.t(byteArrayExtra3, "Initialization token must not be null");
                    N = dite.N(l3, null, byteArrayExtra, byteArrayExtra3, byteArrayExtra2, strArr2, pendingIntentArr2, z, str2, logContext2);
                }
            } else {
                byte[] bArr2 = bArr;
                N = bArr2 != null ? dite.N(l(), bArr2, null, null, byteArrayExtra2, strArr2, pendingIntentArr2, z, this.a, this.b) : byteArrayExtra != null ? dite.N(l(), null, byteArrayExtra, null, byteArrayExtra2, strArr2, pendingIntentArr2, z, this.a, this.b) : null;
            }
            B(N, R.id.fragment_holder);
        }
    }
}
