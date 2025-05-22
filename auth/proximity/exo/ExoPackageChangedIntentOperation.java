package com.google.android.gms.auth.proximity.exo;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.BetterTogetherFeatureSupportIntentOperation;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import defpackage.aeiy;
import defpackage.aejm;
import defpackage.aekk;
import defpackage.aeku;
import defpackage.aevm;
import defpackage.aezy;
import defpackage.atzb;
import defpackage.auad;
import defpackage.auqx;
import defpackage.fgrc;
import defpackage.fnuf;
import defpackage.tdx;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ExoPackageChangedIntentOperation extends IntentOperation {
    private static final auad a = new auad("ProximityAuth", "ExoPackageChangedIntentOperation");

    public ExoPackageChangedIntentOperation() {
    }

    private static String a(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        return data.getSchemeSpecificPart();
    }

    private final void b(Intent intent) {
        String action = intent.getAction();
        String a2 = a(intent);
        auad auadVar = aejm.a;
        if (TextUtils.equals("com.google.ambient.streaming", a2)) {
            if (a2 != null) {
                a.h("Handling intent: %s for Exo packageName: %s", action, a2);
            }
            startService(BetterTogetherFeatureSupportIntentOperation.a(getBaseContext()));
            if ("android.intent.action.PACKAGE_REMOVED".equals(action) && intent.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)) {
                Iterator it = auqx.h(getBaseContext(), getBaseContext().getPackageName()).iterator();
                while (it.hasNext()) {
                    aevm.a(((Account) it.next()).name).k(false);
                }
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode == -810471698) {
            if (action.equals("android.intent.action.PACKAGE_REPLACED")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 525384130) {
            if (hashCode == 1544582882 && action.equals("android.intent.action.PACKAGE_ADDED")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            b(intent);
            if (fnuf.s()) {
                aeku a2 = aeku.a(AppContextProvider.a());
                String a3 = a(intent);
                auad auadVar = aeku.a;
                auadVar.h("Package added: (user=%s) %s", Process.myUserHandle(), a3);
                if (a3 != null) {
                    aezy b = a2.c.b(a3, Process.myUserHandle());
                    if (b == null) {
                        auadVar.m("Cannot get app info for package (user=%s) %s", Process.myUserHandle(), a3);
                        return;
                    }
                    a2.b.c(b);
                    if (a2.b()) {
                        try {
                            aeiy aeiyVar = a2.d;
                            atzb.s(aeiyVar);
                            aeiyVar.a().a(b);
                            return;
                        } catch (tdx e) {
                            aeku.a.g("Profile unavailable", e, new Object[0]);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (c == 1) {
            b(intent);
            return;
        }
        if (c != 2) {
            return;
        }
        b(intent);
        if (fnuf.s() && intent.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)) {
            aeku a4 = aeku.a(AppContextProvider.a());
            String a5 = a(intent);
            aeku.a.h("Package removed: (user=%s) %s", Process.myUserHandle(), a5);
            if (a5 != null) {
                fgrc v = aezy.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                ((aezy) v.b).c = a5;
                long identifier = Process.myUserHandle().getIdentifier();
                if (!v.b.L()) {
                    v.U();
                }
                ((aezy) v.b).f = identifier;
                aezy aezyVar = (aezy) v.Q();
                aekk aekkVar = a4.b;
                aekk.e(aezyVar);
                if (a4.b()) {
                    try {
                        aeiy aeiyVar2 = a4.d;
                        atzb.s(aeiyVar2);
                        aeiyVar2.a().b(aezyVar);
                    } catch (tdx e2) {
                        aeku.a.g("Profile unavailable", e2, new Object[0]);
                    }
                }
            }
        }
    }

    ExoPackageChangedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
