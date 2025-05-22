package com.google.android.gms.accountsettings.ui;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.R;
import defpackage.aura;
import defpackage.auur;
import defpackage.ekus;
import defpackage.elhz;
import defpackage.euwz;
import defpackage.fmkf;
import defpackage.utk;
import defpackage.uto;
import defpackage.utr;
import defpackage.utt;
import defpackage.uuf;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SettingsLoaderChimeraActivity extends utk {
    private static final elhz s = elhz.K("org.mozilla.firefox", "com.android.chrome");
    boolean r;

    private final int D() {
        Uri parse;
        String stringExtra = getIntent() != null ? getIntent().getStringExtra("extra.fallbackUrl") : null;
        if (stringExtra == null) {
            return 1;
        }
        Intent intent = getIntent();
        if (!Pattern.matches(fmkf.a.lK().x(), stringExtra) || intent == null) {
            u(getString(R.string.accountsettings_error_retry_notice), getString(R.string.common_something_went_wrong), uuf.a(8));
            return 2;
        }
        if (intent.getBooleanExtra("extra.fallbackAuth", false)) {
            String stringExtra2 = intent.getStringExtra("extra.accountName");
            String queryParameter = Uri.parse(stringExtra).getQueryParameter("hl");
            Uri.Builder appendQueryParameter = Uri.parse(fmkf.i()).buildUpon().appendQueryParameter("continue", stringExtra);
            if (!auur.d(stringExtra2)) {
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
        utr.b(uto.a, this.j, this.q).d(intent.getIntExtra("extra.screenId", 1), euwz.ASMM_FALLBACK_TO_WEB, m());
        startActivity(intent2);
        o();
        return 2;
    }

    @Override // defpackage.utk
    public final int A() {
        return D();
    }

    @Override // defpackage.utk
    public final int B() {
        return D();
    }

    @Override // defpackage.utk
    protected final int C() {
        return this.r ? 2 : 4;
    }

    @Override // defpackage.utk
    public final String m() {
        return this.r ? "web" : aura.q(this);
    }

    @Override // defpackage.utk
    protected final void r() {
        utt uttVar = this.o;
        if (uttVar != null) {
            if (this.r) {
                uttVar.d(this.l, euwz.ASMM_LAUNCHED_FROM_WEB, m());
            } else {
                uttVar.d(this.l, euwz.ASMM_LAUNCHED_FROM_FIRST_PARTY, m());
            }
        }
    }

    @Override // defpackage.utk
    protected final boolean x() {
        Intent intent = getIntent();
        if (intent != null && ekus.a(intent.getAction(), "com.google.android.gms.accountsettings.action.BROWSE_SETTINGS")) {
            this.r = true;
            return Pattern.matches(fmkf.a.lK().w(), String.valueOf(intent.getIntExtra("extra.screenId", -1)));
        }
        try {
            aura.B(this);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.utk
    protected final boolean y() {
        Intent intent = getIntent();
        return (intent == null || ekus.a(intent.getAction(), "com.google.android.gms.accountsettings.action.BROWSE_SETTINGS")) ? false : true;
    }

    @Override // defpackage.utk
    public final int z() {
        if (this.r) {
            return D();
        }
        return 1;
    }
}
