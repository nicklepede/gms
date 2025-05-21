package com.google.android.gms.wallet.ib;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.wallet.intentoperation.ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.arwm;
import defpackage.arxd;
import defpackage.dixi;
import defpackage.qfp;
import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LaunchPendingIntentChimeraActivity extends qfp {
    private int j;
    private BuyFlowConfig k;

    public static Intent a(String str) {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.wallet.ib.LaunchPendingIntentActivity");
        intent.setAction("com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.".concat(str));
        intent.setFlags(603979776);
        return intent;
    }

    private final void b(int i, Intent intent) {
        this.j = 3;
        if (intent == null) {
            setResult(i);
        } else {
            setResult(i, intent);
        }
        finish();
    }

    private final void c(Intent intent, int i) {
        ReportErrorChimeraIntentOperation.a(this.k, intent.getStringExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivitygoogleTransactionId"), 3, 8, i - 1, this);
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        arwm.c(i == 501, "Unexpected requestCode");
        b(i2, intent);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_Wallet_No_Display);
        super.onCreate(bundle);
        if (bundle != null) {
            BuyFlowConfig buyFlowConfig = (BuyFlowConfig) bundle.getParcelable("buyFlowConfig");
            arwm.s(buyFlowConfig);
            this.k = buyFlowConfig;
            this.j = bundle.getInt("processingState");
            return;
        }
        Intent intent = getIntent();
        this.j = 0;
        String stringExtra = intent.getStringExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.requestId");
        if (stringExtra == null || stringExtra.equals("DUMMY_REQUEST_ID_FOR_WRAPPER_PENDING_INTENT")) {
            throw new IllegalStateException("Wrapper pending intent should not be fired!");
        }
        BuyFlowConfig buyFlowConfig2 = (BuyFlowConfig) arxd.b(intent, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
        arwm.s(buyFlowConfig2);
        this.k = buyFlowConfig2;
        PendingIntent activity = PendingIntent.getActivity(this, 0, a(stringExtra), 536870912);
        if (activity == null) {
            throw new IllegalStateException(String.format(Locale.US, "Expected to find a wrapper intent for requestId = %s", stringExtra));
        }
        try {
        } catch (IntentSender.SendIntentException e) {
            e = e;
        }
        try {
            startIntentSenderForResult(activity.getIntentSender(), 502, null, 0, 0, 0);
            this.j = 1;
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            c(intent, 1020);
            Log.w("LPIActivity", "Failed to send wrapper pending intent", e);
            b(0, null);
            activity.cancel();
        }
        activity.cancel();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        arwm.m(this.j == 1, "Not expecting a new intent!");
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.actualPendingIntentToLaunch");
        if (pendingIntent != null) {
            ExecutorService executorService = dixi.a;
            if (Objects.equals(pendingIntent.getCreatorPackage(), "com.google.android.gms")) {
                try {
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                }
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 501, null, 0, 0, 0);
                    this.j = 2;
                    return;
                } catch (IntentSender.SendIntentException e2) {
                    e = e2;
                    c(intent, 1019);
                    Log.w("LPIActivity", "Failed to send actual pending intent", e);
                    b(0, null);
                    return;
                }
            }
        }
        throw new SecurityException("Given pending intent was not created by GMSCore!");
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("buyFlowConfig", this.k);
        bundle.putInt("processingState", this.j);
    }
}
