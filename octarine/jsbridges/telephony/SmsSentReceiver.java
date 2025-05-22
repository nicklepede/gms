package com.google.android.gms.octarine.jsbridges.telephony;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Base64;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cvcc;
import defpackage.cvcj;
import defpackage.cvck;
import defpackage.euvy;
import defpackage.euwp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SmsSentReceiver extends TracingBroadcastReceiver {
    private final String a;
    private final cvcc b;

    public SmsSentReceiver(IntentFilter intentFilter, cvcc cvccVar) {
        super("octarine-smssent-receiver");
        this.a = intentFilter.getAction(0);
        this.b = cvccVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        String action;
        cvck cvckVar;
        if (intent == null || (action = intent.getAction()) == null || !action.equals(this.a)) {
            return;
        }
        int resultCode = getResultCode();
        boolean z = false;
        int intExtra = intent.getIntExtra("callbackId", 0);
        intent.getStringExtra("messagePart");
        String stringExtra = intent.getStringExtra("requestId");
        int intExtra2 = intent.getIntExtra("numberOfMessageParts", 1);
        Map map = this.b.a.d;
        Integer valueOf = Integer.valueOf(intExtra);
        if (!map.containsKey(valueOf) || (cvckVar = (cvck) map.get(valueOf)) == null) {
            return;
        }
        cvcj cvcjVar = null;
        if (stringExtra != null) {
            Iterator it = cvckVar.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cvcj cvcjVar2 = (cvcj) it.next();
                if (cvcjVar2.a.equals(stringExtra)) {
                    cvcjVar = cvcjVar2;
                    break;
                }
            }
        }
        if (cvcjVar == null) {
            cvckVar.a(cvck.b(cvckVar.b));
        } else {
            if (resultCode == -1) {
                cvcjVar.b++;
            } else {
                cvcjVar.c++;
            }
            if (cvcjVar.b + cvcjVar.c == intExtra2) {
                cvcjVar.d = true;
            }
            List list = cvckVar.e;
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!((cvcj) it2.next()).d) {
                        return;
                    }
                }
            }
            fgrc v = euwp.a.v();
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                cvcj cvcjVar3 = (cvcj) it3.next();
                fgrc v2 = euvy.a.v();
                String str = cvcjVar3.a;
                if (!v2.b.L()) {
                    v2.U();
                }
                fgri fgriVar = v2.b;
                euvy euvyVar = (euvy) fgriVar;
                str.getClass();
                boolean z2 = z;
                euvyVar.b |= 1;
                euvyVar.c = str;
                int i = cvcjVar3.c == 0 ? 2 : 3;
                if (!fgriVar.L()) {
                    v2.U();
                }
                euvy euvyVar2 = (euvy) v2.b;
                euvyVar2.d = i - 1;
                euvyVar2.b |= 2;
                euvy euvyVar3 = (euvy) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                euwp euwpVar = (euwp) v.b;
                euvyVar3.getClass();
                fgsa fgsaVar = euwpVar.b;
                if (!fgsaVar.c()) {
                    euwpVar.b = fgri.E(fgsaVar);
                }
                euwpVar.b.add(euvyVar3);
                z = z2;
            }
            boolean z3 = z;
            euwp euwpVar2 = (euwp) v.Q();
            int i2 = cvckVar.b;
            Object[] objArr = new Object[1];
            objArr[z3 ? 1 : 0] = Base64.encodeToString(euwpVar2.r(), 2);
            String format = String.format("\"%s\"", objArr);
            Locale locale = Locale.ROOT;
            Integer valueOf2 = Integer.valueOf(i2);
            Boolean valueOf3 = Boolean.valueOf(z3);
            Object[] objArr2 = new Object[3];
            objArr2[z3 ? 1 : 0] = valueOf2;
            objArr2[1] = format;
            objArr2[2] = valueOf3;
            cvckVar.a(String.format(locale, "window.ocTelephonyCallback(%s, %s, %s)", objArr2));
        }
        map.remove(valueOf);
    }
}
