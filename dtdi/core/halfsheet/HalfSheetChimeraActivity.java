package com.google.android.gms.dtdi.core.halfsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.dtdi.core.halfsheet.HalfSheetChimeraActivity;
import defpackage.ausn;
import defpackage.auub;
import defpackage.baey;
import defpackage.baug;
import defpackage.bawz;
import defpackage.baxn;
import defpackage.bayp;
import defpackage.bayu;
import defpackage.bazh;
import defpackage.bbhu;
import defpackage.bp;
import defpackage.dg;
import defpackage.edxt;
import defpackage.eluo;
import defpackage.fxxm;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class HalfSheetChimeraActivity extends ryt {
    public static final ausn j = baey.a("HalfSheetActivity");

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
        ((eluo) j.j()).x("No wakeup request");
        a("com.google.android.gms.dtdi.core.halfsheet.extra.cancellationReasonNoWakeupRequest");
        return null;
    }

    public final void a(String str) {
        setResult(0, new Intent().putExtra("com.google.android.gms.dtdi.halfsheet.extra.cancellationReason", str));
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (baug.d()) {
            getContainerActivity();
            int i = edxt.a;
        }
        if (!auub.c()) {
            ((eluo) j.j()).x("Platform version too old");
            a("com.google.android.gms.dtdi.core.halfsheet.extra.cancellationReasonPlatformVersion");
            return;
        }
        int intExtra = getIntent().getIntExtra("com.google.android.gms.dtdi.halfsheet.extra.TYPE", 0);
        if (intExtra != 1 && intExtra != 2 && intExtra != 3 && intExtra != 4) {
            ((eluo) j.j()).z("Invalid type %d", intExtra);
            a("com.google.android.gms.dtdi.core.halfsheet.extra.cancellationReasonHalfsheetType");
            return;
        }
        findViewById(R.id.outer_container).setOnClickListener(new View.OnClickListener() { // from class: bayg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((eluo) HalfSheetChimeraActivity.j.h()).x("Default handling for out-of-bounds halfsheet taps; dismissing");
                HalfSheetChimeraActivity.this.a("com.google.android.gms.dtdi.halfsheet.extra.cancellationReasonActivityDismissed");
            }
        });
        if (bundle != null) {
            ((eluo) j.h()).x("Activity data already exists, not adding fragment");
            return;
        }
        if (intExtra == 1) {
            if (bbhu.b(this)) {
                b(new bayu());
                return;
            } else {
                ((eluo) j.j()).z("Ineligible for type %d", intExtra);
                a("com.google.android.gms.dtdi.core.halfsheet.extra.cancellationReasonMediaTransferUnavailable");
                return;
            }
        }
        if (intExtra == 2) {
            bayp baypVar = new bayp();
            Bundle bundle2 = new Bundle();
            bundle2.putString("com.google.android.gms.dtdi.halfsheet.extra.REQUESTOR_DEVICE_NAME", getIntent().getStringExtra("com.google.android.gms.dtdi.halfsheet.extra.REQUESTOR_DEVICE_NAME"));
            bundle2.putString("com.google.android.gms.dtdi.halfsheet.extra.REQUESTOR_PACKAGE_NAME", getIntent().getStringExtra("com.google.android.gms.dtdi.halfsheet.extra.REQUESTOR_PACKAGE_NAME"));
            bundle2.putString("com.google.android.gms.dtdi.halfsheet.extra.APP_PROVIDED_REASON", getIntent().getStringExtra("com.google.android.gms.dtdi.halfsheet.extra.APP_PROVIDED_REASON"));
            bundle2.putInt("com.google.android.gms.dtdi.halfsheet.extra.FORM_FACTOR", getIntent().getIntExtra("com.google.android.gms.dtdi.halfsheet.extra.FORM_FACTOR", -1));
            bundle2.putString("com.google.android.gms.dtdi.halfsheet.extra.PROFILE_PICTURE_URL", getIntent().getStringExtra("com.google.android.gms.dtdi.halfsheet.extra.PROFILE_PICTURE_URL"));
            bundle2.putString("com.google.android.gms.dtdi.halfsheet.extra.WAKEUP_REQUEST_ID", getIntent().getStringExtra("com.google.android.gms.dtdi.halfsheet.extra.WAKEUP_REQUEST_ID"));
            baypVar.setArguments(bundle2);
            b(baypVar);
            return;
        }
        if (intExtra != 3) {
            byte[] c = c();
            if (c == null) {
                return;
            }
            bazh bazhVar = new bazh();
            Intent intent = getIntent();
            fxxm.e(intent, "getIntent(...)");
            bazhVar.setArguments(bawz.a(intent, c));
            b(bazhVar);
            return;
        }
        byte[] c2 = c();
        if (c2 != null) {
            baxn baxnVar = new baxn();
            Intent intent2 = getIntent();
            fxxm.e(intent2, "getIntent(...)");
            baxnVar.setArguments(bawz.a(intent2, c2));
            b(baxnVar);
        }
    }
}
