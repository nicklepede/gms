package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SettingsReviewChimeraActivity;
import defpackage.clmm;
import defpackage.dfak;
import defpackage.eble;
import defpackage.eygi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SettingsReviewChimeraActivity extends clmm {
    @Override // defpackage.clmm
    protected final eygi l() {
        return eygi.USE_CASE_NEARBY_SHARE;
    }

    @Override // defpackage.clmm
    protected final String m() {
        return "com.google.android.gms.nearby.sharing.SettingsReviewActivity";
    }

    @Override // defpackage.clmm, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        getContainerActivity();
        int i = eble.a;
        super.onCreate(bundle);
        setContentView(R.layout.sharing_settingsreview_activity);
    }

    @Override // defpackage.clmm
    protected final void q(final long j) {
        final String stringExtra = getIntent().getStringExtra("referrer_package_name");
        final String stringExtra2 = getIntent().getStringExtra("source_activity");
        final boolean booleanExtra = getIntent().getBooleanExtra("initial_enable_status", false);
        k().n().z(new dfak() { // from class: cmal
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                Boolean bool = (Boolean) obj;
                fecj v = exxm.a.v();
                eygi eygiVar = eygi.USE_CASE_NEARBY_SHARE;
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                exxm exxmVar = (exxm) fecpVar;
                exxmVar.c = eygiVar.j;
                exxmVar.b |= 1;
                if (!fecpVar.L()) {
                    v.U();
                }
                exxm exxmVar2 = (exxm) v.b;
                exxmVar2.b |= 2;
                exxmVar2.d = false;
                boolean booleanValue = bool.booleanValue();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar2 = v.b;
                exxm exxmVar3 = (exxm) fecpVar2;
                exxmVar3.b |= 4;
                exxmVar3.e = booleanValue;
                if (!fecpVar2.L()) {
                    v.U();
                }
                String str = stringExtra2;
                boolean z = booleanExtra;
                SettingsReviewChimeraActivity settingsReviewChimeraActivity = SettingsReviewChimeraActivity.this;
                exxm exxmVar4 = (exxm) v.b;
                exxmVar4.b |= 8;
                exxmVar4.f = z;
                exxm exxmVar5 = (exxm) v.Q();
                boolean isFinishing = settingsReviewChimeraActivity.isFinishing();
                fecj L = cmdh.L(32);
                fecj v2 = exxu.a.v();
                eyep eyepVar = eyep.SETTINGS_REVIEW_ACTIVITY;
                if (!v2.b.L()) {
                    v2.U();
                }
                fecp fecpVar3 = v2.b;
                exxu exxuVar = (exxu) fecpVar3;
                exxuVar.c = eyepVar.n;
                exxuVar.b |= 1;
                if (!fecpVar3.L()) {
                    v2.U();
                }
                long j2 = j;
                fecp fecpVar4 = v2.b;
                exxu exxuVar2 = (exxu) fecpVar4;
                exxuVar2.b |= 2;
                exxuVar2.d = j2;
                if (!fecpVar4.L()) {
                    v2.U();
                }
                String str2 = stringExtra;
                fecp fecpVar5 = v2.b;
                exxu exxuVar3 = (exxu) fecpVar5;
                exxuVar3.b |= 16;
                exxuVar3.f = false;
                if (str2 != null) {
                    if (!fecpVar5.L()) {
                        v2.U();
                    }
                    exxu exxuVar4 = (exxu) v2.b;
                    exxuVar4.b |= 4;
                    exxuVar4.e = str2;
                }
                eyep x = cmdh.x(asqx.c(str));
                if (!v2.b.L()) {
                    v2.U();
                }
                fecp fecpVar6 = v2.b;
                exxu exxuVar5 = (exxu) fecpVar6;
                exxuVar5.g = x.n;
                exxuVar5.b |= 32;
                if (!fecpVar6.L()) {
                    v2.U();
                }
                exxu exxuVar6 = (exxu) v2.b;
                exxuVar6.b |= 64;
                exxuVar6.h = isFinishing;
                exxu exxuVar7 = (exxu) v2.Q();
                if (!L.b.L()) {
                    L.U();
                }
                exzg exzgVar = (exzg) L.b;
                exzg exzgVar2 = exzg.a;
                exxuVar7.getClass();
                exzgVar.x = exxuVar7;
                exzgVar.b |= 8388608;
                if (!L.b.L()) {
                    L.U();
                }
                exzg exzgVar3 = (exzg) L.b;
                exxmVar5.getClass();
                exzgVar3.Y = exxmVar5;
                exzgVar3.c |= 8388608;
                settingsReviewChimeraActivity.p(new cmcj((exzg) L.Q()));
            }
        });
    }
}
