package com.google.android.gms.octarine.jsbridges.telephony;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Base64;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cssx;
import defpackage.cste;
import defpackage.cstf;
import defpackage.esgk;
import defpackage.esha;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SmsSentReceiver extends TracingBroadcastReceiver {
    private final String a;
    private final cssx b;

    public SmsSentReceiver(IntentFilter intentFilter, cssx cssxVar) {
        super("octarine-smssent-receiver");
        this.a = intentFilter.getAction(0);
        this.b = cssxVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        String action;
        cstf cstfVar;
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
        if (!map.containsKey(valueOf) || (cstfVar = (cstf) map.get(valueOf)) == null) {
            return;
        }
        cste csteVar = null;
        if (stringExtra != null) {
            Iterator it = cstfVar.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cste csteVar2 = (cste) it.next();
                if (csteVar2.a.equals(stringExtra)) {
                    csteVar = csteVar2;
                    break;
                }
            }
        }
        if (csteVar == null) {
            cstfVar.a(cstf.b(cstfVar.b));
        } else {
            if (resultCode == -1) {
                csteVar.b++;
            } else {
                csteVar.c++;
            }
            if (csteVar.b + csteVar.c == intExtra2) {
                csteVar.d = true;
            }
            List list = cstfVar.e;
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!((cste) it2.next()).d) {
                        return;
                    }
                }
            }
            fecj v = esha.a.v();
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                cste csteVar3 = (cste) it3.next();
                fecj v2 = esgk.a.v();
                String str = csteVar3.a;
                if (!v2.b.L()) {
                    v2.U();
                }
                fecp fecpVar = v2.b;
                esgk esgkVar = (esgk) fecpVar;
                str.getClass();
                boolean z2 = z;
                esgkVar.b |= 1;
                esgkVar.c = str;
                int i = csteVar3.c == 0 ? 2 : 3;
                if (!fecpVar.L()) {
                    v2.U();
                }
                esgk esgkVar2 = (esgk) v2.b;
                esgkVar2.d = i - 1;
                esgkVar2.b |= 2;
                esgk esgkVar3 = (esgk) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                esha eshaVar = (esha) v.b;
                esgkVar3.getClass();
                fedh fedhVar = eshaVar.b;
                if (!fedhVar.c()) {
                    eshaVar.b = fecp.E(fedhVar);
                }
                eshaVar.b.add(esgkVar3);
                z = z2;
            }
            boolean z3 = z;
            esha eshaVar2 = (esha) v.Q();
            int i2 = cstfVar.b;
            Object[] objArr = new Object[1];
            objArr[z3 ? 1 : 0] = Base64.encodeToString(eshaVar2.r(), 2);
            String format = String.format("\"%s\"", objArr);
            Locale locale = Locale.ROOT;
            Integer valueOf2 = Integer.valueOf(i2);
            Boolean valueOf3 = Boolean.valueOf(z3);
            Object[] objArr2 = new Object[3];
            objArr2[z3 ? 1 : 0] = valueOf2;
            objArr2[1] = format;
            objArr2[2] = valueOf3;
            cstfVar.a(String.format(locale, "window.ocTelephonyCallback(%s, %s, %s)", objArr2));
        }
        map.remove(valueOf);
    }
}
