package com.google.android.gms.ocr.credit;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ocr.RecognitionScreen;
import defpackage.aura;
import defpackage.cusj;
import defpackage.efrl;
import defpackage.efwn;
import defpackage.egkq;
import defpackage.fdcc;
import defpackage.ftjv;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SecuredCreditCardOcrChimeraActivity extends cusj {
    private final boolean o() {
        int intExtra = getIntent().getIntExtra("com.google.android.gms.ocr.THEME", 0);
        ftjv ftjvVar = ftjv.a;
        boolean contains = ftjvVar.lK().b().b.contains(Integer.valueOf(intExtra));
        if (intExtra == 4) {
            int i = efwn.a;
            contains &= efrl.s(this);
        }
        Bundle bundleExtra = getIntent().getBundleExtra("com.google.android.gms.ocr.RECOGNITION");
        if (bundleExtra != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("com.google.android.gms.ocr.RECOGNITION_SCREENS");
            if (parcelableArrayList.isEmpty()) {
                for (int i2 : bundleExtra.getIntArray("com.google.android.gms.ocr.RECOGNITION_SCREENTYPES")) {
                    arrayList.add(Integer.valueOf(i2));
                }
            } else {
                int size = parcelableArrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(Integer.valueOf(((RecognitionScreen) parcelableArrayList.get(i3)).c));
                }
            }
            contains &= ftjvVar.lK().a().b.containsAll(arrayList);
        }
        return (getIntent().getBooleanExtra("com.google.android.gms.ocr.PREVIEW_AGGREGATED_EXP_DATE", false) || getIntent().getBooleanExtra("com.google.android.gms.ocr.PREVIEW_AGGREGATED_NAME", false)) ? ftjvVar.lK().e() & contains : contains;
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        l(null, 0);
        super.onBackPressed();
    }

    @Override // defpackage.cusj, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        aura.B(this);
        if (ftjv.c() && o()) {
            egkq.f(g(), fdcc.STATIC_OCR_ELIGIBLE);
        }
        if (!ftjv.a.lK().c() || !o()) {
            super.onCreate(bundle);
            return;
        }
        super.m(bundle);
        Intent intent = getIntent();
        intent.setAction("com.google.android.gms.wallet.ACTION_SHIM_CREDIT_CARD_OCR");
        intent.setComponent(null);
        intent.setFlags(33554432);
        startActivity(intent);
        finish();
    }
}
