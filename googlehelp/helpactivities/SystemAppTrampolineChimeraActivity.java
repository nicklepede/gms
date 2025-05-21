package com.google.android.gms.googlehelp.helpactivities;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.bajh;
import defpackage.bivr;
import defpackage.bjaw;
import defpackage.bjay;
import defpackage.bjbk;
import defpackage.bjij;
import defpackage.bry;
import defpackage.ejhf;
import defpackage.folg;
import defpackage.qfp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SystemAppTrampolineChimeraActivity extends qfp {
    private static final asot j = asot.b("gH_SystemAppTrampoline", asej.GOOGLE_HELP);
    private static final Set k = new HashSet();
    private static int l;
    private bjay m;
    private HelpConfig n;

    private final void a(int i, int i2) {
        bjbk.A(68, i, this, this.n, this.m);
        bjaw.z(this, this.n, 76, i2);
        bjij.l(this, Uri.parse(folg.z()), this.n, this.m);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String q = asng.q(this);
        PackageManager packageManager = getPackageManager();
        this.m = new bjay(this);
        HelpConfig d = HelpConfig.d(new GoogleHelp("systemAppTrampolineActivity"), this);
        this.n = d;
        d.b = q;
        bjbk.A(66, 1, this, d, this.m);
        bjaw.z(this, this.n, 74, 1);
        if (!packageManager.hasSystemFeature("com.google.android.feature.GOOGLE_EXPERIENCE")) {
            a(33, 79);
            return;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(q, 0);
            if (applicationInfo == null || (applicationInfo.flags & 1) == 0) {
                a(35, 81);
                return;
            }
            String ae = folg.a.a().ae();
            if (ae.hashCode() != l) {
                Set set = k;
                set.clear();
                Collections.addAll(set, bivr.y(ae));
                l = ae.hashCode();
            }
            if (!k.contains(q)) {
                a(36, 82);
                return;
            }
            Intent intent = getIntent();
            GoogleHelp googleHelp = new GoogleHelp(intent.hasExtra("EXTRA_CONTEXT") ? intent.getStringExtra("EXTRA_CONTEXT") : "");
            googleHelp.D = this.n.e;
            ThemeSettings themeSettings = new ThemeSettings();
            int intExtra = intent.getIntExtra("EXTRA_THEME", -1);
            if (intExtra != -1) {
                themeSettings.a = intExtra;
            }
            int intExtra2 = intent.getIntExtra("EXTRA_PRIMARY_COLOR", -1);
            if (intExtra2 != -1) {
                themeSettings.b = intExtra2;
            }
            googleHelp.s = themeSettings;
            String[] stringArrayExtra = intent.getStringArrayExtra("EXTRA_PSD_KEYS");
            String[] stringArrayExtra2 = intent.getStringArrayExtra("EXTRA_PSD_VALUES");
            if (stringArrayExtra != null && stringArrayExtra2 != null) {
                int length = stringArrayExtra2.length;
                int length2 = stringArrayExtra.length;
                if (length2 == length) {
                    bry bryVar = new bry(length2);
                    for (int i = 0; i < length2; i++) {
                        bryVar.put(stringArrayExtra[i], stringArrayExtra2[i]);
                    }
                    googleHelp.e(bryVar);
                }
            }
            String[] stringArrayExtra3 = intent.getStringArrayExtra("EXTRA_FEEDBACK_PSD_KEYS");
            String[] stringArrayExtra4 = intent.getStringArrayExtra("EXTRA_FEEDBACK_PSD_VALUES");
            if (stringArrayExtra3 != null && stringArrayExtra4 != null) {
                int length3 = stringArrayExtra4.length;
                int length4 = stringArrayExtra3.length;
                if (length4 == length3) {
                    bajh bajhVar = new bajh();
                    for (int i2 = 0; i2 < length4; i2++) {
                        bajhVar.c(stringArrayExtra3[i2], stringArrayExtra4[i2]);
                    }
                    googleHelp.d(bajhVar.a(), getCacheDir());
                }
            }
            Account account = (Account) intent.getParcelableExtra("EXTRA_ACCOUNT");
            if (account != null) {
                googleHelp.c = account;
            }
            googleHelp.e = asng.q(this);
            bjbk.A(67, 1, this, this.n, this.m);
            bjaw.z(this, this.n, 75, 1);
            startActivityForResult(googleHelp.a(), 0);
            finish();
        } catch (PackageManager.NameNotFoundException unused) {
            ((ejhf) j.i()).B("Error trying to get the application info for %s", q);
            a(34, 80);
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        bjay bjayVar = this.m;
        if (bjayVar != null) {
            bjayVar.close();
        }
        super.onDestroy();
    }
}
