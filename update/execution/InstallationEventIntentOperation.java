package com.google.android.gms.update.execution;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.update.execution.InstallationEventIntentOperation;
import defpackage.arxo;
import defpackage.dhfe;
import defpackage.dhfx;
import defpackage.dhjt;
import defpackage.dhoh;
import defpackage.eiho;
import defpackage.eitj;
import defpackage.fqtn;
import defpackage.fqug;
import java.util.Deque;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class InstallationEventIntentOperation extends IntentOperation {
    public static final arxo a = dhjt.e("InstallationEventIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Integer num;
        if (!"com.google.android.gms.update.INSTALLATION_EVENT".equals(intent.getAction())) {
            return;
        }
        if (!dhfe.b(this)) {
            fqug.c();
            return;
        }
        dhfx dhfxVar = (dhfx) dhfx.b.b();
        eiho eihoVar = new eiho() { // from class: dhgy
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                Integer num2 = (Integer) obj;
                arxo arxoVar = InstallationEventIntentOperation.a;
                fqug.c();
                num2.intValue();
                if (dhfy.a.contains(num2)) {
                    InstallationEventIntentOperation.a.j("Ignoring event of type %d.", num2);
                    return null;
                }
                InstallationEventIntentOperation.a.h("Handling event of type %d.", num2);
                dhgw dhgwVar = (dhgw) dhgw.b.b();
                int intValue = num2.intValue();
                new Bundle();
                synchronized (dhgwVar.f) {
                    try {
                        if (intValue == 102) {
                            dhgwVar.d.c(dhgz.a);
                            dhgt dhgtVar = dhgwVar.h;
                            if (dhgtVar != null) {
                                dhgwVar.i = true;
                                dhgtVar.d();
                            } else {
                                dhgwVar.b();
                                Context context = dhgwVar.c;
                                context.startService(dhgo.d(context));
                            }
                            return null;
                        }
                        if (intValue == 115) {
                            fqss.c();
                            intValue = 115;
                        }
                        dhgt dhgtVar2 = dhgwVar.h;
                        if (dhgtVar2 == null) {
                            Context context2 = dhgwVar.c;
                            context2.startService(dhgo.d(context2));
                        } else if (!dhgtVar2.e(intValue)) {
                            dhgwVar.i = true;
                        }
                        return null;
                    } finally {
                    }
                }
            }
        };
        if (!fqtn.a.a().a()) {
            synchronized (dhfxVar.d) {
                while (true) {
                    Deque deque = dhfxVar.e;
                    if (!deque.isEmpty()) {
                        Integer num2 = (Integer) deque.getFirst();
                        num2.intValue();
                        try {
                            eihoVar.apply(num2);
                            deque.removeFirst();
                            dhfxVar.c.e(new dhoh(dhfx.a, eitj.i(deque)));
                        } catch (Throwable th) {
                            Deque deque2 = dhfxVar.e;
                            deque2.removeFirst();
                            dhfxVar.c.e(new dhoh(dhfx.a, eitj.i(deque2)));
                            throw th;
                        }
                    }
                }
            }
            return;
        }
        while (true) {
            synchronized (dhfxVar.d) {
                Deque deque3 = dhfxVar.e;
                if (deque3.isEmpty()) {
                    return;
                }
                num = (Integer) deque3.removeFirst();
                dhfxVar.c.e(new dhoh(dhfx.a, eitj.i(deque3)));
            }
            eihoVar.apply(num);
        }
    }
}
