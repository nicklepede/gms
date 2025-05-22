package com.google.android.gms.backup.settings.overview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.preference.Preference;
import com.android.settingslib.widget.StatusBannerPreference;
import com.android.settingslib.widget.TopIntroPreference;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.overview.BackupSettingsOverviewFragment;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.alow;
import defpackage.alrl;
import defpackage.alvf;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;
import defpackage.alvj;
import defpackage.alvk;
import defpackage.alvo;
import defpackage.alvu;
import defpackage.auid;
import defpackage.ausn;
import defpackage.fxqu;
import defpackage.fxqv;
import defpackage.fxqw;
import defpackage.fxwd;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.jxm;
import defpackage.mea;
import defpackage.ozs;
import defpackage.ozt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class BackupSettingsOverviewFragment extends alvu {
    public static final ausn d = ausn.b("BackupSettingsOverviewFragment", auid.BACKUP);
    public alow ag;
    public final aca ah;
    public final aca ai;
    private final fxqu aj;
    private final fxqu ak;
    private final fxqu al;
    private final fxqu am;
    private final fxqu an;

    public BackupSettingsOverviewFragment() {
        fxqu a = fxqv.a(fxqw.c, new alvh(new alvg(this)));
        int i = fxya.a;
        this.aj = new jxm(new fxxg(alvo.class), new alvi(a), new alvk(this, a), new alvj(a));
        this.ah = registerForActivityResult(new acq(), new aby() { // from class: alum
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ausn ausnVar = BackupSettingsOverviewFragment.d;
                fxxm.f((ActivityResult) obj, "it");
            }
        });
        this.ai = registerForActivityResult(new acq(), new aby() { // from class: alun
            @Override // defpackage.aby
            public final void jF(Object obj) {
                dymi dymiVar;
                int a2;
                Bundle extras;
                ActivityResult activityResult = (ActivityResult) obj;
                fxxm.f(activityResult, "activityResult");
                Intent intent = activityResult.b;
                byte[] byteArray = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getByteArray("opt_in_result");
                alvo M = BackupSettingsOverviewFragment.this.M();
                if (byteArray != null) {
                    try {
                        dymi dymiVar2 = dymi.a;
                        int length = byteArray.length;
                        fgqp fgqpVar = fgqp.a;
                        fgti fgtiVar = fgti.a;
                        fgri y = fgri.y(dymiVar2, byteArray, 0, length, fgqp.a);
                        fgri.M(y);
                        dymiVar = (dymi) y;
                    } catch (fgsd e) {
                        ((eluo) ((eluo) alvo.a.j()).s(e)).x("Invalid opt-in result proto.");
                    }
                    ((eluo) alvo.a.h()).B("Received opt-in result: %s", dymiVar);
                    if (dymiVar == null && (a2 = dymh.a(dymiVar.b)) != 0 && a2 == 2) {
                        fycr.b(M.e, null, null, new alvn(M, null), 3);
                        return;
                    }
                    return;
                }
                dymiVar = null;
                ((eluo) alvo.a.h()).B("Received opt-in result: %s", dymiVar);
                if (dymiVar == null) {
                }
            }
        });
        this.ak = alrl.a(this, R.string.backup_settings_overview_preference_key_status_banner);
        this.al = alrl.a(this, R.string.backup_settings_overview_preference_key_backup_description);
        this.am = alrl.a(this, R.string.backup_settings_overview_preference_key_photos);
        this.an = alrl.a(this, R.string.backup_settings_overview_preference_key_device_data);
    }

    public static /* synthetic */ void O(BackupSettingsOverviewFragment backupSettingsOverviewFragment, Integer num, Integer num2, Integer num3, ozt oztVar, ozt oztVar2, boolean z, final fxwd fxwdVar, int i) {
        if ((i & 8) != 0) {
            oztVar = ozt.e;
        }
        if ((i & 16) != 0) {
            oztVar2 = ozt.e;
        }
        boolean z2 = (i & 32) != 0;
        boolean z3 = z & ((i & 64) == 0);
        int i2 = i & 128;
        if ((i & 256) != 0) {
            fxwdVar = new fxwd() { // from class: aluo
                @Override // defpackage.fxwd
                public final Object a() {
                    ausn ausnVar = BackupSettingsOverviewFragment.d;
                    return fxrq.a;
                }
            };
        }
        if (1 == (i & 1)) {
            num = null;
        }
        StatusBannerPreference L = backupSettingsOverviewFragment.L();
        L.H(z2);
        if (num != null) {
            L.P(num.intValue());
        } else {
            L.n(null);
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if (num2 != null) {
            String string = L.j.getString(num2.intValue());
            fxxm.e(string, "getString(...)");
            L.o(string);
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if (num3 != null) {
            L.J(backupSettingsOverviewFragment.requireContext().getDrawable(num3.intValue()));
        }
        L.af(oztVar);
        if (i2 != 0) {
            L.k(oztVar2);
            L.l(new View.OnClickListener() { // from class: alur
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ausn ausnVar = BackupSettingsOverviewFragment.d;
                    fxwd.this.a();
                }
            });
        } else {
            L.l(null);
        }
        ((TopIntroPreference) backupSettingsOverviewFragment.al.a()).T(z3);
    }

    @Override // defpackage.mem
    public final void C(Bundle bundle, String str) {
        A(R.xml.backup_settings_overview_fragment);
        J().o = new mea() { // from class: alup
            @Override // defpackage.mea
            public final boolean b(Preference preference) {
                mbh.a(BackupSettingsOverviewFragment.this).j(R.id.backup_settings_navgraph_main_action_overview_to_device_data);
                return true;
            }
        };
        if (ozs.a(requireContext())) {
            return;
        }
        L().B = R.layout.backup_settings_overview_preference_statusbanner;
    }

    public final Preference J() {
        return (Preference) this.an.a();
    }

    public final Preference K() {
        return (Preference) this.am.a();
    }

    public final StatusBannerPreference L() {
        return (StatusBannerPreference) this.ak.a();
    }

    public final alvo M() {
        return (alvo) this.aj.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N(defpackage.fxun r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.alus
            if (r0 == 0) goto L13
            r0 = r7
            alus r0 = (defpackage.alus) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            alus r0 = new alus
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fxuz r1 = defpackage.fxuz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2b:
            defpackage.fxrc.b(r7)
            goto L6c
        L2f:
            defpackage.fxrc.b(r7)
            com.android.settingslib.widget.StatusBannerPreference r7 = r6.L()
            android.content.Context r2 = r6.requireContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            android.text.BidiFormatter r2 = android.text.BidiFormatter.getInstance(r2)
            java.lang.String r4 = android.os.Build.MODEL
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            java.lang.String r2 = r2.unicodeWrap(r4, r5)
            java.lang.String r4 = "unicodeWrap(...)"
            defpackage.fxxm.e(r2, r4)
            r7.S(r2)
            alvo r7 = r6.M()
            fynv r7 = r7.f
            aluv r2 = new aluv
            r2.<init>(r6)
            r0.c = r3
            java.lang.Object r7 = r7.nY(r2, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            fxqt r7 = new fxqt
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.settings.overview.BackupSettingsOverviewFragment.N(fxun):java.lang.Object");
    }

    @Override // defpackage.ozo, defpackage.mem, defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        fxxm.f(view, "view");
        super.onViewCreated(view, bundle);
        alrl.b(this, new alvf(this, null));
    }
}
