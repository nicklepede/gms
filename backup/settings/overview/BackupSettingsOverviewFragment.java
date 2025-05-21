package com.google.android.gms.backup.settings.overview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.preference.Preference;
import com.android.settingslib.widget.BannerMessagePreference;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.overview.BackupSettingsOverviewFragment;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.ajod;
import defpackage.ajqs;
import defpackage.ajuk;
import defpackage.ajul;
import defpackage.ajum;
import defpackage.ajun;
import defpackage.ajuo;
import defpackage.ajup;
import defpackage.ajut;
import defpackage.ajuz;
import defpackage.asej;
import defpackage.asot;
import defpackage.fuuw;
import defpackage.fuux;
import defpackage.fuuy;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.jqx;
import defpackage.klp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class BackupSettingsOverviewFragment extends ajuz {
    public static final asot d = asot.b("BackupSettingsOverviewFragment", asej.BACKUP);
    public ajod ag;
    public final abv ah;
    public final abv ai;
    public final fuuw aj;
    private final fuuw ak;
    private final fuuw al;
    private final fuuw am;
    private final fuuw an;

    public BackupSettingsOverviewFragment() {
        fuuw a = fuux.a(fuuy.c, new ajum(new ajul(this)));
        int i = fvcc.a;
        this.ak = new jqx(new fvbi(ajut.class), new ajun(a), new ajup(this, a), new ajuo(a));
        this.ah = registerForActivityResult(new acl(), new abt() { // from class: ajtt
            @Override // defpackage.abt
            public final void jq(Object obj) {
                asot asotVar = BackupSettingsOverviewFragment.d;
                fvbo.f((ActivityResult) obj, "it");
            }
        });
        this.ai = registerForActivityResult(new acl(), new abt() { // from class: ajtu
            @Override // defpackage.abt
            public final void jq(Object obj) {
                dwah dwahVar;
                int a2;
                Bundle extras;
                ActivityResult activityResult = (ActivityResult) obj;
                fvbo.f(activityResult, "activityResult");
                Intent intent = activityResult.b;
                byte[] byteArray = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getByteArray("opt_in_result");
                ajut M = BackupSettingsOverviewFragment.this.M();
                if (byteArray != null) {
                    try {
                        dwah dwahVar2 = dwah.a;
                        int length = byteArray.length;
                        febw febwVar = febw.a;
                        feep feepVar = feep.a;
                        fecp y = fecp.y(dwahVar2, byteArray, 0, length, febw.a);
                        fecp.M(y);
                        dwahVar = (dwah) y;
                    } catch (fedk e) {
                        ((ejhf) ((ejhf) ajut.a.j()).s(e)).x("Invalid opt-in result proto.");
                    }
                    ((ejhf) ajut.a.h()).B("Received opt-in result: %s", dwahVar);
                    if (dwahVar == null && (a2 = dwag.a(dwahVar.b)) != 0 && a2 == 2) {
                        fvgt.b(M.e, null, null, new ajus(M, null), 3);
                        return;
                    }
                    return;
                }
                dwahVar = null;
                ((ejhf) ajut.a.h()).B("Received opt-in result: %s", dwahVar);
                if (dwahVar == null) {
                }
            }
        });
        this.al = ajqs.a(this, R.string.backup_settings_overview_preference_key_status_banner);
        this.aj = ajqs.a(this, R.string.backup_settings_overview_preference_key_backup_description);
        this.am = ajqs.a(this, R.string.backup_settings_overview_preference_key_photos);
        this.an = ajqs.a(this, R.string.backup_settings_overview_preference_key_device_data);
    }

    @Override // defpackage.kmb
    public final void C(Bundle bundle, String str) {
        A(R.xml.backup_settings_overview_fragment);
        J().o = new klp() { // from class: ajtv
            @Override // defpackage.klp
            public final boolean b(Preference preference) {
                kiw.a(BackupSettingsOverviewFragment.this).j(R.id.backup_settings_navgraph_main_action_overview_to_device_data);
                return true;
            }
        };
    }

    public final Preference J() {
        return (Preference) this.an.a();
    }

    public final Preference K() {
        return (Preference) this.am.a();
    }

    public final BannerMessagePreference L() {
        return (BannerMessagePreference) this.al.a();
    }

    public final ajut M() {
        return (ajut) this.ak.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N(defpackage.fuyp r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ajtx
            if (r0 == 0) goto L13
            r0 = r7
            ajtx r0 = (defpackage.ajtx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajtx r0 = new ajtx
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fuzb r1 = defpackage.fuzb.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2b:
            defpackage.fuve.b(r7)
            goto L76
        L2f:
            defpackage.fuve.b(r7)
            com.android.settingslib.widget.BannerMessagePreference r7 = r6.L()
            android.content.Context r2 = r6.requireContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            android.text.BidiFormatter r2 = android.text.BidiFormatter.getInstance(r2)
            java.lang.String r4 = android.os.Build.MODEL
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            java.lang.String r2 = r2.unicodeWrap(r4, r5)
            java.lang.String r4 = "unicodeWrap(...)"
            defpackage.fvbo.e(r2, r4)
            r7.S(r2)
            com.android.settingslib.widget.BannerMessagePreference r7 = r6.L()
            r2 = 2131099841(0x7f0600c1, float:1.7812047E38)
            r7.ag(r2)
            ajut r7 = r6.M()
            fvrx r7 = r7.f
            ajua r2 = new ajua
            r2.<init>(r6)
            r0.c = r3
            java.lang.Object r7 = r7.nB(r2, r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            fuuv r7 = new fuuv
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.settings.overview.BackupSettingsOverviewFragment.N(fuyp):java.lang.Object");
    }

    @Override // defpackage.ngn, defpackage.kmb, defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        fvbo.f(view, "view");
        super.onViewCreated(view, bundle);
        ajqs.b(this, new ajuk(this, null));
    }
}
