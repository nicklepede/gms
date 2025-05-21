package com.google.android.gms.fido.authenticator.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bbdi;
import defpackage.bcni;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.qex;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class QRBounceChimeraActivity extends qex {
    private static final asot h = bcni.a("QRBounceChimeraActivity");

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        onNewIntent(getIntent());
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        String scheme;
        super.onNewIntent(intent);
        String action = intent.getAction();
        Uri data = intent.getData();
        if (action == null || !action.equals("android.intent.action.VIEW") || data == null || (scheme = data.getScheme()) == null || !scheme.toLowerCase(Locale.US).equals("fido")) {
            ((ejhf) ((ejhf) h.j()).ah((char) 3802)).B("Invalid data from scanning QR Code: %s", intent.getData());
            finish();
            return;
        }
        setTheme(R.style.fidoAuthenticatorTransparentTheme);
        eiid eiidVar = eigb.a;
        if (asqh.e()) {
            Uri data2 = intent.getData();
            Intent intent2 = new Intent();
            intent2.setClassName(AppContextProvider.a(), "com.google.android.gms.fido.fido2.ui.hybrid.HybridAuthenticateActivity");
            intent2.setData(data2);
            eiidVar = eiid.j(intent2);
        } else {
            eiid a = bbdi.a(this);
            if (a.h()) {
                Object c = a.c();
                Uri data3 = intent.getData();
                Intent intent3 = new Intent();
                intent3.setComponent(new ComponentName((String) c, "org.chromium.chrome.browser.webauth.authenticator.CableAuthenticatorActivity"));
                intent3.setAction("android.intent.action.VIEW");
                intent3.setData(data3);
                intent3.setFlags(537001984);
                eiidVar = eiid.j(intent3);
            }
        }
        if (eiidVar.h()) {
            startActivity((Intent) eiidVar.c());
        }
        finish();
    }
}
