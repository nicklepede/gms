package com.google.android.gms.accountsettings.ui;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.R;
import defpackage.asng;
import defpackage.asqx;
import defpackage.eihn;
import defpackage.eiuu;
import defpackage.eshk;
import defpackage.fjue;
import defpackage.sxm;
import defpackage.sxq;
import defpackage.sxt;
import defpackage.sxv;
import defpackage.syh;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SettingsLoaderChimeraActivity extends sxm {
    private static final eiuu s = eiuu.K("org.mozilla.firefox", "com.android.chrome");
    boolean r;

    private final int D() {
        Uri parse;
        String stringExtra = getIntent() != null ? getIntent().getStringExtra("extra.fallbackUrl") : null;
        if (stringExtra == null) {
            return 1;
        }
        Intent intent = getIntent();
        if (!Pattern.matches(fjue.a.a().x(), stringExtra) || intent == null) {
            u(getString(R.string.accountsettings_error_retry_notice), getString(R.string.common_something_went_wrong), syh.a(8));
            return 2;
        }
        if (intent.getBooleanExtra("extra.fallbackAuth", false)) {
            String stringExtra2 = intent.getStringExtra("extra.accountName");
            String queryParameter = Uri.parse(stringExtra).getQueryParameter("hl");
            Uri.Builder appendQueryParameter = Uri.parse(fjue.h()).buildUpon().appendQueryParameter("continue", stringExtra);
            if (!asqx.d(stringExtra2)) {
                appendQueryParameter.appendQueryParameter("Email", stringExtra2);
            }
            if (queryParameter != null) {
                appendQueryParameter.appendQueryParameter("hl", queryParameter);
            }
            parse = appendQueryParameter.build();
        } else {
            parse = Uri.parse(stringExtra);
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", parse);
        intent2.addCategory("android.intent.category.BROWSABLE");
        String stringExtra3 = intent.getStringExtra("com.android.browser.application_id");
        if (s.contains(stringExtra3)) {
            intent2.setPackage(stringExtra3);
        }
        sxt.b(sxq.a, this.j, this.q).d(intent.getIntExtra("extra.screenId", 1), eshk.ASMM_FALLBACK_TO_WEB, m());
        startActivity(intent2);
        o();
        return 2;
    }

    @Override // defpackage.sxm
    public final int A() {
        return D();
    }

    @Override // defpackage.sxm
    public final int B() {
        return D();
    }

    @Override // defpackage.sxm
    protected final int C() {
        return this.r ? 2 : 4;
    }

    @Override // defpackage.sxm
    public final String m() {
        return this.r ? "web" : asng.q(this);
    }

    @Override // defpackage.sxm
    protected final void r() {
        sxv sxvVar = this.o;
        if (sxvVar != null) {
            if (this.r) {
                sxvVar.d(this.l, eshk.ASMM_LAUNCHED_FROM_WEB, m());
            } else {
                sxvVar.d(this.l, eshk.ASMM_LAUNCHED_FROM_FIRST_PARTY, m());
            }
        }
    }

    @Override // defpackage.sxm
    protected final boolean x() {
        Intent intent = getIntent();
        if (intent != null && eihn.a(intent.getAction(), "com.google.android.gms.accountsettings.action.BROWSE_SETTINGS")) {
            this.r = true;
            return Pattern.matches(asqx.c(fjue.a.a().w()), String.valueOf(intent.getIntExtra("extra.screenId", -1)));
        }
        try {
            asng.B(this);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.sxm
    protected final boolean y() {
        Intent intent = getIntent();
        return (intent == null || eihn.a(intent.getAction(), "com.google.android.gms.accountsettings.action.BROWSE_SETTINGS")) ? false : true;
    }

    @Override // defpackage.sxm
    public final int z() {
        if (this.r) {
            return D();
        }
        return 1;
    }
}
