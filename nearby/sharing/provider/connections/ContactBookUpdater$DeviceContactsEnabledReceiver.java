package com.google.android.gms.nearby.sharing.provider.connections;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.provider.connections.ContactBookUpdater$DeviceContactsEnabledReceiver;
import defpackage.cojp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactBookUpdater$DeviceContactsEnabledReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ cojp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactBookUpdater$DeviceContactsEnabledReceiver(cojp cojpVar) {
        super("nearby", "DeviceContactsEnabledReceiver");
        this.a = cojpVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(final Context context, Intent intent) {
        this.a.d(new Runnable() { // from class: cojn
            @Override // java.lang.Runnable
            public final void run() {
                cojp cojpVar = ContactBookUpdater$DeviceContactsEnabledReceiver.this.a;
                Account c = cojpVar.b.c();
                if (c == null) {
                    return;
                }
                Context context2 = context;
                cmdi cmdiVar = new cmdi();
                cmdiVar.b = 1;
                cmdiVar.a = 18;
                ensj.t(cojpVar.b(c, true, new cmdj(cmdiVar)), new cojo(context2), cojpVar.f);
            }
        });
    }
}
