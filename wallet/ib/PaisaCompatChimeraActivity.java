package com.google.android.gms.wallet.ib;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;
import defpackage.dkop;
import defpackage.dljy;
import defpackage.fvpi;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PaisaCompatChimeraActivity extends ryt {
    private final void a(int i) {
        Intent intent = new Intent();
        dkop.a(intent, new Status(i));
        b(1, intent);
    }

    private final void b(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 501) {
            a(8);
            return;
        }
        if (i2 == -1) {
            PaymentData b = PaymentData.b(intent.getStringExtra("paymentDataJson"));
            Intent intent2 = new Intent();
            b.c(intent2);
            b(-1, intent2);
            return;
        }
        if (i2 == 0) {
            b(0, null);
            return;
        }
        if (i2 != 1) {
            a(8);
            return;
        }
        int intValue = (intent != null ? Integer.valueOf(intent.getIntExtra("errorCode", 8)) : 8).intValue();
        if (intValue == 8 || intValue == 10 || intValue == 405 || intValue == 409 || intValue == 412) {
            a(intValue);
        } else {
            a(8);
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_Wallet_No_Display);
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        String c = fvpi.c();
        if (TextUtils.isEmpty(c)) {
            a(8);
        }
        Intent intent = new Intent("com.google.android.apps.nbu.paisa.user.LOAD_PAYMENT_DATA");
        intent.setPackage(c);
        intent.putExtras((Bundle) dljy.b(Bundle.CREATOR, getIntent().getStringExtra("transformedExtras")));
        startActivityForResult(intent, 501);
    }
}
