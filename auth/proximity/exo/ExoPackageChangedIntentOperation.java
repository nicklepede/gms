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
import defpackage.aciy;
import defpackage.acjm;
import defpackage.ackk;
import defpackage.acku;
import defpackage.acvm;
import defpackage.aczy;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.asnd;
import defpackage.fecj;
import defpackage.flcw;
import defpackage.rkt;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ExoPackageChangedIntentOperation extends IntentOperation {
    private static final arxo a = new arxo("ProximityAuth", "ExoPackageChangedIntentOperation");

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
        arxo arxoVar = acjm.a;
        if (TextUtils.equals("com.google.ambient.streaming", a2)) {
            if (a2 != null) {
                a.h("Handling intent: %s for Exo packageName: %s", action, a2);
            }
            startService(BetterTogetherFeatureSupportIntentOperation.a(getBaseContext()));
            if ("android.intent.action.PACKAGE_REMOVED".equals(action) && intent.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)) {
                Iterator it = asnd.h(getBaseContext(), getBaseContext().getPackageName()).iterator();
                while (it.hasNext()) {
                    acvm.a(((Account) it.next()).name).k(false);
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
            if (flcw.s()) {
                acku a2 = acku.a(AppContextProvider.a());
                String a3 = a(intent);
                arxo arxoVar = acku.a;
                arxoVar.h("Package added: (user=%s) %s", Process.myUserHandle(), a3);
                if (a3 != null) {
                    aczy b = a2.c.b(a3, Process.myUserHandle());
                    if (b == null) {
                        arxoVar.m("Cannot get app info for package (user=%s) %s", Process.myUserHandle(), a3);
                        return;
                    }
                    a2.b.c(b);
                    if (a2.b()) {
                        try {
                            aciy aciyVar = a2.d;
                            arwm.s(aciyVar);
                            aciyVar.a().a(b);
                            return;
                        } catch (rkt e) {
                            acku.a.g("Profile unavailable", e, new Object[0]);
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
        if (flcw.s() && intent.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)) {
            acku a4 = acku.a(AppContextProvider.a());
            String a5 = a(intent);
            acku.a.h("Package removed: (user=%s) %s", Process.myUserHandle(), a5);
            if (a5 != null) {
                fecj v = aczy.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                ((aczy) v.b).c = a5;
                long identifier = Process.myUserHandle().getIdentifier();
                if (!v.b.L()) {
                    v.U();
                }
                ((aczy) v.b).f = identifier;
                aczy aczyVar = (aczy) v.Q();
                ackk ackkVar = a4.b;
                ackk.e(aczyVar);
                if (a4.b()) {
                    try {
                        aciy aciyVar2 = a4.d;
                        arwm.s(aciyVar2);
                        aciyVar2.a().b(aczyVar);
                    } catch (rkt e2) {
                        acku.a.g("Profile unavailable", e2, new Object[0]);
                    }
                }
            }
        }
    }

    ExoPackageChangedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
