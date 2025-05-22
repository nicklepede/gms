package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SettingsReviewChimeraActivity;
import defpackage.cnuu;
import defpackage.dhlq;
import defpackage.edxt;
import defpackage.fauu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SettingsReviewChimeraActivity extends cnuu {
    @Override // defpackage.cnuu
    protected final fauu l() {
        return fauu.USE_CASE_NEARBY_SHARE;
    }

    @Override // defpackage.cnuu
    protected final String m() {
        return "com.google.android.gms.nearby.sharing.SettingsReviewActivity";
    }

    @Override // defpackage.cnuu, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        getContainerActivity();
        int i = edxt.a;
        super.onCreate(bundle);
        setContentView(R.layout.sharing_settingsreview_activity);
    }

    @Override // defpackage.cnuu
    protected final void q(final long j) {
        final String stringExtra = getIntent().getStringExtra("referrer_package_name");
        final String stringExtra2 = getIntent().getStringExtra("source_activity");
        final boolean booleanExtra = getIntent().getBooleanExtra("initial_enable_status", false);
        k().n().z(new dhlq() { // from class: coit
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                Boolean bool = (Boolean) obj;
                fgrc v = faly.a.v();
                fauu fauuVar = fauu.USE_CASE_NEARBY_SHARE;
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                faly falyVar = (faly) fgriVar;
                falyVar.c = fauuVar.j;
                falyVar.b |= 1;
                if (!fgriVar.L()) {
                    v.U();
                }
                faly falyVar2 = (faly) v.b;
                falyVar2.b |= 2;
                falyVar2.d = false;
                boolean booleanValue = bool.booleanValue();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar2 = v.b;
                faly falyVar3 = (faly) fgriVar2;
                falyVar3.b |= 4;
                falyVar3.e = booleanValue;
                if (!fgriVar2.L()) {
                    v.U();
                }
                String str = stringExtra2;
                boolean z = booleanExtra;
                SettingsReviewChimeraActivity settingsReviewChimeraActivity = SettingsReviewChimeraActivity.this;
                faly falyVar4 = (faly) v.b;
                falyVar4.b |= 8;
                falyVar4.f = z;
                faly falyVar5 = (faly) v.Q();
                boolean isFinishing = settingsReviewChimeraActivity.isFinishing();
                fgrc L = colp.L(32);
                fgrc v2 = famg.a.v();
                fatb fatbVar = fatb.SETTINGS_REVIEW_ACTIVITY;
                if (!v2.b.L()) {
                    v2.U();
                }
                fgri fgriVar3 = v2.b;
                famg famgVar = (famg) fgriVar3;
                famgVar.c = fatbVar.n;
                famgVar.b |= 1;
                if (!fgriVar3.L()) {
                    v2.U();
                }
                long j2 = j;
                fgri fgriVar4 = v2.b;
                famg famgVar2 = (famg) fgriVar4;
                famgVar2.b |= 2;
                famgVar2.d = j2;
                if (!fgriVar4.L()) {
                    v2.U();
                }
                String str2 = stringExtra;
                fgri fgriVar5 = v2.b;
                famg famgVar3 = (famg) fgriVar5;
                famgVar3.b |= 16;
                famgVar3.f = false;
                if (str2 != null) {
                    if (!fgriVar5.L()) {
                        v2.U();
                    }
                    famg famgVar4 = (famg) v2.b;
                    famgVar4.b |= 4;
                    famgVar4.e = str2;
                }
                fatb x = colp.x(auur.c(str));
                if (!v2.b.L()) {
                    v2.U();
                }
                fgri fgriVar6 = v2.b;
                famg famgVar5 = (famg) fgriVar6;
                famgVar5.g = x.n;
                famgVar5.b |= 32;
                if (!fgriVar6.L()) {
                    v2.U();
                }
                famg famgVar6 = (famg) v2.b;
                famgVar6.b |= 64;
                famgVar6.h = isFinishing;
                famg famgVar7 = (famg) v2.Q();
                if (!L.b.L()) {
                    L.U();
                }
                fans fansVar = (fans) L.b;
                fans fansVar2 = fans.a;
                famgVar7.getClass();
                fansVar.x = famgVar7;
                fansVar.b |= 8388608;
                if (!L.b.L()) {
                    L.U();
                }
                fans fansVar3 = (fans) L.b;
                falyVar5.getClass();
                fansVar3.Y = falyVar5;
                fansVar3.c |= 8388608;
                settingsReviewChimeraActivity.p(new cokr((fans) L.Q()));
            }
        });
    }
}
