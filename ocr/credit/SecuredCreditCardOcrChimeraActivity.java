package com.google.android.gms.ocr.credit;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ocr.RecognitionScreen;
import defpackage.asng;
import defpackage.csje;
import defpackage.edeq;
import defpackage.edjs;
import defpackage.edxp;
import defpackage.fann;
import defpackage.fqpy;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SecuredCreditCardOcrChimeraActivity extends csje {
    private final boolean o() {
        int intExtra = getIntent().getIntExtra("com.google.android.gms.ocr.THEME", 0);
        boolean contains = fqpy.a.a().b().b.contains(Integer.valueOf(intExtra));
        if (intExtra == 4) {
            int i = edjs.a;
            contains &= edeq.s(this);
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
            contains &= fqpy.a.a().a().b.containsAll(arrayList);
        }
        return (getIntent().getBooleanExtra("com.google.android.gms.ocr.PREVIEW_AGGREGATED_EXP_DATE", false) || getIntent().getBooleanExtra("com.google.android.gms.ocr.PREVIEW_AGGREGATED_NAME", false)) ? fqpy.a.a().e() & contains : contains;
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        l(null, 0);
        super.onBackPressed();
    }

    @Override // defpackage.csje, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        asng.B(this);
        if (fqpy.c() && o()) {
            edxp.f(g(), fann.STATIC_OCR_ELIGIBLE);
        }
        if (!fqpy.a.a().c() || !o()) {
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
