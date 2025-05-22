package com.google.android.gms.fido.authenticator.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bdhf;
import defpackage.beov;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.ryb;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class QRBounceChimeraActivity extends ryb {
    private static final ausn h = beov.a("QRBounceChimeraActivity");

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        onNewIntent(getIntent());
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        String scheme;
        super.onNewIntent(intent);
        String action = intent.getAction();
        Uri data = intent.getData();
        if (action == null || !action.equals("android.intent.action.VIEW") || data == null || (scheme = data.getScheme()) == null || !scheme.toLowerCase(Locale.US).equals("fido")) {
            ((eluo) ((eluo) h.j()).ai((char) 3808)).B("Invalid data from scanning QR Code: %s", intent.getData());
            finish();
            return;
        }
        setTheme(R.style.fidoAuthenticatorTransparentTheme);
        ekvi ekviVar = ektg.a;
        if (auub.e()) {
            Uri data2 = intent.getData();
            Intent intent2 = new Intent();
            intent2.setClassName(AppContextProvider.a(), "com.google.android.gms.fido.fido2.ui.hybrid.HybridAuthenticateActivity");
            intent2.setData(data2);
            ekviVar = ekvi.j(intent2);
        } else {
            ekvi a = bdhf.a(this);
            if (a.h()) {
                Object c = a.c();
                Uri data3 = intent.getData();
                Intent intent3 = new Intent();
                intent3.setComponent(new ComponentName((String) c, "org.chromium.chrome.browser.webauth.authenticator.CableAuthenticatorActivity"));
                intent3.setAction("android.intent.action.VIEW");
                intent3.setData(data3);
                intent3.setFlags(537001984);
                ekviVar = ekvi.j(intent3);
            }
        }
        if (ekviVar.h()) {
            startActivity((Intent) ekviVar.c());
        }
        finish();
    }
}
