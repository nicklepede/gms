package com.google.android.gms.nearby.sharing.provider.connections;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.provider.connections.ContactBookUpdater$DeviceContactsEnabledReceiver;
import defpackage.cqsk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactBookUpdater$DeviceContactsEnabledReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ cqsk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactBookUpdater$DeviceContactsEnabledReceiver(cqsk cqskVar) {
        super("nearby", "DeviceContactsEnabledReceiver");
        this.a = cqskVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(final Context context, Intent intent) {
        this.a.d(new Runnable() { // from class: cqsi
            @Override // java.lang.Runnable
            public final void run() {
                cqsk cqskVar = ContactBookUpdater$DeviceContactsEnabledReceiver.this.a;
                Account c = cqskVar.b.c();
                if (c == null) {
                    return;
                }
                Context context2 = context;
                colq colqVar = new colq();
                colqVar.b = 1;
                colqVar.a = 18;
                eqgc.t(cqskVar.b(c, true, new colr(colqVar)), new cqsj(context2), cqskVar.f);
            }
        });
    }
}
