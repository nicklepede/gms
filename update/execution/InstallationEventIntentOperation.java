package com.google.android.gms.update.execution;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.update.execution.InstallationEventIntentOperation;
import defpackage.auad;
import defpackage.djqk;
import defpackage.djrd;
import defpackage.djuz;
import defpackage.djzn;
import defpackage.ekut;
import defpackage.elgo;
import defpackage.ftoc;
import java.util.Deque;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InstallationEventIntentOperation extends IntentOperation {
    public static final auad a = djuz.e("InstallationEventIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Integer num;
        if (!"com.google.android.gms.update.INSTALLATION_EVENT".equals(intent.getAction())) {
            return;
        }
        if (!djqk.b(this)) {
            ftoc.c();
            return;
        }
        djrd djrdVar = (djrd) djrd.b.b();
        ekut ekutVar = new ekut() { // from class: djse
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                Integer num2 = (Integer) obj;
                auad auadVar = InstallationEventIntentOperation.a;
                ftoc.c();
                num2.intValue();
                if (djre.a.contains(num2)) {
                    InstallationEventIntentOperation.a.j("Ignoring event of type %d.", num2);
                    return null;
                }
                InstallationEventIntentOperation.a.h("Handling event of type %d.", num2);
                djsc djscVar = (djsc) djsc.b.b();
                int intValue = num2.intValue();
                new Bundle();
                synchronized (djscVar.f) {
                    try {
                        if (intValue == 102) {
                            djscVar.d.c(djsf.a);
                            djrz djrzVar = djscVar.h;
                            if (djrzVar != null) {
                                djscVar.i = true;
                                djrzVar.d();
                            } else {
                                djscVar.b();
                                Context context = djscVar.c;
                                context.startService(djru.d(context));
                            }
                            return null;
                        }
                        if (intValue == 115) {
                            ftmr.c();
                            intValue = 115;
                        }
                        djrz djrzVar2 = djscVar.h;
                        if (djrzVar2 == null) {
                            Context context2 = djscVar.c;
                            context2.startService(djru.d(context2));
                        } else if (!djrzVar2.e(intValue)) {
                            djscVar.i = true;
                        }
                        return null;
                    } finally {
                    }
                }
            }
        };
        while (true) {
            synchronized (djrdVar.d) {
                Deque deque = djrdVar.e;
                if (deque.isEmpty()) {
                    return;
                }
                num = (Integer) deque.removeFirst();
                djrdVar.c.e(new djzn(djrd.a, elgo.i(deque)));
            }
            ekutVar.apply(num);
        }
    }
}
