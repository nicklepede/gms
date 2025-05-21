package com.google.android.gms.dtdi.core.halfsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.dtdi.core.halfsheet.HalfSheetChimeraActivity;
import defpackage.asot;
import defpackage.asqh;
import defpackage.ayay;
import defpackage.ayqk;
import defpackage.aytf;
import defpackage.aytt;
import defpackage.ayuv;
import defpackage.ayva;
import defpackage.ayvn;
import defpackage.azds;
import defpackage.bp;
import defpackage.dg;
import defpackage.eble;
import defpackage.ejhf;
import defpackage.fvbo;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class HalfSheetChimeraActivity extends qfp {
    public static final asot j = ayay.a("HalfSheetActivity");

    public HalfSheetChimeraActivity() {
        super(R.layout.half_sheet_container);
    }

    private final void b(dg dgVar) {
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.inner_container, dgVar);
        bpVar.a();
    }

    private final byte[] c() {
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("com.google.android.gms.dtdi.discovery.extra.WAKE_UP_REQUEST");
        if (byteArrayExtra != null) {
            return byteArrayExtra;
        }
        ((ejhf) j.j()).x("No wakeup request");
        a("com.google.android.gms.dtdi.core.halfsheet.extra.cancellationReasonNoWakeupRequest");
        return null;
    }

    public final void a(String str) {
        setResult(0, new Intent().putExtra("com.google.android.gms.dtdi.halfsheet.extra.cancellationReason", str));
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ayqk.d()) {
            getContainerActivity();
            int i = eble.a;
        }
        if (!asqh.c()) {
            ((ejhf) j.j()).x("Platform version too old");
            a("com.google.android.gms.dtdi.core.halfsheet.extra.cancellationReasonPlatformVersion");
            return;
        }
        int intExtra = getIntent().getIntExtra("com.google.android.gms.dtdi.halfsheet.extra.TYPE", 0);
        if (intExtra != 1 && intExtra != 2 && intExtra != 3 && intExtra != 4) {
            ((ejhf) j.j()).z("Invalid type %d", intExtra);
            a("com.google.android.gms.dtdi.core.halfsheet.extra.cancellationReasonHalfsheetType");
            return;
        }
        findViewById(R.id.outer_container).setOnClickListener(new View.OnClickListener() { // from class: ayum
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((ejhf) HalfSheetChimeraActivity.j.h()).x("Default handling for out-of-bounds halfsheet taps; dismissing");
                HalfSheetChimeraActivity.this.a("com.google.android.gms.dtdi.halfsheet.extra.cancellationReasonActivityDismissed");
            }
        });
        if (bundle != null) {
            ((ejhf) j.h()).x("Activity data already exists, not adding fragment");
            return;
        }
        if (intExtra == 1) {
            if (azds.b(this)) {
                b(new ayva());
                return;
            } else {
                ((ejhf) j.j()).z("Ineligible for type %d", intExtra);
                a("com.google.android.gms.dtdi.core.halfsheet.extra.cancellationReasonMediaTransferUnavailable");
                return;
            }
        }
        if (intExtra == 2) {
            ayuv ayuvVar = new ayuv();
            Bundle bundle2 = new Bundle();
            bundle2.putString("com.google.android.gms.dtdi.halfsheet.extra.REQUESTOR_DEVICE_NAME", getIntent().getStringExtra("com.google.android.gms.dtdi.halfsheet.extra.REQUESTOR_DEVICE_NAME"));
            bundle2.putString("com.google.android.gms.dtdi.halfsheet.extra.REQUESTOR_PACKAGE_NAME", getIntent().getStringExtra("com.google.android.gms.dtdi.halfsheet.extra.REQUESTOR_PACKAGE_NAME"));
            bundle2.putString("com.google.android.gms.dtdi.halfsheet.extra.APP_PROVIDED_REASON", getIntent().getStringExtra("com.google.android.gms.dtdi.halfsheet.extra.APP_PROVIDED_REASON"));
            bundle2.putInt("com.google.android.gms.dtdi.halfsheet.extra.FORM_FACTOR", getIntent().getIntExtra("com.google.android.gms.dtdi.halfsheet.extra.FORM_FACTOR", -1));
            bundle2.putString("com.google.android.gms.dtdi.halfsheet.extra.PROFILE_PICTURE_URL", getIntent().getStringExtra("com.google.android.gms.dtdi.halfsheet.extra.PROFILE_PICTURE_URL"));
            bundle2.putString("com.google.android.gms.dtdi.halfsheet.extra.WAKEUP_REQUEST_ID", getIntent().getStringExtra("com.google.android.gms.dtdi.halfsheet.extra.WAKEUP_REQUEST_ID"));
            ayuvVar.setArguments(bundle2);
            b(ayuvVar);
            return;
        }
        if (intExtra != 3) {
            byte[] c = c();
            if (c == null) {
                return;
            }
            ayvn ayvnVar = new ayvn();
            Intent intent = getIntent();
            fvbo.e(intent, "getIntent(...)");
            ayvnVar.setArguments(aytf.a(intent, c));
            b(ayvnVar);
            return;
        }
        byte[] c2 = c();
        if (c2 != null) {
            aytt ayttVar = new aytt();
            Intent intent2 = getIntent();
            fvbo.e(intent2, "getIntent(...)");
            ayttVar.setArguments(aytf.a(intent2, c2));
            b(ayttVar);
        }
    }
}
